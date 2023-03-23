package tests.US_015_017_019_038;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.User_RestaurantUmiSakeHouse;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class US_015 {


    User_RestaurantUmiSakeHouse userRestaurantUmiSakeHouse = new User_RestaurantUmiSakeHouse();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void myOrdersTest01(){
        ReusableMethods.userLoginMethod();
        //	Açılan sayfada kullanıcı adının üzerine,
        ReusableMethods.waitFor(1);
       userRestaurantUmiSakeHouse.nameButton.click();
        // ardından açılan menüden “My Orders” yazısına tıklar
       userRestaurantUmiSakeHouse.myOrdersSection.click();


    }
    @Test (dependsOnMethods = "myOrdersTest01")
    public void myOrdersTest02(){
        //	Bulunduğu sayfada sipariş miktarının görünür olduğunu doğrular
        assertTrue(userRestaurantUmiSakeHouse.orderQuantity.isDisplayed());
        //	Total amount ve sepet imgesinin görünür olduğunu doğrular
        assertTrue(userRestaurantUmiSakeHouse.totalAmount.isDisplayed());
        ReusableMethods.waitFor(1);
        assertTrue(userRestaurantUmiSakeHouse.bagImage.isDisplayed());
        //	Sipariş arama kutusunun görünür olduğunu doğrular
        assertTrue(userRestaurantUmiSakeHouse.searchOrderBox.isEnabled());
        //      Sayfanın altındaki end of result yazısının görünür olduğunu doğrular
        JSUtilities.scrollToBottom(Driver.getDriver());
        assertTrue(userRestaurantUmiSakeHouse.endOfResult.isDisplayed());
        //	Sipariş listesindeki bilgilerin görünür olduğunu doğrular
        JSUtilities.scrollToBottom(Driver.getDriver());
        List<WebElement> orderList = userRestaurantUmiSakeHouse.orderList;
        for (WebElement eachSiparis: orderList
             ) {
            assertTrue(eachSiparis.isDisplayed());
            System.out.println(eachSiparis);
        }
        Driver.getDriver().close();
    }

    @Test(dependsOnMethods = "myOrdersTest01")
    public void myOrdersTest03(){
        //	Açılan sayfada kullanıcı adının üzerine,
        ReusableMethods.waitFor(1);
        userRestaurantUmiSakeHouse.nameButton.click();
        // ardından açılan menüden “My Orders” yazısına tıklar
        userRestaurantUmiSakeHouse.myOrdersSection.click();
        //TC15.03: Kullanıcının sipariş numarasıyla arama yapabilmesi
        //	Sayfada bulunan sipariş arama kutusuna tıklar
        userRestaurantUmiSakeHouse.searchOrderBox.click();
        //	Sipariş numarasını girer
        userRestaurantUmiSakeHouse.searchOrderBox.sendKeys("10253");
        //	Görüntülenen siparişin sipariş numarasının,
        //      arama kutusundaki ile aynı olduğunu doğrular
        String actualNo = "10253";
        String expectedNo = userRestaurantUmiSakeHouse.visibleOrderNo.getText().replaceAll("\\D","");
        assertEquals(actualNo,expectedNo);
        Driver.getDriver().close();

    }
    @Test(dependsOnMethods = "myOrdersTest01")
    public void myOrdersTest04(){
        //	Açılan sayfada kullanıcı adının üzerine,
        ReusableMethods.waitFor(1);
        userRestaurantUmiSakeHouse.nameButton.click();
        // ardından açılan menüden “My Orders” yazısına tıklar
        userRestaurantUmiSakeHouse.myOrdersSection.click();
        // 	Siparişlerin tarih bilgisinin listede yukardan aşağı gidildikçe
        // yeniden eskiye sıralandığını doğrular

        //******************************** tarih sıralama*****************




    }
    @Test(dependsOnMethods = "myOrdersTest01")
    public void myOrdersTest05(){
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



}

