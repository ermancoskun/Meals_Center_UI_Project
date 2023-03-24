package tests.US_012_013_021_039_duygu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import pages.User_RestaurantUmiSakeHouse;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013_account_checkout {

    User_Homepage homepage=new User_Homepage();
    SoftAssert softAssert=new SoftAssert();
    User_RestaurantUmiSakeHouse restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();

    @Test
    public void cartTest1() {

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

        //Umi Sake Hause restaurant tıklanır.
        // Ilk ürün 'add to cart' butonu ile sepete eklenir.
        //Kullanıcı anasayfasindaki "Cart" butonuna tıkalnır.
        //Sepet sayfasının erişilebilirliği doğrulanır.
        //Kullanıcı anasayfasina geri dönülür
        //Kullanıcı anasayfasindaki "Çanta" resimli butonuna tıkalnır.//Sepet sayfasının erişilebilirliği doğrulanır.
        //Sepet bölümündeki tüm fonksiyonlarin çalışır olduğu doğrulanır.//Tarayici kapatılır.

    }
    public void sepeteUrunEklemeMethodu(){

        if (!(Driver.getDriver().getCurrentUrl().equals("https://qa.mealscenter.com/restaurants"))) {
            Driver.getDriver().get("https://qa.mealscenter.com/restaurants");
        }
        homepage.umiSakeHouseRestaurantButton.click();
        restaurantUmiSakeHouse.ilkUrunAddToCartButton.click();
    }


}
