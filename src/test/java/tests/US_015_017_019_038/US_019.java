package tests.US_015_017_019_038;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_019 extends TestBaseRapor {

    Merchant_Dashboard merchant = new Merchant_Dashboard();
    SoftAssert softAssert = new SoftAssert();


    @DataProvider
    public static Object[][] users() {

        Object[][] userList={{" ","1234567"},
                {"umisakehouseAdmin"," "},
                {"umisakehouseAdmin@gmail.com","0000000"},
                {"umisakehouseAdmingmail.com","1234567"},
                {"umisakehouseAdmin@gmail","A12345678"}};

        return userList;
    }

    @Test (groups = "smoke")
    public void merchantTest01() {
        merchant=new Merchant_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Restoran sahibinin Merchant panele erişebilmesi testi");
        softAssert.assertTrue(merchant.loginImage.isDisplayed());
        extentTest.info("Açılan sayfadaki resmin görünür olduğu doğrulandı");
        softAssert.assertTrue(merchant.textMerchantLogin.isDisplayed());
        extentTest.info("Merchant login yazısının görünürlüğü doğrulandı");
        softAssert.assertTrue(merchant.amblem.isDisplayed());
        extentTest.info("Meals center logosunun görünür olduğu doğrulandı");
        softAssert.assertTrue(merchant.usernameBox.isEnabled());
        extentTest.info("Username kutusunun erişilebilir olduğu doğrulandı");
        softAssert.assertTrue(merchant.passwordBox.isEnabled());
        extentTest.info("Password kutusunun erişilebilir olduğu doğrulandı");
        softAssert.assertTrue(merchant.rememberMeKutucuk.isEnabled());
        extentTest.info("Remember me yazısının yanındaki kutucuğun tıklanabilir olduğu doğrulandı");
        softAssert.assertTrue(merchant.playStoreLink.isDisplayed());
        extentTest.info("Application download (play store) butonunun görünürlüğü doğrulandı");
        softAssert.assertTrue(merchant.appStoreLink.isDisplayed());
        extentTest.info("Application download (app store) butonunun görünürlüğü doğrulandı");
        extentTest.pass("Restoran sahibinin Merchant panele erişebildiği doğrulandı");
        softAssert.assertAll();
    }

    @Test (groups = "smoke", dataProvider = "users")
    public void merchantTest02(String user,String password) {
        merchant=new Merchant_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Restoran sahibinin Merchant panele geçersiz bilgilerle giriş yapamaması testi");
        extentTest.info("Merchant giriş sayfasına gidildi");
        merchant.usernameBox.sendKeys(user + Keys.TAB);
        //extentTest.info("Username kutusuna geçersiz username yazıldı");
        merchant.passwordBox.sendKeys(password + Keys.ENTER);
        //extentTest.info("Password kutusuna geçersiz password yazıldı ve Sign in butonuna basıldı");
        softAssert.assertTrue(merchant.requiredText.isDisplayed());
        extentTest.info("Kutucukların altında 'değer girilmelidir' yazısı göründü");
        softAssert.assertTrue(merchant.incorrectText.isDisplayed());
        extentTest.info("Kutucukların altında 'yanlış kullanıcı adı ya da şifre' yazısı göründü");
        String actualUrl = ConfigReader.getProperty("merchantUrl");
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Geçersiz bilgilerle giriş yapılamadığı doğrulandı");
        softAssert.assertAll();

    }

    @Test (groups = "smoke")
    public void merchantTest03(){
        merchant=new Merchant_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test that the restaurant owner can log in to the Merchant dashboard with valid information");
        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));
        extentTest.info("Navigated to Merchant login page");
        ReusableMethods.wait(0.1);
        merchant.usernameBox.sendKeys(ConfigReader.getProperty("merchantUsername"));
        extentTest.info("Valid username typed in the username box");
        merchant.passwordBox.sendKeys(ConfigReader.getProperty("merchantPassword"));
        extentTest.info("Valid password typed in the Password box");
        merchant.signInButton.click();
        extentTest.info("Merchant sign in button clicked");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/merchant/dashboard";
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Verified login with valid information");
        softAssert.assertAll();
    }

    @BeforeMethod
    public void before(){
        merchant=new Merchant_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Access test to Merchant page");
        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));
        extentTest.info("Navigated to Merchant login page");

    }

    @AfterMethod
    public void tearDown(){
        merchant=new Merchant_Dashboard();
        softAssert = new SoftAssert();
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
