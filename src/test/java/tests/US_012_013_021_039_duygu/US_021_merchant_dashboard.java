package tests.US_012_013_021_039_duygu;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_021_merchant_dashboard {
    SoftAssert softAssert = new SoftAssert();
    Merchant_Dashboard merchant = new Merchant_Dashboard();

    @Test
    public void test1() {

        softAssert = new SoftAssert();
        merchant = new Merchant_Dashboard();

        //Tarayıcı açılır.
        //Url e gidilir.
        //Merchant sayfasına login olunur.
        ReusableMethods.merchantLogin();

        //Dashboard panelinin görünür olduğu doğrulanır.
        softAssert.assertTrue(merchant.dasboardMenusununTamami.isDisplayed(), "Dashboard menusu gorunur degil");
        System.out.println(merchant.dasboardMenusununTamami.getText()); //>> paneldeki tum menuler yaziyor.

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }
    }

    @Test
    public void test2() {

        softAssert = new SoftAssert();
        merchant = new Merchant_Dashboard();

        //Tarayıcı açılır
        //Url e gidilir.
        //Merchant sayfasına login olunur.
        ReusableMethods.merchantLogin();

        //Paneline ait menulerin olduğu doğrulanır.
        softAssert.assertTrue(merchant.dashboardMenuButonu.isEnabled(), merchant.dashboardMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.merchantMenuButonu.isEnabled(), merchant.dashboardMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.ordersMenuButonu.isEnabled(), merchant.ordersMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.attributesMenuButonu.isEnabled(), merchant.attributesMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.foodMenuButonu.isEnabled(), merchant.foodMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.orderTypeMenuButonu.isEnabled(), merchant.orderTypeMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.paymentGatewayMenuButonu.isEnabled(), merchant.paymentGatewayMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.promoMenuButonu.isEnabled(), merchant.promoMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.imagesMenuButonu.isEnabled(), merchant.imagesMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.accountMenuButonu.isEnabled(), merchant.accountMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.buyersMenuButonu.isEnabled(), merchant.buyersMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.usersMenuButonu.isEnabled(), merchant.usersMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.reportsMenuButonu.isEnabled(), merchant.reportsMenuButonu.getText() + " menusu aktif değil.");
        softAssert.assertTrue(merchant.inventoryManagementMenuButonu.isEnabled(), merchant.inventoryManagementMenuButonu.getText() + " menusu aktif değil.");


        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }
    }
}
