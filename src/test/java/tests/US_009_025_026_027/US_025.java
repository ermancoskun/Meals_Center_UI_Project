package tests.US_009_025_026_027;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_025 {
    Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
    @BeforeClass
    public void setUp() {
        ReusableMethods.merchantLogin();
    }

    @AfterClass
    public void tearDown() {

        Driver.closeDriver();
    }

    @Test
    public void tc2501ItemSayfasinindogrulanamasi(){

        merchant_dashboard.foodelement.click();
        merchant_dashboard.itemsElement.click();
        Assert.assertTrue(merchant_dashboard.itemdogrulama.isDisplayed());
    }


    @Test
    public void tc2502itemAddnewbutton(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.foodelement.click();
        merchant_dashboard.itemsElement.click();
        Assert.assertTrue(merchant_dashboard.addNewButton.isDisplayed());

    }
    @Test
    public void tc2503itemAddneweklme(){
        Actions actions=new Actions(Driver.getDriver());
        merchant_dashboard.foodelement.click();
        merchant_dashboard.itemsElement.click();
        merchant_dashboard.addNewButton.click();
        String itemname="kebab";
        String ShortDescription="ala";
        String Itemprice="15";
        merchant_dashboard.itemname.sendKeys(itemname);
        actions.sendKeys(Keys.TAB)
                .sendKeys(ShortDescription)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Itemprice)
                //.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();
        merchant_dashboard.categorySavebutton.submit();
        Assert.assertTrue(merchant_dashboard.categorysuccesscreated.isDisplayed());


    }
    @Test
    public void tc2504UpdateButton(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.foodelement.click();
        merchant_dashboard.itemsElement.click();
       Assert.assertTrue(merchant_dashboard.updatebutton.isDisplayed());

    }
    @Test
    public void tc2505UpdateButton(){

        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.foodelement.click();
        merchant_dashboard.itemsElement.click();
        merchant_dashboard.updatebutton.click();
        String updateicerik="kebabs";
        merchant_dashboard.updateicerik.sendKeys(updateicerik);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        merchant_dashboard.updateSavebutton.submit();
        Assert.assertTrue(merchant_dashboard.updatesuccescreated.isDisplayed());


    }

}
