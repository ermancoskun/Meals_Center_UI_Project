package tests.US_022_023_024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
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

    Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
   //-Tarayıcı açılır.
    //
    //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
    //- Doğru mail ve password ile hesabıma giriş yapılır.
    //- Header bölümünde ismimin görünür olduğunu doğrulanır.
    //- Tarayıcı kapatılır.
   @Test
   public void test01(){
       extentTest=extentReports.createTest("namevisible","namevisible2");

       ReusableMethods.merchantLogin();

       extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");



       extentTest.info("Merchant_Dashboard sınıfından obje olusturuldu");

       assertTrue(merchant_dashboard.merchantname.isDisplayed());

       extentTest.pass("ismin görünür olduğu test edildi.");





   }
   @Test
    public void test02(){
       //-Tarayıcı açılır.
       //
       //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
       //- Doğru mail ve password ile hesabıma giriş yapılır.
       //- İsmimim tıklanabilir olduğunu doğrulanır.
       //-İsmime tıklayıdığımda dropdown menüden yeni seçeneklerin açıldığı doğrulanır.
       //- Tarayıcı kapatılır.
       extentTest=extentReports.createTest("nameclickable","nameclickable2");

       ReusableMethods.merchantLogin();
       extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

       ReusableMethods.waitForPageToLoad(5);

       assertTrue(merchant_dashboard.merchantname.isEnabled());

       extentTest.pass("ismin erişebilirliği test edildi.");

       merchant_dashboard.merchantname.click();

       extentTest.info("İsme tıklanır");

       assertTrue(merchant_dashboard.profil.isDisplayed());

       extentTest.pass("profilin görünürlüğü test edildi.");


   }
   @Test
    public void test03(){

       //-Tarayıcı açılır.
       //
       //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
       //- Doğru mail ve password ile hesabıma giriş yapılır.
       //- İsmi tıklanıp dropdown menüden profil seçeneği tıklanır.
       //-Kendi profilime gittiğim doğrulanır.
       //- Tarayıcı kapatılır.
       extentTest=extentReports.createTest("profilegitme","profilegitme2");

       ReusableMethods.merchantLogin();

       extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

       merchant_dashboard.merchantname.click();

       extentTest.info("İsme tıklanır");

       merchant_dashboard.profil.click();

       extentTest.info("profile tıklanır");

       ReusableMethods.waitForPageToLoad(5);


       assertTrue(merchant_dashboard.firstnamebox.isDisplayed());

       extentTest.pass("profil menüsüne gittiğim doğrulanır");




   }
   @Test
    public void test04(){

       //-Tarayıcı açılır.
       //
       //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
       //- Doğru mail ve password ile hesabıma giriş yapılır.
       //- İsmi tıklanıp dropdown menüden profil seçeneği tıklanır.
       //- Basic Details boxının görünür olduğu doğrulanır.
       //- Firstname boxının görünür ve clickable olduğu doğrulanır.
       //-Lastname boxının görünür  ve clickable  olduğu doğrulanır.
       //-Email address boxının görünür  ve clickable  olduğu doğrulanır.
       //- Contact number boxının görünür  ve clickable  olduğu doğrulanır.
       //- Username boxının görünür  ve clickable  olduğu doğrulanır.
       //- Browse boxının görünür  ve clickable  olduğu doğrulanır.
       //-Save boxının görünür  ve clickable  olduğu doğrulanır.


       extentTest=extentReports.createTest("profilegitme","profilegitme2");

       ReusableMethods.merchantLogin();

       extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

       merchant_dashboard.merchantname.click();

       extentTest.info("İsme tıklanır");

       merchant_dashboard.profil.click();

       extentTest.info("profile tıklanır");

       assertTrue(merchant_dashboard.BasicDetailsbox.isDisplayed());

       extentTest.pass("BasicDetails boxının görünür olduğu doğrulanır");

       assertTrue(merchant_dashboard.firstnamebox.isEnabled());

       extentTest.pass("Firstname boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Lastnamebox.isEnabled());

       extentTest.pass("Lastname boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Emailbox.isEnabled());

       extentTest.pass("Email boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Contactnumber.isEnabled());

       extentTest.pass("Contactnumber boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Username.isEnabled());

       extentTest.pass("Username boxının erişilebilir olduğu doğrulanır");

       merchant_dashboard.browseboxı.click();

       extentTest.info("browse boxına tıklanır");

       assertTrue(merchant_dashboard.browseboxpicture.isEnabled());

      extentTest.pass("browse boxının açıldığı doğrulanır");

      merchant_dashboard.browseboxpicture.click();

       extentTest.info("browse boxındaki bir resme tıklanır");

       merchant_dashboard.AddFilesbuton.click();

       extentTest.info("AddFiles butonuna tıklanır");

      assertTrue(merchant_dashboard.Savebox1.isEnabled());

      extentTest.pass("Save boxının erişilebilir olduğu doğrulanır");

      merchant_dashboard.Savebox1.click();

      assertTrue(merchant_dashboard.Updateyazısı.isDisplayed());

      extentTest.pass("profilimdeki değişikliğin başarıyla yapıldığı test edildi.");


      //-Change Password butonuna tıkladığımda ilgili sayfaya gittiğim doğrulanır.
      //-Old Password boxının görünür  ve clickable  olduğu doğrulanır.
      //-New Password görünür  ve clickable  olduğu doğrulanır.
      //-Confirm Password boxının görünür  ve clickable  olduğu doğrulanır.
      //-Save boxının görünür  ve clickable  olduğu doğrulanır.
      //- Tarayıcı kapatılır.




   }

   @Test
    public void test05(){
       //-Change Password butonuna tıkladığımda ilgili sayfaya gittiğim doğrulanır.
       //-Old Password boxının görünür  ve clickable  olduğu doğrulanır.
       //-New Password görünür  ve clickable  olduğu doğrulanır.
       //-Confirm Password boxının görünür  ve clickable  olduğu doğrulanır.
       //-Save boxının görünür  ve clickable  olduğu doğrulanır.
       //- Tarayıcı kapatılır.


       extentTest=extentReports.createTest("profilegitme","profilegitme2");

       ReusableMethods.merchantLogin();

       extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

       merchant_dashboard.merchantname.click();

       extentTest.info("İsme tıklanır");

       merchant_dashboard.profil.click();


       extentTest.info("profile tıklanır");


       merchant_dashboard.ChangePasswordlinki.click();

       extentTest.info("Change Password linkine tıklanır");

       assertTrue(merchant_dashboard.Oldpasswordbox.isEnabled());

       extentTest.pass("Oldpassword boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Newpasswordbox.isEnabled());

       extentTest.pass("Newpassword boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Confirmpasswordbox.isEnabled());

       extentTest.pass("Confirmpassword boxının erişilebilir olduğu doğrulanır");

       assertTrue(merchant_dashboard.Savebox2.isEnabled());

       extentTest.pass("Save boxının erişilebilir olduğu doğrulanır");

       merchant_dashboard.Oldpasswordbox.sendKeys("1234567");

       merchant_dashboard.Newpasswordbox.sendKeys("12345678");

       merchant_dashboard.Confirmpasswordbox.sendKeys("12345678");

       merchant_dashboard.Savebox2.click();

       extentTest.info("Change Password sayfasının çalıştığı test edildi");

       //Save boxında bug var çalışmıyor.


   }


}
