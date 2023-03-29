
package tests.US_022_023_024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.Assert.assertTrue;

public class US_022 extends TestBaseRapor {
    Actions actions;
    Merchant_Dashboard merchant;

    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    SoftAssert softAssert=new SoftAssert();


    @Test
    public void test01() {
        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("namevisible", "namevisible2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        extentTest.info("Merchant_Dashboard sınıfından obje olusturuldu");

        softAssert.assertTrue(merchant_dashboard.merchantname.isDisplayed());

        extentTest.pass("ismin görünür olduğu test edildi.");

        softAssert.assertAll();


    }

    @Test
    public void test02() {

        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("nameclickable", "nameclickable2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

        ReusableMethods.waitForPageToLoad(5);

        softAssert.assertTrue(merchant_dashboard.merchantname.isEnabled());

        extentTest.pass("ismin erişebilirliği test edildi.");

        merchant_dashboard.merchantname.click();

        extentTest.info("İsme tıklanır");

        softAssert.assertTrue(merchant_dashboard.profil.isDisplayed());

        extentTest.pass("profilin görünürlüğü test edildi.");

        softAssert.assertAll();


    }

    @Test
    public void test03() {

        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //- İsmi tıklanıp dropdown menüden profil seçeneği tıklanır.
        //-Kendi profilime gittiğim doğrulanır.
        //- Tarayıcı kapatılır.
        merchant_dashboard = new Merchant_Dashboard();

        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

        merchant_dashboard.merchantname.click();

        extentTest.info("İsme tıklanır");

        merchant_dashboard.profil.click();

        extentTest.info("profile tıklanır");

        ReusableMethods.waitForPageToLoad(5);


        softAssert.assertTrue(merchant_dashboard.firstnamebox.isDisplayed());

        extentTest.pass("profil menüsüne gittiğim doğrulanır");

        softAssert.assertAll();


    }

    @Test
    public void test04() {


        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

        merchant_dashboard.merchantname.click();

        extentTest.info("İsme tıklanır");

        merchant_dashboard.profil.click();

        extentTest.info("profile tıklanır");

        softAssert.assertTrue(merchant_dashboard.BasicDetailsbox.isDisplayed());

        extentTest.info("BasicDetails boxının görünür olduğu doğrulanır");

        ReusableMethods.waitForVisibility(merchant_dashboard.firstnamebox, 3);

        merchant_dashboard.firstnamebox.sendKeys("mehmet");

        extentTest.info("Firstname boxına isim yazıldı.");

        merchant_dashboard.Lastnamebox.sendKeys("DAĞ");

        extentTest.info("Lastname boxına soyisim yazıldı.");

        merchant_dashboard.Emailbox.sendKeys("");

        extentTest.info("Email boxına mail yazıldı.");

        merchant_dashboard.Contactnumber.sendKeys("1234567");

        extentTest.info("ContactNumber boxına numara yazıldı.");

        merchant_dashboard.Username.sendKeys("Efsane");

        extentTest.info("Username boxına isim yazıldı.");

        merchant_dashboard.Savebox1.click();

        extentTest.info("Save boxına tıklanır.");

        softAssert.assertTrue(merchant_dashboard.Updateyazısı.isDisplayed());

        extentTest.pass("profilimdeki değişikliğin başarıyla yapıldığı test edildi.");

        softAssert.assertAll();


    }

    @Test
    public void test05() {
        //-Change Password butonuna tıkladığımda ilgili sayfaya gittiğim doğrulanır.
        //-Old Password boxının görünür  ve clickable  olduğu doğrulanır.
        //-New Password görünür  ve clickable  olduğu doğrulanır.
        //-Confirm Password boxının görünür  ve clickable  olduğu doğrulanır.
        //-Save boxının görünür  ve clickable  olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        SoftAssert softAssert = new SoftAssert();
        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("change Password", "change Password 2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");

        merchant_dashboard.merchantname.click();

        extentTest.info("Click on name");

        merchant_dashboard.profil.click();


        extentTest.info("click on profile");


        merchant_dashboard.ChangePasswordlinki.click();

        extentTest.info("Click the Change Password link");

        softAssert.assertTrue(merchant_dashboard.Oldpasswordbox.isEnabled());

        extentTest.pass("Verify that the oldpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Newpasswordbox.isEnabled());

        extentTest.pass("Verify that the Newpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Confirmpasswordbox.isEnabled());

        extentTest.pass("Verify that the Confirmpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Savebox2.isEnabled());

        extentTest.pass("Verify that the save box is accessible");

        merchant_dashboard.Oldpasswordbox.sendKeys("1234567");

        merchant_dashboard.Newpasswordbox.sendKeys("12345678");

        merchant_dashboard.Confirmpasswordbox.sendKeys("12345678");

        ReusableMethods.wait(3);

        try {
            merchant_dashboard.Savebox2.click();
        } catch (Exception e) {
            softAssert.assertTrue(false, "SaveBox button is not working.");
        }


        //Save boxında bug var çalışmıyor.

        softAssert.assertAll();


    }


}




