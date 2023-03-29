package tests.US_001_002_003_004;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_003 extends TestBaseRapor {
    User_Homepage user_homepage=new User_Homepage();
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Homepage Body Test");
        user_homepage=new User_Homepage();
        softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("Access to the homepage");
        user_homepage.cookieAcceptButton.click();
        extentTest.info("Cookies accepted");
        softAssert.assertTrue(user_homepage.americanButton.isDisplayed());
        softAssert.assertTrue(user_homepage.moreButton.isDisplayed());
        softAssert.assertTrue(user_homepage.upperLeftNavigateButton.isDisplayed());
        softAssert.assertTrue(user_homepage.popularNearBy.isDisplayed());
        softAssert.assertTrue(user_homepage.newRestaurant.isDisplayed());

        softAssert.assertAll();
    }
}
