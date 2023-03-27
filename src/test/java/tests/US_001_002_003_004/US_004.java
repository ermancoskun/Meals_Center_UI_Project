package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004{

    @Test
    public void bodytest01(){

        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cookieAcceptButton.click();
        //Driver.getDriver().navigate().refresh();
        //ReusableMethods.waitForPageToLoad(5);
        //Assert.assertTrue(user_homepage.solAltMealscenterButonu.isDisplayed());
        //Driver.closeDriver();
        user_homepage.facebookButton.click();
    }

    @Test
    public void bodytest02(){
        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.waitForPageToLoad(5);
        //user_homepage.cookieAcceptButton.click();

        user_homepage.instagramButton.click();

        String expectedUrl="https://www.instagram.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }


}