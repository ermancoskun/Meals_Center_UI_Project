package tests.US_009_025_026_027;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_027 {
    Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
    @BeforeClass
    public void setUp() {
        ReusableMethods.merchantLogin();
    }

    /*@AfterClass
    public void tearDown() {

        Driver.closeDriver();
    }*/

    @Test
    public void tc2701ordersprocessing(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.orderProcessing.click();
        Assert.assertTrue( merchant_dashboard.orderprocessindogrulama.isDisplayed());

    }
    @Test
    public void tc2702readyforPickup(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.orderProcessing.click();
       Assert.assertTrue( merchant_dashboard.readyforpickupbutton.isDisplayed());
       ReusableMethods.wait(3);
       merchant_dashboard.readyforpickupbutton.click();


    }
    @Test
    public void deney(){
        merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.ordersLink.click();
        merchant_dashboard.newordersbutton.click();
       // String deney=merchant_dashboard.deney.getText();
       // System.out.println(deney);

    }
}
