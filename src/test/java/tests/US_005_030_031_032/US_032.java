package tests.US_005_030_031_032;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseRaporClass;

public class US_032 extends TestBaseRaporClass {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setUp() {

        extentTest = extentReports.createTest("Merchant sayfasının acilmasi",
                "Merchant sayfasi acilmali");
        merchant_dashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLogin();
        merchant_dashboard.ordersLink.click();
        extentTest.info("Orders linkine tiklandi.");
        merchant_dashboard.allOrdersLink.click();
        extentTest.pass("All Orders sayfası acildi.");
    }

    @Test
    public void tc03201() {
        extentTest = extentReports.createTest("Size sayfasi testi", "Size sayfasi testi gorulmeli");
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.allOrdersLinkText.isDisplayed());

        extentTest.pass("Size sayfasi basarili bir sekildegoruldu.");
    }



}
