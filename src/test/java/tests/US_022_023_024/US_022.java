package tests.US_022_023_024;

import org.openqa.selenium.By;
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

       assertTrue(merchant_dashboard.merchantname.isEnabled());

       extentTest.pass("ismin erişebilirliği test edildi.");

       merchant_dashboard.merchantname.click();

       extentTest.info("İsme tıklanır");

       assertTrue(merchant_dashboard.profil.isDisplayed());

       extentTest.pass("profilin görünürlüğü test edildi.");






   }


}
