package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.*;

public class US_001 extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest=extentReports.createTest("deneme","deneme2");
        User_Homepage user_homepage=new User_Homepage();

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("homepage gidildi");
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cookieAcceptButton.click();
        // ReusableMethods.wait(2);
        Assert.assertTrue(user_homepage.mainBanner.isDisplayed());

        String expectedUrl= "https://qa.mealscenter.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("passed");
    }

    @Test
    public void test02(){
        ReusableMethods.goTouserHomePage();

    }
}
