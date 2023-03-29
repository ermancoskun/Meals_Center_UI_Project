package tests.US_007_018_033_040;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_033 {
    Merchant_Dashboard md;
    @Test
    public void promoLinkSeen(){
        md=new Merchant_Dashboard();
        //1)bir browser aç.
        //2)"https://qa.mealscenter.com/backoffice/auth/login" url uzerinden 'mealscenter tuccar giris sayfasina gider' sitesine gider.
        //3)Cookies kabul edilir.
        //5)geccerli emailini email kutusuna yazar.
        //6)gecerli sifresini sifre kutusuna yazar.
        //7)Sign in butonuna basar.
        //8)Acilan sayfanin solunda Dashboard menusu altinda promo menusununun gorundugunu dogrular.
        //9)sayfayi kapatir.
        ReusableMethods.goToMerchantHomePage();
        ReusableMethods.merchantLogin();
        Assert.assertTrue(md.promoLink.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void addCouponTest(){
        md=new Merchant_Dashboard();
        //1)bir browser aç
        //2)"https://qa.mealscenter.com/backoffice/auth/login" url uzerinden 'mealscenter tuccar giris sayfasina gider' sitesine gider.
        //3)Cookies kabul edilir.
        //5)geccerli emailini email kutusuna yazar.
        //6)gecerli sifresini sifre kutusuna yazar.
        //7)Sign in butonuna basar.
        //8)Acilan sayfanin solunda Dashboard menusu altinda promo menusune tıklar
        //9)Acılan menude coupon menusune tiklar
        //10)acılan sayfada Coupon list yazisinin cıktıgını dogrular
        //11)sayfanin sag tarafinda yeni ekleme yazisinin yanindaki artı tusuna basar.
        //12)acılan sayfanin coupon ekleme sayfasi oldugunu test eder.
        //13)sayfayi kapatir
        ReusableMethods.goToMerchantHomePage();
        ReusableMethods.merchantLogin();
        md.promoLink.click();
        md.couponLink.click();
        Assert.assertTrue(md.couponListText.isDisplayed());
        md.plusLink.click();
        String expectedIcerik="coupon_create";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void createCouponAndDeleteTest(){
        //1)bir browser ac.
        //2)"https://qa.mealscenter.com/backoffice/auth/login"
        //url uzerinden 'mealscenter tuccar giris sayfasina gider' sitesine gider.
        //3)Cookies kabul edilir.
        //5)geccerli emailini email kutusuna yazar.
        //6)gecerli sifresini sifre kutusuna yazar.
        //7)Sign in butonuna basar.
        //8)Acilan sayfanin solunda Dashboard menusu altinda promo menusune tıklar.
        //9)Acılan menude coupon menusune tiklar.
        //11)sayfanin sag tarafinda yeni ekleme yazisinin yanindaki artı tusuna basar.
        //12)coupon name  kutusuna tiklar.
        //13)coupon name kutusuna coupon ismi olarak 'coupontest' girer.
        //14)coupon type kutusuna tıklar acılan menuden coupon typeni 'sabit miktar' secer.
        //15)miktar kutusuna tıklar ve mevcut miktari siler ,
        //miktar kutusuna  '10' olarak; girilecek miktar yazar.
        //16)Asgari miktar kutusuna tıklar ve mevcut miktari siler ,
        // asgari alısveris miktarini '25' olarak; yazar.
        //17)musait gunler kutusuna tıklar ve acılan menuden ' pazartesi secer.
        //18)son (kupon gecerlilik suresini) kutusuna tıklar acılan menuden secili ayın 27'sini  secer
        //19)Satıcı için geçerli kutusuna tıklar ve acılan menuden birinci restoran secer.
        //20)coupon secenekleri kutusuna tıklar
        //acılan menuden 'tum kullanicilar icin sinirsiz'secenegini secer.
        //21)durum kutusuna tıklar  'taslak' secenegini secer.
        //22)Kaydetmek butonuna tıklar
        //23)acılan sayfada listelenen coupon listesinde
        // 'coupontest' adinda coupon  oldugunu dogrular.
        //24) sayfanin saginda hareketler yazisinin altında guncelleme ve silmek
        // simgelerinin gorunur oldugunu test eder
        //25) silmek secenegini tıklar acılan alert de silmek butonu secer.
        //26)olustuturulan 'coupontest'  isimli bir coupon gorunur olamdigini dogrular.
        //27)sayfayi kapatir.
        md=new Merchant_Dashboard();
        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.goToMerchantHomePage();
        ReusableMethods.merchantLogin();
        md.promoLink.click();
        md.couponLink.click();
        md.plusLink.click();
        WebElement nameTextBox=Driver.getDriver().findElement(By.xpath("//label[@for='AR_voucher_voucher_name']"));
        actions.sendKeys(nameTextBox,"coupontest")
                .sendKeys(Keys.TAB)
                .sendKeys("percentage").sendKeys(Keys.TAB)
                .sendKeys("25").sendKeys(Keys.TAB)
                .sendKeys("20").sendKeys(Keys.TAB)
                .sendKeys("Monday").sendKeys(Keys.ENTER).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        WebElement expiration=Driver.getDriver().findElement(By.xpath("//input[@readonly='readonly']"));
               JSUtilities.clickWithJS(Driver.getDriver(),expiration);
        JSUtilities.scrollToBottom(Driver.getDriver());
                ReusableMethods.wait(0.1);
                WebElement selectedDay=Driver.getDriver().findElement(By.xpath("(//tr/td)[30]"));
                selectedDay.click();

        WebElement couponOptionsDDM=Driver.getDriver().findElement(By.id("AR_voucher_used_once"));

        Select select=new Select(couponOptionsDDM);
            select.selectByVisibleText("Unlimited for all user");
        JSUtilities.scrollToBottom(Driver.getDriver());
        WebElement status=Driver.getDriver().findElement(By.id("AR_voucher_status"));
        select=new Select(status);
        select.selectByVisibleText("Draft");
        md.saveButton.click();
        WebElement newCoupon=Driver.getDriver().findElement(By.xpath("(//tr/td)[2]"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(newCoupon.isDisplayed(),"olusturulan coupon goruntulenemedi");
        softAssert.assertTrue(md.updateButton.isDisplayed(),"update button goruntulenemedi");

        WebElement couponDeleteButton=Driver.getDriver().findElement(By.xpath("//a[@data-original-title='Delete']"));
        couponDeleteButton.click();
        //Driver.getDriver().switchTo().alert();
        //WebElement alertDeleteButton=Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-green item_delete']"));
        ReusableMethods.wait(2);
       JSUtilities.clickWithJS(Driver.getDriver(),md.deleteConfirmationButton);
       // md.deleteConfirmationButton.click();
       WebElement noDataAveableText=Driver.getDriver().findElement(By.xpath("//td[@class='dataTables_empty']"));
       softAssert.assertTrue(noDataAveableText.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
