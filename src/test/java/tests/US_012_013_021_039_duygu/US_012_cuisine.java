package tests.US_012_013_021_039_duygu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_012_cuisine {

    User_Homepage homepage=new User_Homepage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void cuisineTest1() {

        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        //Tarayıcı açılır.
        //Url e gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // Cookies kabul edilir.
        homepage.cookieAcceptButton.click();

        // Kullanıcı sayfasına login olunur.
        ortakMethodlar.loginMethodu();

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
        softAssert.assertTrue(flag>1);

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }
    }

    @Test
    public void cuisineTest2() {

        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        // Tarayıcı açılır.
        // Url e gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // Cookies kabul edilir.
        homepage.cookieAcceptButton.click();

        // Kullanıcı sayfasına login olunur.
        ortakMethodlar.loginMethodu();

        // Cuisines bölümünde farklı yerel mutfaklar seceneklerinin tıklanabilir oldugu dogrulanir.
        homepage.cuisinesShowMoreButton.click();
        List<WebElement> cuisineElemanlariTikla=Driver.getDriver().findElements(By.xpath("//div[@class='custom-control custom-checkbox']"));
        List<WebElement> cuisineElemanlariControl=Driver.getDriver().findElements(By.xpath("//div/input[@class='custom-control-input cuisine']"));
        for (int i = 12; i <cuisineElemanlariTikla.size() ; i++) {
            cuisineElemanlariTikla.get(i).click();
            softAssert.assertTrue(cuisineElemanlariControl.get(i).isSelected(),cuisineElemanlariTikla.get(i).getText()+" checkbox'i tıklanabilir degıl");
        }
        //Cuisines bölümündeki yerel mutfaklardan birine tıklanır.
        homepage.filterClearAllButton.click();
        homepage.japaneseCheckBox.click();
        ortakMethodlar.azBekle(0.1);

        //Tıklanan mutfak ismi ile gelen restaurantların mutfak isiminin uyumlu olduğu doğrulanır.
        String expectedMutfakFiltresi= ConfigReader.getProperty("mutfakType");
        String actualMutfakFiltresi=homepage.ilkRestaurantCuisineBilgisi.getText();
        softAssert.assertTrue(actualMutfakFiltresi.contains(expectedMutfakFiltresi),"Cuisine filtreleme boxları doğru yanıt vermiyor");

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }
    }
}
