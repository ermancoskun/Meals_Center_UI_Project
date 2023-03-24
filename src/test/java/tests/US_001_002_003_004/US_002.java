package tests.US_001_002_003_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_002 {

    @Test
    public void test02(){

        User_Homepage user_homepage=new User_Homepage();

        Driver.getDriver().get(ConfigReader.getProperty("mealscenterHpUrl"));

        user_homepage.cookieAcceptButton.click();

        String expectedTitle= "Meals Center";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
