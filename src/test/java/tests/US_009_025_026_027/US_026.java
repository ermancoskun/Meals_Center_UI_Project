package tests.US_009_025_026_027;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_026 {

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
    public void tc2601NewordersGorunur(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.newordersbutton.click();
        Assert.assertTrue(merchant_dashboard.newordersdogrulama.isDisplayed());
    }
    @Test
    public void tc2602NewordersAccepted(){
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.newordersbutton.click();
        Assert.assertTrue(merchant_dashboard.acceptedButton.isDisplayed());
        merchant_dashboard.acceptedButton.click();


    }
    @Test
    public void tc2603NewordersReject(){
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.newordersbutton.click();
        Assert.assertTrue(merchant_dashboard.rejectbutton.isDisplayed());
        merchant_dashboard.rejectbutton.click();
        String reason="çoğ pahalı";
        merchant_dashboard.rejectReason.sendKeys(reason);
        merchant_dashboard.rejectOrder.click();

    }
    @Test
    public void tc2604newordersAddbutton(){
        String siparis="Sushi Ave Special (6 pcs)";
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.newordersbutton.click();
        Assert.assertTrue(merchant_dashboard.newordersAddbutton.isDisplayed());
        merchant_dashboard.newordersAddbutton.click();
        merchant_dashboard.addsearchbox.sendKeys(siparis);
        merchant_dashboard.addbuttonicerik.click();
        ReusableMethods.wait(2);
        merchant_dashboard.addorder.click();
        merchant_dashboard.addorderkapatma.click();



    }




}
