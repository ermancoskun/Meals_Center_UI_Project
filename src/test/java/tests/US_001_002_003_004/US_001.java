package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.*;

public class US_001 extends TestBaseRapor {

    @Test
    public void homepageTest(){
        extentTest=extentReports.createTest("access to the website","Url and Main Banner visibility test");
        User_Homepage user_homepage=new User_Homepage();

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("access to the homepage");
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cookieAcceptButton.click();
        extentTest.info("Cookies accepted");

        Assert.assertTrue(user_homepage.mainBanner.isDisplayed());
        extentTest.info("Main Banner visibility tested");

        String expectedUrl= "https://qa.mealscenter.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Url test PASSED");
    }

}
