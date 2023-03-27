package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.ReusableMethods;

public class US_004{

    @Test
    public void test01(){

        User_Homepage user_homepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cookieAcceptButton.click();
        Assert.assertTrue(user_homepage.solAltMealscenterButonu.isDisplayed());

        user_homepage.facebookButton.click();
    }


}