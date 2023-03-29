package tests.US_012_013_021_039_duygu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US_039_admin_earnings_merchant extends TestBaseRapor {
    SoftAssert softAssert=new SoftAssert();
    Admin_Dashboard admin=new Admin_Dashboard();
    @Test
    public void tc_3901_merchantEarningsSayfasiDogrulamaTesti(){
        softAssert=new SoftAssert();
        admin=new Admin_Dashboard();

        extentTest = extentReports.createTest("TC_3901",
                "Merchant Earnings sayfasi dogrulama testi");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        //
        List<WebElement> merchantKazancListesi= Driver.getDriver().findElements(By.xpath("//tbody/tr/td/b"));
        extentTest.info("Yüklenen sayfadan Merchantların kazanç listesi alinir.");
        //
        softAssert.assertTrue(merchantKazancListesi.size()>0,"Merchant kazanc listesinde hic merchant yok!");
        extentTest.info("Listede Merchant kayidinin olup olmadigi dogrulanir");
        //
        extentTest.info("Tarayici kapatilir.");
        //
        extentTest.pass("Admin anasayfasinda merchant earnings kayitlari listeleniyor.");
        //
        softAssert.assertAll();

    }
    @Test
    public void tc_3902_MerchantEarningsTotalBalanceTesti(){

        softAssert=new SoftAssert();
        admin=new Admin_Dashboard();

        extentTest = extentReports.createTest("TC_3902",
                "Merchant Earning sayfasi total balance testi");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        //
        softAssert.assertTrue(admin.earningsTotalBalanceBoxi.isDisplayed(),"Merchant total balance box'i gorunmuyor.");
        extentTest.info("Yüklenen sayfada Merchantların total kazanç bilgisinin gorunur oldugu doğrulanır.");
        //
        extentTest.info("Tarayici kapatilir.");
        //
        extentTest.pass("Merchant total kazanc bilgisi goruntulenebiliyor");
        //
        softAssert.assertAll();

    }
    @Test
    public void tc_3903_merchantKazancBilgileriSiralamaTesti(){

        softAssert=new SoftAssert();
        admin=new Admin_Dashboard();

        extentTest = extentReports.createTest("TC_3903",
                "Merchant kazanc bilgileri siralama testi");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        ////
        admin.earningsMerchantSiralamaButonu.click();
        ReusableMethods.wait(0.5);
        extentTest.info("Merchantlari isme gore siralamak icin 'Merchant' butonuna basilir.");
        //
        List<WebElement> ismeGoreMerchantKazancListesi= Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        extentTest.info("Siralanis olan merchant isim listesi alinir.");
        //
        ArrayList<String> siraliMerchantList = new ArrayList<>();
        for (int i = 0; i <ismeGoreMerchantKazancListesi.size() ; i++) {
            String merchant=ismeGoreMerchantKazancListesi.get(i).getText().toLowerCase();
            siraliMerchantList.add(merchant);
            System.out.println(siraliMerchantList.get(i));
        }
        List<String> controlList1 = new ArrayList<>(siraliMerchantList);
        Collections.sort(controlList1);
        softAssert.assertTrue(controlList1.equals(siraliMerchantList),
                "Merchant earnings sayfasindaki 'Merchant' butonu listeyi duzgun sekilde sıralamıyor.");
        extentTest.info("'Merchant' butonunun listeyi duzgun sekilde siraladigi dogrulanir.");
        ////
        admin.earningsBalanceSiralamaButonu.click();
        ReusableMethods.wait(0.5);
        extentTest.info("Merchantlari balance gore siralamak icin 'Balance' butonuna basilir.");
        //
        List<WebElement> balansaGoreMerchantKazancListesi= Driver.getDriver().findElements(By.xpath("//tbody/tr/td/b"));
        extentTest.info("Siralanis olan merchant balance listesi alinir.");
        //
        ArrayList<Integer> siraliBalanceList = new ArrayList<>();
        for (int i = 0; i <balansaGoreMerchantKazancListesi.size() ; i++) {
            String balance=balansaGoreMerchantKazancListesi.get(i).getText().replaceAll("\\D","");
            siraliBalanceList.add(Integer.parseInt(balance));
            System.out.println(balance);
        }
        List<Integer> controlList2 = new ArrayList<>(siraliBalanceList);
        Collections.sort(controlList2);
        softAssert.assertTrue(controlList2.equals(siraliBalanceList),
                "Merchant earnings sayfasindaki 'Balance' butonu listeyi duzgun sekilde sıralamıyor.");
        extentTest.info("'Balance' butonunun listeyi duzgun sekilde siraladigi dogrulanir.");
        ////
        extentTest.info("Tarayici kapatilir.");
        //
        extentTest.pass("Merchant kazanç listesi Merchant isimlerine ve Merchant balance'larına göre sıralanabiliyor");
        //
        softAssert.assertAll();

    }
    @Test
    public void tc_3904_merchantDetayBilgileriTesti(){

        softAssert=new SoftAssert();
        admin=new Admin_Dashboard();

        extentTest = extentReports.createTest("TC_3904",
                "Merchant detay bilgilerinin goruntulenmesi");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        //
        admin.merchantDetayBilgisiButonu.click();
        extentTest.info("Merchant detay bilgisi butonuna basilir.");
        //
        ReusableMethods.wait(0.2);
        softAssert.assertTrue(admin.merchantDetayBilgisiYazisi.isDisplayed(),"Merchant detay bilgisi yazisi goruntulenemiyor.");
        extentTest.info("Merchant detay bilgileri goruntulendigi dogrulanir");
        //
        extentTest.info("Tarayici kapatilir.");
        //
        extentTest.pass("Merchant detay bilgileri goruntulenebiliyor.");
        //
        softAssert.assertAll();

    }
    @Test
    public void tc_3905_merchantEarningSearchboxTesti(){

        softAssert=new SoftAssert();
        admin=new Admin_Dashboard();

        extentTest = extentReports.createTest("TC_3905",
                "Merchant earnings sayfasi searchbox testi");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        //
        softAssert.assertTrue(admin.merchantEarningsSearchbox.isEnabled(),"Merchant earnings sayfasindaki searchbox aktif degil");
        extentTest.info("Merchant earnings sayfasindaki searchbox'in aktif aldugu dogrulanir.");
        //
        extentTest.info("Tarayici kapatilir.");
        //
        extentTest.fail("Merchant earnings sayfasindaki searchbox'in aktif degil");
        //
        softAssert.assertAll();

    }
}
