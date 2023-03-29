package tests.US_007_018_033_040;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_040 {
    Admin_Dashboard ad;
    Actions actions ;
    @Test
    public void adminCreateCouponTest(){
        //1)browser aç
        //2)"https://qa.mealscenter.com/backoffice/loginé" url'i gir
        //3)cookies kabul et
        //3) kullanici isim metin kutusuna gecerli kullanici admin ismini girer.
        //4) password kutusuna gecerli admin sifre girer.
        //5)giris yap butonuna tiklar.
        //6)Sayfanin solunda gosterge panelinin altinda promo menusine tiklar.
        //7)kupon menusunun gorunur oldugunu dogrular.
        //8)kupon linkine tıklar.
        //9)acılan sayfanin kupon olusuturma sayfanin saginda yeni ekleme yazisinin gorunurlugunu
        //test eder.
        //10)yeni ekleme yazisinin yanindaki + simgesine tiklar.
        //11)coupon name  kutusuna tiklar.
        //12)coupon name kutusuna coupon ismi olarak 'testcoupon' girer.
        //13)coupon type kutusuna tıklar acılan menuden coupon typeni 'sabit miktar' secer.
        //14)miktar kutusuna tıklar ve mevcut miktari siler ,
        //miktar kutusuna  '10' olarak; girilecek miktar yazar.
        //15)Asgari miktar kutusuna tıklar ve mevcut miktari siler ,
        // asgari alısveris miktarini '25' olarak; yazar.
        //16)musait gunler kutusuna tıklar ve acılan menuden ' pazartesi secer.
        //17)Satıcı için geçerli kutusuna tıklar ve acılan menuden birinci restoran secer.
        //18)son (kupon gecerlilik suresini) kutusuna tıklar acılan menuden secili ayın 27'sini  secer
        //19)coupon secenekleri kutusuna tıklar
        //acılan menuden 'tum kullanicilar icin sinirsiz'secenegini secer.
        //20)durum kutusuna tıklar  'taslak' secenegini secer.
        //21)Kaydetmek butonuna tıklar
        //22)acılan sayfada listelenen coupon listesinde
        // 'testcoupon' adinda coupon  oldugunu dogrular.
        //23)sayfayi kapatir.
        ReusableMethods.goToAdminHomePage();
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),ConfigReader.getProperty("betulAdminPassword"));
        ad=new Admin_Dashboard();
        ad.promoMenu.click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(ad.couponLink.isDisplayed());
        ad.couponLink.click();
        softAssert.assertTrue(ad.addNewText.isDisplayed());
        ad.plusLink.click();
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(ad.couponNameTextBox,"testcoupon").sendKeys(Keys.TAB)
                        .sendKeys("fixed amount").sendKeys(Keys.TAB)
                        .sendKeys("25").sendKeys(Keys.TAB)
                        .sendKeys("20").sendKeys(Keys.TAB)
                        .sendKeys("monday").sendKeys(Keys.TAB)
                        .sendKeys(Keys.TAB).sendKeys("Umi Sake House"+Keys.ENTER)
                .sendKeys(Keys.TAB)
                .perform();
        ReusableMethods.wait(2);
        //JSUtilities.clickWithJS(Driver.getDriver(),ad.expirationTextBox);
        ReusableMethods.wait(0.1);
        JSUtilities.clickWithJS(Driver.getDriver(),ad.selectedDay);
        actions.keyDown(Keys.CONTROL).keyDown(Keys.END);
        Select select=new Select(ad.adminCouponOptionsDDM);
        select.selectByVisibleText("Unlimited for all user");
        JSUtilities.scrollToBottom(Driver.getDriver());
        select=new Select(ad.adminCouponStatus);
        select.selectByVisibleText("Draft");
        JSUtilities.clickWithJS(Driver.getDriver(),ad.createCouponSaveButton);
        softAssert.assertAll();
    }
}
