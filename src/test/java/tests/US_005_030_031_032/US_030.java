package tests.US_005_030_031_032;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.Merchant_Dashboard;
import utilities.*;

import static utilities.ReusableMethods.waitForClickablility;

public class US_030 extends TestBaseRaporClass {

    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    @BeforeClass
    public void setUp() {
        extentTest = extentReports.createTest("Merchant sayfasının acilmasi",
                "Merchant sayfasi acilmali");
        merchant_dashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLogin();
        merchant_dashboard.ordersLink.click();
        extentTest.info("Orders linkine tiklandi.");
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void tc03001_scheduledGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        extentTest = extentReports.createTest("Scheduled linki gorunurlugu testi",
                "Scheduled linki sayfada gorunmeli");
        ReusableMethods.waitForVisibility(merchant_dashboard.scheduledLink,2);
        Assert.assertTrue(merchant_dashboard.scheduledLink.isDisplayed());
        extentTest.pass("Scheduled linki gorunurlugu basarili bir sekilde test edildi.");
    }

    @Test
    public void tc03002_scheduledSayfasiGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        extentTest = extentReports.createTest("Scheduled sayfası gorunurlugu testi",
                "Scheduled sayfasi gorunmeli");
        merchant_dashboard.scheduledLink.click();
        extentTest.info("Scheduled linkine tiklanir.");
        Assert.assertTrue(merchant_dashboard.scheduledBaslikText.isDisplayed());
        extentTest.pass("Scheduled sayfasi gorunurlugu basarili bir sekilde test edildi.");
    }

    @Test
    public void tc03003_completedTodaySayisiGorunurlugu() {
        merchant_dashboard = new Merchant_Dashboard();
        extentTest = extentReports.createTest("Completed Today sayisi sorunurlugu testi",
                "Completed Today Sayisi  sayfada gorunmeli");
        merchant_dashboard.scheduledLink.click();
        extentTest.info("Scheduled linkine tiklanir.");
        Assert.assertTrue(merchant_dashboard.completedTodayCount.isDisplayed());
        extentTest.pass("Completed Today Sayisi Gorunurlugu basarili bir sekilde test edildi.");
    }

    @Test
    public void tc03004_acceptedRejectAssignButtonAktifligi() {
        merchant_dashboard = new Merchant_Dashboard();
        extentTest = extentReports.createTest("Accepted, Reject, Assign buttonlari aktifligi testi",
                "Accepted Reject Assign buttonlari aktif olmali");
        merchant_dashboard.scheduledLink.click();
        extentTest.info("Scheduled linkine tiklanir.");
        Assert.assertTrue(merchant_dashboard.acceptedButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.rejectButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.assignDriverButton.isDisplayed());
        extentTest.pass("Basarili sekilde Accepted, Reject, Assign buttonlari aktifligi test edildi");

    }

}