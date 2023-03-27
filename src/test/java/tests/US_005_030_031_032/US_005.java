package tests.US_005_030_031_032;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.*;

public class US_005 extends TestBaseRapor {
    User_Homepage userHomepage=new User_Homepage();
    @BeforeMethod
    public void setUp(){
        userHomepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        userHomepage.signInButton.click();
    }


    @Test(priority = 1)
    public void tc00501_loginTestYanlisMailYanlisPassword(){
        extentTest=extentReports.createTest("Yanlis Mail, Yanlis Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameEmailVht"));
        extentTest.info("Yanlis mail girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        extentTest.info("Yanlis password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }


    @Test(priority = 2)
    public void tc00502_loginTestDogruMailYanlisPassword(){
        extentTest=extentReports.createTest("Dogru Mail, Yanlis Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameEmailVht"));
        extentTest.info("Dogru mail girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        extentTest.info("Yanlis password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }

    @Test(priority = 3)
    public void tc00503_loginTestYanlisMailDogruPassword(){
        extentTest=extentReports.createTest("Yanlis Mail, Dogru Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameEmailVht"));
        extentTest.info("Yanlis mail girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        extentTest.info("Dogru password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }

    @Test (priority = 4)
    public void tc00504_loginTestDogruMailDogruPassword(){
        extentTest=extentReports.createTest("Dogru Mail, Dogru Password testi","Login olunmali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameEmailVht"));
        extentTest.info("Dogru mail girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        extentTest.info("Dogru password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunduSimgesi,2);
        Assert.assertTrue(userHomepage.loginOlunduSimgesi.isDisplayed());
        extentTest.pass("Test basarili, login olundu.");
    }

    @Test (priority = 5)
    public void tc00505_loginTestYanlisTelNoYanlisPassword(){
        extentTest=extentReports.createTest("Yanlis telNo, Yanlis Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameTelNoVht"));
        extentTest.info("Yanlis telNo girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        extentTest.info("Yanlis password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }

    @Test(priority = 6)
    public void tc00506_loginTestDogruTelNoYanlisPassword(){
        extentTest=extentReports.createTest("Dogru telNo, Yanlis Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameTelNoVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        extentTest.info("Yanlis password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }

    @Test(priority = 7)
    public void tc00507_loginTestYanlisTelNoDogruPassword(){
        extentTest=extentReports.createTest("Yanlis telNo, Dogru Password testi","Login olunmamali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameTelNoVht"));
        extentTest.info("Yanlis telNo girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        extentTest.info("Dogru password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunamadiUyarisi,2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
        extentTest.pass("Test basarili, login olunmadi.");
    }

    @Test (priority = 8)
    public void tc00508_loginTestDogruTelNoDogruPassword(){
        extentTest=extentReports.createTest("Dogru telNo, Dogru Password testi","Login olunmali");
        userHomepage=new User_Homepage();
        extentTest.info("Login sayfasi acildi");
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameTelNoVht"));
        extentTest.info("Dogru telNo girildi.");
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        extentTest.info("Dogru password girildi.");
        userHomepage.loginSigninButton.click();
        extentTest.info("Signin buttonuna tiklandi.");
        ReusableMethods.waitForVisibility(userHomepage.loginOlunduSimgesi,2);
        Assert.assertTrue(userHomepage.loginOlunduSimgesi.isDisplayed());
        extentTest.pass("Test basarili, login olundu.");
    }

}
