package tests.US_015_017_019_038;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.*;

import java.util.List;

import static org.testng.Assert.*;

public class US_015 extends TestBaseRapor {

    User_Homepage userHomepage = new User_Homepage();

    @Test
    public void myOrdersTest01(){
        extentTest = extentReports.createTest(""
        userHomepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        userHomepage.cookieAcceptButton.click();
        ReusableMethods.userLoginMethod("betulEmail","betulPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        userHomepage.myOrdersSection.click();
    }

    @Test
    public void myOrdersTest02(){
        userHomepage=new User_Homepage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        userHomepage.cookieAcceptButton.click();
        ReusableMethods.userLoginMethod("betulEmail","betulPassword");
        ReusableMethods.waitFor(1);
        userHomepage.nameButton.click();
        userHomepage.myOrdersSection.click();

        assertTrue(userHomepage.orderQuantity.isDisplayed());
        assertTrue(userHomepage.totalAmount.isDisplayed());
        assertTrue(userHomepage.bagImage.isDisplayed());
        assertTrue(userHomepage.searchOrderBox.isEnabled());
        JSUtilities.scrollToBottom(Driver.getDriver());
        assertTrue(userHomepage.endOfResult.isDisplayed());
        List<WebElement> orderList = userHomepage.orderList;
        for (WebElement eachSiparis: orderList
             ) {
            assertTrue(eachSiparis.isDisplayed());
        }

    }

    @Test
    public void myOrdersTest03(){
         userHomepage=new User_Homepage();
         Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
         userHomepage.cookieAcceptButton.click();
         ReusableMethods.userLoginMethod("betulEmail","betulPassword");
         ReusableMethods.waitFor(1);
         userHomepage.nameButton.click();
         userHomepage.myOrdersSection.click();

        userHomepage.searchOrderBox.click();
        userHomepage.searchOrderBox.sendKeys("10253");
        String actualNo = "10253";
        String expectedNo = userHomepage.visibleOrderNo.getText().replaceAll("\\D","");
        assertEquals(actualNo,expectedNo);
    }

    @Test
    public void myOrdersTest04(){

        // TC15.05: Kullanıcının siparişler üzerinde silme,
        // yorum ekleme, görüntüleme gibi bazı temel işlemleri yapabilmesi

        //7.	Listede bulunan siparişlerden üzerinde işlem yapmak istediğine gelir
        //8.	Yatay üç nokta simgesine tıklar
        //9.	Açılan menüde sipariş detaylarını görüntülemek için ‘view’ yazısına tıklar
        //10.	Çarpıya basarak menüyü kapatır
        //11.	Yatay üç nokta simgesine tıklar
        //12.	Sipariş serüvenini görüntülemek için ‘track’ yazısına tıklar
        //13.	Açılan sayfada sipariş durumunu görüntüler
        //14.	Sayfayı kapatır
        //15.	Listede bulunan siparişlerden üzerinde işlem yapmak istediğine gelir
        //16.	Yatay üç nokta simgesine tıklar
        //17.	Aynı üründen tekrar sipariş vermek için ‘buy again’ yazısına tıklar
        //18.	Açılan menüde ‘go to checkout’ butonuna tıklar
        //19.	(Tekrar) sipariş sayfasına yönlendirildiğini doğrular
        //20.	My orders sayfasına gelir (geri döner)
        //21.	Listede bulunan siparişlerden üzerinde işlem yapmak istediğine gelir
        //22.	Yatay üç nokta simgesine tıklar
        //23.	Açılan menüde sipariş bilgilerini PDF olarak indirmek için ‘Download PDF’ e tıklar
        //24.	Dosyanın bilgisayarına indiğini doğrular
        //25.	Yatay üç nokta simgesine tıklar
        //26.	Sipariş eline ulaştığında yorum yazmak için ‘Write a Review’e tıklar
        //27.	Yıldız ile puanlamak için yıldıza tıklar
        //28.	(Aşağı iner) Add review’e tıklar
        //29.	(Yukarı çıkar) Pencereyi kapatır
        //30.	(Sayfa sonuna) Siparişini iptal etmek istediği ürüne gelir ve (4.)yatay üç nokta simgesine tıklar Cancel order’a basar
        //31.	Siparişi iptal ettiğini doğrular (cancelled imgesi)

    }



    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }



}

