package tests.US_001_002_003_004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import utilities.*;

public class US_002{

    @Test
    public void headertest01(){
        //extentTest=extentReports.createTest("","");
        User_Homepage user_homepage=new User_Homepage();

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        user_homepage.cookieAcceptButton.click();

        String expectedTitle= "Meals Center";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        Assert.assertTrue(user_homepage.mealscenterButton.isDisplayed());
        Assert.assertTrue(user_homepage.mainBanner.isDisplayed());
        Assert.assertTrue(user_homepage.headerScript.isDisplayed());

        Driver.closeDriver();
        //extentTest.pass("");
    }

    @Test
    public void headertest02(){
        //extentTest=extentReports.createTest("","");
        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cartLinki.click();
        Assert.assertTrue(user_homepage.cartScript.isDisplayed());
        Driver.closeDriver();
        //extentTest.pass("");
    }

    @Test
    public void headertest03(){
        //extentTest=extentReports.createTest("","");
        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cartImage.click();
        Assert.assertTrue(user_homepage.cartScript.isDisplayed());
        Driver.closeDriver();
        //extentTest.pass("");
    }

    @Test
    public void headertest04(){
        //extentTest=extentReports.createTest("","");
        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.signInButton.click();
        ReusableMethods.waitForPageToLoad(5);
        String expectedUrl="https://qa.mealscenter.com/account/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        Driver.closeDriver();
        //extentTest.pass("");
    }

    @Test
    public void headertest05(){
        //extentTest=extentReports.createTest("","");
        User_Homepage user_homepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cookieAcceptButton.click();
        user_homepage.searchBox.sendKeys("10001");
        user_homepage.searchBoxIlkElement.click();
        ReusableMethods.wait(3);
        String expectedZipCode="10001";
        String actualZipCode= user_homepage.restaurantsAdresSatiri.getText();
        Assert.assertTrue(actualZipCode.contains(expectedZipCode));
        Driver.closeDriver();
        //extentTest.pass("");
    }



}

