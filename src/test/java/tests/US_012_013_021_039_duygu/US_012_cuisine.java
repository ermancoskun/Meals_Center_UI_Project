package tests.US_012_013_021_039_duygu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_012_cuisine {

    User_Homepage homepage=new User_Homepage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void farkliYerelCuisineTesti() {
        homepage=new User_Homepage();
        softAssert=new SoftAssert();


        //Sayfadaki restaurant listesi alınır.
        List<WebElement> mutfakListesi=Driver.getDriver()
                .findElements(By.xpath("//div/span[@class='a-12 mr-1']"));

        //Listedeki restaurantlarin yerel mutfağının birbirinden farklı olduğu doğrulanır.
        int flag=0;
        for (int i = 0; i <mutfakListesi.size() ; i++) {
            if (!(mutfakListesi.get(0).getText().equals(mutfakListesi.get(i).getText()))){
                flag++;
                //Mutfaklar Listesinde birbirinden farkli mutfaklar varsa flag artacak
            }
        }
        //Birden farklı mutfakların birden fazla olması yeterli
        softAssert.assertTrue(flag>1,"Sayfada farklı yerel mutfaklara ait restauranlar mevcut degil");

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }

    }

    @Test
    public void cuisineFiltrelemeCheckBoxTesti() {
        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        // Cuisines bölümünde farklı yerel mutfaklar seceneklerinin tıklanabilir oldugu dogrulanir.
        homepage.cuisinesShowMoreButton.click();
        List<WebElement> cuisineElemanlariTikla=Driver.getDriver().findElements(By.xpath("//div[@class='custom-control custom-checkbox']"));
        List<WebElement> cuisineElemanlariControl=Driver.getDriver().findElements(By.xpath("//div/input[@class='custom-control-input cuisine']"));
        for (int i = 12; i <cuisineElemanlariTikla.size() ; i++) {
            cuisineElemanlariTikla.get(i).click();
            softAssert.assertTrue(cuisineElemanlariControl.get(i).isSelected(),cuisineElemanlariTikla.get(i).getText()+" checkbox'i aktif değil");
        }
        //Cuisines bölümündeki yerel mutfaklardan birine tıklanır.
        homepage.filterClearAllButton.click();
        homepage.japaneseCheckBox.click();
        ReusableMethods.wait(0.1);

        //Tıklanan mutfak ismi ile gelen restaurantların mutfak isiminin uyumlu olduğu doğrulanır.
        String expectedMutfakFiltresi= ConfigReader.getProperty("mutfakType");
        String actualMutfakFiltresi=homepage.ilkRestaurantCuisineBilgisi.getText();
        softAssert.assertTrue(actualMutfakFiltresi.contains(expectedMutfakFiltresi),"Cuisine filtrelemedeki "+ homepage.japaneseCheckBox.getText() +"checkbox'i doğru sonuc getirmiyor");

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }

    }
    @BeforeMethod
    public void beforeMethod(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        // Tarayıcı açılır.
        // Url e gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // Cookies kabul edilir.
        homepage.cookieAcceptButton.click();

        // Kullanıcı sayfasına login olunur.
        ReusableMethods.userLoginMethod("duyguUserName","duyguUserPassword");

        // Anasayfadaki teslimat adresi kutusuna gecerli posta kodu(=10001) girilir.
        homepage.adresButton.sendKeys(ConfigReader.getProperty("adres"));

        // Ilk satırdakı 10001 posta koduna tıklanır.
        homepage.adres10001.click();
    }

}
