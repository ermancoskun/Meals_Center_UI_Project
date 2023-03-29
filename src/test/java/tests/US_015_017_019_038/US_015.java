package tests.US_015_017_019_038;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_Homepage;
import utilities.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.testng.Assert.*;

public class US_015 extends TestBaseRapor {

    User_Homepage userHomepage = new User_Homepage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void myOrdersTest01(){
        extentTest = extentReports.createTest("My orders sayfasına erişim testi");
        userHomepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("Url’e gidildi");
        userHomepage.cookieAcceptButton.click();
        extentTest.info("Cookie kabul edildi");
        ReusableMethods.userLoginMethod("betulUserEmail","betulUserPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        extentTest.info("Açılan sayfada kullanıcı adının üzerine tıklandı");
        userHomepage.myOrdersSection.click();
        extentTest.info("Açılan menüden “My Orders” yazısına tıklandı");

        extentTest.pass("My orders'a erişilebildiği doğrulandı");
    }

    @Test
    public void myOrdersTest02(){
        extentTest = extentReports.createTest("My orders sayfasındaki elemanların görünürlük testi");
        userHomepage=new User_Homepage();
        softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("Url’e gidildi");
        userHomepage.cookieAcceptButton.click();
        extentTest.info("Cookie kabul edildi");
        ReusableMethods.userLoginMethod("betulUserEmail","betulUserPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        extentTest.info("Açılan sayfada kullanıcı adının üzerine tıklandı");
        userHomepage.myOrdersSection.click();
        extentTest.info("My orders'a erişilebildiği doğrulandı");

        softAssert.assertTrue(userHomepage.orderQuantity.isDisplayed());
        extentTest.info("Bulunulan sayfada sipariş miktarının görünür olduğu doğrulandı");
        softAssert.assertTrue(userHomepage.totalAmount.isDisplayed());
        extentTest.info("Total amount’un görünür olduğu doğrulandı");
        softAssert.assertTrue(userHomepage.bagImage.isDisplayed());
        extentTest.info("Alışveriş çantasının görünür olduğu doğrulandı");
        softAssert.assertTrue(userHomepage.searchOrderBox.isEnabled());
        extentTest.info("Sipariş arama kutusunun görünür olduğunu doğrulandı");
        JSUtilities.scrollToBottom(Driver.getDriver());
        extentTest.info("Sayfanın altına inildi");
        softAssert.assertTrue(userHomepage.endOfResult.isDisplayed());
        extentTest.info("Sipariş listesinin altındaki 'end of result' yazısı görüldü");
        List<WebElement> orderList = userHomepage.orderList;
        for (WebElement eachSiparis: orderList
             ) {
            softAssert.assertTrue(eachSiparis.isDisplayed());
        }
        extentTest.info("Sipariş listesindeki bilgilerin görünür olduğu doğrulandı");
        extentTest.pass("My orders sayfasındaki elemanların görünürlüğü doğrulandı");
        softAssert.assertAll();
    }

    @Test
    public void myOrdersTest03(){
        extentTest = extentReports.createTest("Sipariş numarasıyla aranabilirlik testi");
        userHomepage=new User_Homepage();
        softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("Url’e gidildi");
        userHomepage.cookieAcceptButton.click();
        extentTest.info("Cookie kabul edildi");
        ReusableMethods.userLoginMethod("betulUserEmail","betulUserPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        extentTest.info("Açılan sayfada kullanıcı adının üzerine tıklandı");
        userHomepage.myOrdersSection.click();
        extentTest.info("My orders'a erişilebildiği doğrulandı");

        userHomepage.searchOrderBox.click();
        extentTest.info("Sayfada bulunan sipariş arama kutusuna tıklandı");
        userHomepage.searchOrderBox.sendKeys("10253");
        extentTest.info("Sipariş numarası girildi");
        String actualNo = "10253";
        String expectedNo = userHomepage.visibleOrderNo.getText().replaceAll("\\D","");
        softAssert.assertEquals(actualNo,expectedNo);
        extentTest.info("Görüntülenen siparişin sipariş numarasının arama kutusundaki ile aynı olduğu doğrulandı");
        softAssert.assertAll();
    }

    @Test
    public void myOrdersTest04(){
        extentTest = extentReports.createTest("Siparişler üzerinde işlem yapma testi");
        userHomepage=new User_Homepage();
        softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        extentTest.info("Url’e gidildi");
        userHomepage.cookieAcceptButton.click();
        extentTest.info("Cookie kabul edildi");
        ReusableMethods.userLoginMethod("betulUserEmail","betulUserPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        extentTest.info("Açılan sayfada kullanıcı adının üzerine tıklandı");
        userHomepage.myOrdersSection.click();

        String orderHandle = Driver.getDriver().getWindowHandle();
        extentTest.info("My orders'a erişilebildiği doğrulandı");
        JSUtilities.scrollToBottom(Driver.getDriver());
        userHomepage.ucNokta.click();
        ReusableMethods.wait(0.2);
        extentTest.info("Listede bulunan siparişlerden üzerinde işlem yapılmak istenene gelinip üç nokta simgesine tıklandı");
        ReusableMethods.hover(userHomepage.viewSection);
        userHomepage.viewSection.click();
        extentTest.info("Açılan menüde sipariş detaylarını görüntülemek için ‘view’ yazısına tıklandı");
        softAssert.assertTrue(userHomepage.orderDetail.isDisplayed());
        extentTest.info("Sipariş detayı panelini görüntülendi");
        ReusableMethods.hover(userHomepage.closePanel);
        userHomepage.closePanel.click();
        extentTest.info("Çarpıya basıldı ve panel kapatıldı");
        ReusableMethods.wait(0.2);
        JSUtilities.scrollToBottom(Driver.getDriver());
        extentTest.info("Sayfanın altına inildi");
        ReusableMethods.wait(0.2);
        userHomepage.ucNoktaCompleted.click();
        extentTest.info("Tamamlanmış siparişteki yatay üç nokta simgesine tıklandı");
        ReusableMethods.wait(0.3);
        userHomepage.writeReviewSection.click();
        userHomepage.reviewArea.click();
        userHomepage.reviewArea.sendKeys("nice!");
        extentTest.info("Yorum alanına tıklandı ve yorum yazıldı");
        JSUtilities.scrollToBottom(Driver.getDriver());
        extentTest.info("Sayfanın altına inildi");
        ReusableMethods.wait(0.2);
        userHomepage.addReviewButton.click();
        extentTest.info("Add review’e tıklandı");
        JSUtilities.scrollToTop(Driver.getDriver());
        extentTest.info("Sayfada yukarı çıkıldı");
        userHomepage.reviewClose.click();
        extentTest.info("Yorum penceresi kapatıldı");
        JSUtilities.scrollToBottom(Driver.getDriver());
        userHomepage.ucNokta.click();
        ReusableMethods.wait(0.2);
        extentTest.info("Listede bulunan siparişlerden üzerinde işlem yapılmak istenene gelinip üç nokta simgesine tıklandı");
        ReusableMethods.hover(userHomepage.buyAgainSection);
        userHomepage.buyAgainSection.click();
        extentTest.info("Aynı üründen tekrar sipariş vermek için ‘buy again’ yazısına tıklandı");
        userHomepage.goToCheckout.click();
        extentTest.info("Açılan panelde ‘go to checkout’ butonuna tıklandı");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("checkoutUrl");
        assertEquals(actualUrl,expectedUrl);
        extentTest.info("Sipariş verme sayfasına yönlendirildiği doğrulandı");
        Driver.getDriver().navigate().back();
        extentTest.info("My orders sayfasına dönüldü");
        ReusableMethods.wait(0.2);
        JSUtilities.scrollToBottom(Driver.getDriver());
        userHomepage.ucNokta.click();
        extentTest.info("Listede bulunan siparişlerden üzerinde işlem yapılmak istenene gelinip üç nokta simgesine tıklandı");
        ReusableMethods.wait(0.2);
        ReusableMethods.hover(userHomepage.downloadSection);
        userHomepage.downloadSection.click();
        extentTest.info("Sipariş bilgilerini PDF olarak indirmek için ‘Download PDF’e tıklandı");
        String dosyaYolu = "C:\\Users\\fbalp\\Downloads\\document.pdf";
        softAssert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        //System.getProperty("user.home");
        extentTest.info("Dosyanın bilgisayara indiği doğrulandı");
        /*
        JSUtilities.scrollToBottom(Driver.getDriver());
        userHomepage.ucNoktaNew.click();
        extentTest.info("Yatay üç nokta simgesine tıklandı");
        ReusableMethods.hover(userHomepage.cancelSection);
        userHomepage.cancelSection.click();
        extentTest.info("Siparişi iptal etmek için cancel order’a tıklandı");
        userHomepage.cancelOrderButton.click();
        extentTest.info("Açılan pencerede cancel order butonuna basıldı");
        softAssert.assertTrue(userHomepage.cancelled.isDisplayed());
        extentTest.info("Siparişin iptal edildiği doğrulandı");
        */
        JSUtilities.scrollToBottom(Driver.getDriver());
        userHomepage.ucNokta.click();
        extentTest.info("Yatay üç nokta simgesine tıklandı");
        ReusableMethods.wait(0.2);
        ReusableMethods.hover(userHomepage.trackSection);
        userHomepage.trackSection.click();
        extentTest.info("Sipariş serüvenini görüntülemek için ‘track’ yazısına tıklandı");
        ReusableMethods.wait(0.2);
        ReusableMethods.switchToWindow2(orderHandle);
        softAssert.assertTrue(userHomepage.orderTrack.isDisplayed());
        extentTest.info("Açılan sayfanın sipariş durumu sayfası olduğu doğrulandı");
        extentTest.pass("Siparişler üzerinde işlem yapılabildiği dogrulandı");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        userHomepage=new User_Homepage();
        softAssert = new SoftAssert();
        softAssert.assertAll();
        Driver.closeDriver();
    }
}

