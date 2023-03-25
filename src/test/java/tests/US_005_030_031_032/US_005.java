package tests.US_005_030_031_032;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_005 {
    User_Homepage userHomepage=new User_Homepage();
    @BeforeMethod
    public void setUp(){
        ReusableMethods.goTouserHomePage();
    }

    @AfterMethod
    public void close(){
        Driver.closeDriver();
    }

    @Test(priority = 1)
    public void tc00501_loginTestYanlisMailYanlisPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameEmailVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }


    @Test(priority = 2)
    public void tc00502_loginTestDogruMailYanlisPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameEmailVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }

    @Test(priority = 3)
    public void tc00503_loginTestYanlisMailDogruPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameEmailVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }

    @Test (priority = 4)
    public void tc00504_loginTestDogruMailDogruPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameEmailVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunduSimgesi.isDisplayed());
    }

    @Test (priority = 5)
    public void tc00505_loginTestYanlisTelNoYanlisPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameTelNoVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }

    @Test(priority = 6)
    public void tc00506_loginTestDogruTelNoYanlisPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameTelNoVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("yanlisPasswordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }

    @Test(priority = 7)
    public void tc00507_loginTestYanlisTelNoDogruPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("yanlisUsernameTelNoVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunamadiUyarisi.isDisplayed());
    }

    @Test (priority = 8)
    public void tc00508_loginTestDogruTelNoDogruPassword(){
        userHomepage=new User_Homepage();
        userHomepage.signInButton.click();
        userHomepage.usernameBox.sendKeys(ConfigReader.getProperty("usernameTelNoVht"));
        userHomepage.passwordBox.sendKeys(ConfigReader.getProperty("passwordUserVht"));
        userHomepage.loginSigninButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userHomepage.loginOlunduSimgesi.isDisplayed());
    }






}
