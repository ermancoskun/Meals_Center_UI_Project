package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002 {

    @Test
    public void test01(){

        User_Homepage user_homepage=new User_Homepage();

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        user_homepage.cookieAcceptButton.click();

        String expectedTitle= "Meals Center";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        Assert.assertTrue(user_homepage.mealscenterButton.isDisplayed());
        Assert.assertTrue(user_homepage.mainBanner.isDisplayed());
        Assert.assertTrue(user_homepage.headerScript.isDisplayed());

    }

    @Test
    public void test02(){
        User_Homepage user_homepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cartLinki.click();
        Assert.assertTrue(user_homepage.cartScript.isDisplayed());
    }

    @Test
    public void test03(){
        User_Homepage user_homepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.cartImage.click();
        Assert.assertTrue(user_homepage.cartScript.isDisplayed());
    }

    @Test
    public void test04(){
        User_Homepage user_homepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);
        user_homepage.signInButton.click();
        ReusableMethods.waitForPageToLoad(5);
        String expectedUrl="https://qa.mealscenter.com/account/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void test05(){
        User_Homepage user_homepage=new User_Homepage();
        ReusableMethods.goTouserHomePage();
        ReusableMethods.waitForPageToLoad(5);


    }



}

