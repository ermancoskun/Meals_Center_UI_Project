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

import java.util.List;

public class US_039_admin_earnings_merchant extends TestBaseRapor {
    SoftAssert softAssert=new SoftAssert();
    Admin_Dashboard admin=new Admin_Dashboard();
    @Test
    public void tc_3901(){

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

        extentTest.info("Tarayici kapatilir.");

        extentTest.pass("Admin anasayfasinda merchant earnings kayitlari listeleniyor.");
        softAssert.assertAll();

    }
    @Test
    public void tc_3902(){
        /*
         *Tarayıcı açılır.
         *Url e gidilir.
         *Administrator sayfasına login olunur.
         *Dahboard panelindeki 'Earnings' menusune tıklanır.
         *'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.
         *Yüklenen sayfada Merchantların total kazanç bilgisi olduğu doğrulanır.
         *Tarayici kapatılır.
         */

        extentTest = extentReports.createTest("TC_3902",
                "--------?????-----------");

        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));
        extentTest.info("Tarayıcı açılır, Url e gidilir, administrator sayfasına login olunur.");
        //
        admin.dasboardEarningsMenusu.click();
        extentTest.info("Dahboard panelindeki 'Earnings' menusune tıklanır.");
        //
        admin.dasboardMerchantEarningsMenusu.click();
        extentTest.info("'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.");
        //

/////////////!!!!!!!!!!!!!!!!!!!!!!!!//////////////(//p[@class="m-0 mr-2 text-muted"])[2]Merchant'arın total kazanç görülebilmeli

    }
    @Test
    public void test3(){
        /*
         *Tarayıcı açılır.
         *Url e gidilir.
         *Administrator sayfasına login olunur.
         *Dahboard panelindeki 'Earnings' menusune tıklanır.
         *'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.
         *Yüklenen sayfadaki listenin Merchant ve Balance bilgisine göre listelendiği doğrulanır.
         *Tarayici kapatılır.
         */
        ReusableMethods.adminLogin(ConfigReader.getProperty("duyguAdminName"),ConfigReader.getProperty("duyguAdminPassword"));

        //Dahboard panelindeki 'Earnings' menusune tıklanır.
        Admin_Dashboard admin=new Admin_Dashboard();
        admin.dasboardEarningsMenusu.click();
        admin.dasboardMerchantEarningsMenusu.click();

        admin.earningsMerchantSiralamaButonu.click();
        ReusableMethods.wait(0.1);

        List<WebElement> balansaGoreMerchantKazancListesi= Driver.getDriver().findElements(By.xpath("//tbody/tr/td/b"));

        for (int i = 0; i <balansaGoreMerchantKazancListesi.size() ; i++) {
            System.out.println(balansaGoreMerchantKazancListesi.get(i).getText());
        }

        List<WebElement> ismeGoreMerchantKazancListesi= Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        for (int i = 0; i <ismeGoreMerchantKazancListesi.size() ; i++) {
            System.out.println(ismeGoreMerchantKazancListesi.get(i).getText());
        }

    }
    @Test
    public void test4(){
        /*
         *Tarayıcı açılır.
         *Url e gidilir.
         *Administrator sayfasına login olunur.
         *Dahboard panelindeki 'Earnings' menusune tıklanır.
         *'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.
         *Yüklenen sayfadaki listede Merchant kazanclarının detay bilgisi olduğu doğrulanır.
         *Tarayici kapatılır.
         */
        //detay=//i[@class="zmdi zmdi-eye"][1]
    }
    @Test
    public void test5(){
        /*
         *Tarayıcı açılır.
         *Url e gidilir.
         *Administrator sayfasına login olunur.
         *Dahboard panelindeki 'Earnings' menusune tıklanır.
         *'Earnings' menusundeki 'Merchant Earnings' menusüne tıklanır.
         *Yüklenen sayfada listedeki merchantları aranabileceği searchbox olduğu doğrulanır.
         *Tarayici kapatılır.
         */
        // search = //input[@type="search"]
    }
}
