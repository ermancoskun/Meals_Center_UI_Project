package tests.US_005_030_031_032;

import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030 {

    @Test
    public void baslama() {

    }


    @Test
    public void adminbaslama() {
        ReusableMethods.adminLogin("vahit.akpinar","123456");
    }

}
