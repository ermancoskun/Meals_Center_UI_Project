package tests.US_005_030_031_032;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.Admin_Dashboard;
import pages.Merchant_Dashboard;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030 {





    User_Homepage userHomepage = new User_Homepage();
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @BeforeClass
    public void setUp() {
        merchant_dashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLogin();
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.scheduledLink.click();
    }

    @AfterClass
    public void close() {
        Driver.closeDriver();

    }


    @Test
    public void tc03001_scheduledGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.scheduledLink.isDisplayed());
    }

    @Test
    public void tc03002_scheduledSayfasiGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.scheduledBaslikText.isDisplayed());
    }

    @Test
    public void tc03003_completedTodaySayisiGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.completedTodayCount.isDisplayed());
    }

    @Test
    public void tc03004_acceptedRejectAssignButtonAktifligi() {
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.acceptedButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.rejectButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.assignDriverButton.isDisplayed());
    }

}