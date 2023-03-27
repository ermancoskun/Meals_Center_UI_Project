package tests.US_012_013_021_039_duygu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.User_CheckoutPage;
import pages.User_Homepage;
import pages.User_RestaurantUmiSakeHouse;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.List;

public class US_013_account_checkout {

    User_Homepage homepage=new User_Homepage();
    SoftAssert softAssert=new SoftAssert();
    User_RestaurantUmiSakeHouse restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
    User_CheckoutPage checkoutPage=new User_CheckoutPage();
    Actions actions=new Actions(Driver.getDriver());

////////////***********   TEST 1 ************////////////////////////////////////////////////////////
    @Test
    public void tc_1301_sepetFonksiyonTesti() {

        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        // Sepete restauranttaki ilk urun eklenir.
        sepeteUrunEklemeMethodu();

        // Anasayfaya gelinir.
        homepage.mealscenterButton.click();

        // Kullanıcı anasayfasindaki "Cart" butonu tıklanir.
        restaurantUmiSakeHouse.cartButonu.click();

        //Sepet sayfasının erişilebilirliği doğrulanır.
        softAssert.assertTrue(homepage.sepetDogrulamaYazisi.isDisplayed(),"Kullanıcı anasayfasındaki Cart butonu ile sepet sayfasına erişilemiyor.");//sepetteki Your cart from yazisi

        // Sepet kapatilir.
        homepage.sepetCloseButonu.click();

        // Kullanıcı anasayfasindaki "Cart" butonunun yanindaki sepet logosuna tiklanir.
        restaurantUmiSakeHouse.cartLogoButonu.click();

        //Sepet sayfasının erişilebilirliği doğrulanır.
        softAssert.assertTrue(homepage.sepetDogrulamaYazisi.isDisplayed(),"Kullanıcı anasayfasındaki CartLogosu butonu ile sepet sayfasına erişilemiyor.");//sepetteki Your cart from yazisi

        // Sepet sayfasının tum fonksiyonlarının calistigi dogrulanir.
        softAssert.assertTrue(homepage.sepetClearButonu.isEnabled(),"Sepetteki clear butonu aktif değil");
        softAssert.assertTrue(homepage.sepetUrunSilmeButonu.isEnabled(),"Sepetteki urun silme(x) butonu aktif değil");
        softAssert.assertTrue(homepage.sepettekiUrunuArttirmaButonu.isEnabled(),"Sepetteki urun arttirma butonu aktif değil");
        softAssert.assertTrue(homepage.sepettekiUrunuAzaltmaButonu.isEnabled(),"Sepetteki urun azaltma butonu aktif değil");
        softAssert.assertTrue(homepage.sepettekiUrunMiktari.isDisplayed(),"Sepetteki urun miktari yazisi gorunur değil");

        // Sepet kapatilir.
        homepage.sepetCloseButonu.click();

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();  //bitti
        }
    }
    ////////////***********   TEST 2 ************////////////////////////////////////////////////////////
    @Test
    public void tc_1302_odemeSayfasiFonksiyonTesti(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        // Sepete restauranttaki ilk urun eklenir.
        sepeteUrunEklemeMethodu();

        // Sepetteki checkout butonu ile ödeme sayfasına gidilir.
        restaurantUmiSakeHouse.checkoutButton.click();

        // Odeme sayfasına erişildiği doğrulanır.
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="checkout";
        softAssert.assertTrue(actualUrl.contains(expectedUrl),"Odeme sayfasina gidilemedi");

        // Odeme sayfasındaki fonksiyonlarin calısır olduğu doğrulanir.
        softAssert.assertTrue(checkoutPage.deliveryButton.isEnabled(),"Checkout sayfasinda 'Delivery' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.phoneButton.isEnabled(),"Checkout sayfasinda 'PhoneNumberBox' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.promotionsButton.isEnabled(),"Checkout sayfasinda 'Promotions' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.includeUtensilsAndCondiments.isEnabled(),"Checkout sayfasinda 'includeUtensilsAndCondiments' secenegi aktif degil");
        softAssert.assertTrue(checkoutPage.deliveryAdress.isEnabled(),"Checkout sayfasinda 'Delivery Adress' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.cashOnDeliveryButton.isEnabled(),"Checkout sayfasinda 'Cash on delivery' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.stripeButton.isEnabled(),"Checkout sayfasinda 'Stripe' butonu aktif degil");
        softAssert.assertTrue(checkoutPage.placeOrderButton.isEnabled(),"Checkout sayfasinda 'Place' butonu aktif degil");

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();  //bitti
        }

    }
    ////////////***********   TEST 3 ************////////////////////////////////////////////////////////
    @Test
    public void tc_1303_sepettekiUrunuDogrulamaTesti(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        //Umi Sake Hause restaurant tıklanır.
        homepage.umiSakeHouseRestaurantButton.click();

        // Ilk ürünun ismi kaydedilir.
        String expectedUrunIsmi=restaurantUmiSakeHouse.ilkUrunIsimElementi.getText();

        // Ilk ürün 'add to cart' butonu ile sepete eklenir.
        restaurantUmiSakeHouse.ilkUrunAddToCartButton.click();

        // Sepetteki checkout butonu ile ödeme sayfasına gidilir.
        restaurantUmiSakeHouse.checkoutButton.click();

        // Sepetteki urun ismine bakilir.
        String actualUrunIsmi=checkoutPage.sepettekiUrunIsmi.getText();

         //Sepetteki ürün ile sepete eklediğimiz ürünün aynı olduğu doğrulanır.
        softAssert.assertEquals(actualUrunIsmi,expectedUrunIsmi,"Sepete atilan urun ile sepetteki urun ayni degil.");

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();  //bitti
        }

    }
    ////////////***********   TEST 4 ************////////////////////////////////////////////////////////
    @Test
    public void tc_1304_gecersizAdresGecerliOdemeBilgisiIleSiparisTesti(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        // Sepete restauranttaki ilk urun eklenir.
        sepeteUrunEklemeMethodu();

        //Sepetteki checkout butonu ile ödeme sayfasına gidilir.
        restaurantUmiSakeHouse.checkoutButton.click();

        // Delivery option secilir
        checkoutPage.deliveryButton.click();
        checkoutPage.orderTypeDelivery.click();
        checkoutPage.orderTypeSaveButton.click();

        // Promotion option secilir
        checkoutPage.promotionsButton.click();
        checkoutPage.promotionsOption2.click();
        checkoutPage.promotionsSave.click();


        // Include utensils and condiments option secilir
        checkoutPage.includeUtensilsAndCondiments.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Gecersiz adres bilgisi girilir.
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdress.click();
        JSUtilities.scrollToElement(Driver.getDriver(),checkoutPage.deliveryAdressEditButton);
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdressApartmentFloorBox.clear();
        checkoutPage.deliveryAdressApartmentFloorBox.sendKeys(ConfigReader.getProperty("GecersizAdres"));
        Select select= new Select(checkoutPage.deliveryOptionsButton);
        select.selectByVisibleText("Leave it at my door");
        select.getFirstSelectedOption();
        checkoutPage.deliveryAdressSaveButton.click();


        //Geçerli odeme bilgisi girilir.
        try {
            checkoutPage.cashOnDeliveryButton.click();
        } catch (Exception e) {
            JSUtilities.scrollToElement(Driver.getDriver(), checkoutPage.cashOnDeliveryButton);
            checkoutPage.cashOnDeliveryButton.click();
        }
        checkoutPage.addCashButton.click();

        //Siparis verilemediği doğrulanır.
        try {
            checkoutPage.placeOrderButton.click();
        } catch (Exception e) {
            checkoutPage.addCashOnDeliveryClose.click();
            checkoutPage.placeOrderButton.click();
        }


        try {
            softAssert.assertFalse(checkoutPage.siparisOnayYazisi.isDisplayed(),"Eksik adres bilgileri ile siparis verildi!!");
        } catch (Exception e) {
            softAssert.assertFalse(false);
        }

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();  //bitti
        }
    }
    ////////////***********   TEST 5 ************////////////////////////////////////////////////////////
    @Test
    public void gecersizOdemeGecerliAdresBilgisiIleSiparisTesti(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        // Sepete restauranttaki ilk urun eklenir.
        sepeteUrunEklemeMethodu();

        //Sepetteki checkout butonu ile ödeme sayfasına gidilir.
        restaurantUmiSakeHouse.checkoutButton.click();

        // Delivery option secilir
        checkoutPage.deliveryButton.click();
        checkoutPage.orderTypeDelivery.click();
        checkoutPage.orderTypeSaveButton.click();

        // Promotion option secilir
        checkoutPage.promotionsButton.click();
        checkoutPage.promotionsOption2.click();
        checkoutPage.promotionsSave.click();


        // Include utensils and condiments option secilir
        checkoutPage.includeUtensilsAndCondiments.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Gecerli adres bilgisi girilir
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdress.click();
        JSUtilities.scrollToElement(Driver.getDriver(),checkoutPage.deliveryAdressEditButton);
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdressApartmentFloorBox.clear();
        checkoutPage.deliveryAdressApartmentFloorBox.sendKeys(ConfigReader.getProperty("GecerliAdres"));
        checkoutPage.deliveryAdressSaveButton.click();


        //Geçesiz odeme bilgisi girilir.
        try {
            checkoutPage.stripeButton.click();
        } catch (Exception e) {
            odemeBilgileriSilmeMethodu();
            checkoutPage.stripeButton.click();
        }

        Driver.getDriver().switchTo().frame(checkoutPage.krediKartiIframe);
        checkoutPage.krediKartiNumberTextBox.sendKeys(ConfigReader.getProperty("GecersizKKNumaraBilgileri"));
        checkoutPage.krediKartiDateTextBox.sendKeys(ConfigReader.getProperty("GecersizKKTarihBilgileri"));
        checkoutPage.krediKartiCvcTextBox.sendKeys(ConfigReader.getProperty("GecersizKKCVCbilgileri"));
        Driver.getDriver().switchTo().parentFrame();
        checkoutPage.addStripeButonu.click();
        try {
            softAssert.assertTrue(checkoutPage.krediKartinizGecersizYazisi
                    .isDisplayed(),"Gecersiz kredi karti bilgileri onaylaniyor!!");
        } catch (Exception e) {
            checkoutPage.placeOrderButton.click();
            softAssert.assertFalse(checkoutPage.siparisOnayYazisi.isDisplayed(),"Gecersiz odeme bilgileri ile siparis verilebiliyor.");
        }
        checkoutPage.addStripeCloseButonu.click();

        //Siparis verilemediği doğrulanır.

        try {
            softAssert.assertTrue(checkoutPage.gecerliOdemeBilgileriGirYazisi
                        .isDisplayed(),"Gecersiz odeme bilgileri ile odeme yapilabiliyor.");
        } catch (Exception e) {
            checkoutPage.placeOrderButton.click();
            softAssert.assertFalse(checkoutPage.siparisOnayYazisi.isDisplayed(),"Gecersiz odeme bilgileri ile siparis verilebiliyor.");
        }


        //Tarayici kapatılır.
       try {
           softAssert.assertAll();
       } finally {
           Driver.closeDriver();  //bitti
       }

    }
    ////////////***********   TEST 6 ************////////////////////////////////////////////////////////

    @Test
    public void gecerliAdresGecerliOdemeBilgisiIleSiparisTesti(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();
        restaurantUmiSakeHouse=new User_RestaurantUmiSakeHouse();
        checkoutPage=new User_CheckoutPage();
        actions=new Actions(Driver.getDriver());

        // Sepete restauranttaki ilk urun eklenir.
        sepeteUrunEklemeMethodu();

        //Sepetteki checkout butonu ile ödeme sayfasına gidilir.
        restaurantUmiSakeHouse.checkoutButton.click();

        // Delivery option secilir
        checkoutPage.deliveryButton.click();
        checkoutPage.orderTypeDelivery.click();
        checkoutPage.orderTypeSaveButton.click();

        // Promotion option secilir
        checkoutPage.promotionsButton.click();
        checkoutPage.promotionsOption2.click();
        checkoutPage.promotionsSave.click();

        // Include utensils and condiments option secilir
        checkoutPage.includeUtensilsAndCondiments.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Gecerli adres bilgisi girilir
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdress.click();
        JSUtilities.scrollToElement(Driver.getDriver(),checkoutPage.deliveryAdressEditButton);
        ReusableMethods.wait(0.5);
        checkoutPage.deliveryAdressApartmentFloorBox.clear();
        checkoutPage.deliveryAdressApartmentFloorBox.sendKeys(ConfigReader.getProperty("GecerliAdres"));
        checkoutPage.deliveryAdressSaveButton.click();


        //Geçerli odeme bilgisi girilir.
        try {
            checkoutPage.stripeButton.click();
        } catch (Exception e) {
            odemeBilgileriSilmeMethodu();
            checkoutPage.stripeButton.click();
        }
        Driver.getDriver().switchTo().frame(checkoutPage.krediKartiIframe);
        checkoutPage.krediKartiNumberTextBox.sendKeys(ConfigReader.getProperty("GecerliKKNumaraBilgileri"));
        checkoutPage.krediKartiDateTextBox.sendKeys(ConfigReader.getProperty("GecerliKKTarihBilgileri"));
        checkoutPage.krediKartiCvcTextBox.sendKeys(ConfigReader.getProperty("GecerliKKCVCbilgileri"));
        checkoutPage.krediKartiPostaKoduTextBox.sendKeys(ConfigReader.getProperty("GecerliKKPostaKoduBilgileri"));
        Driver.getDriver().switchTo().parentFrame();
        checkoutPage.addStripeButonu.click();
        checkoutPage.placeOrderButton.click();

        //Siparis verilebildiği doğrulanır.
        try {
            softAssert.assertTrue(checkoutPage.siparisOnayYazisi
                    .isDisplayed());
        } catch (Exception e) {
            softAssert.assertTrue(false,"Gecerli adres ve odeme bilgileri ile siparis verilemiyor.");
        }

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();  //bitti
        }

    }
    @BeforeMethod
    public void beforeMethod(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        // Tarayıcı açılır.
        // Url e gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        // Cookies kabul edilir.
        homepage.cookieAcceptButton.click();

        // Kullanıcı sayfasına login olunur.
        ReusableMethods.userLoginMethod("duyguUserName","duyguUserPassword");

        // Anasayfadaki teslimat adresi kutusuna gecerli posta kodu(=10001) girilir.
        homepage.adresButton.sendKeys(ConfigReader.getProperty("adres"));

        // Ilk satırdakı 10001 posta koduna tıklanır.
        homepage.adres10001.click();


    }
    /*
    @AfterMethod
    public void afterMethod(){
        homepage=new User_Homepage();
        softAssert=new SoftAssert();

        //Tarayici kapatılır.
        try {
            softAssert.assertAll();
        } finally {
            Driver.closeDriver();
        }
    }
     */
    public void sepeteUrunEklemeMethodu(){

        if (!(Driver.getDriver().getCurrentUrl().equals("https://qa.mealscenter.com/restaurants"))) {
            Driver.getDriver().get("https://qa.mealscenter.com/restaurants");
        }
        //Umi Sake Hause restaurant tıklanır.
        homepage.umiSakeHouseRestaurantButton.click();

        // Ilk ürün 'add to cart' butonu ile sepete eklenir.
        restaurantUmiSakeHouse.ilkUrunAddToCartButton.click();
    }
    public void odemeBilgileriSilmeMethodu(){

            JSUtilities.scrollToElement(Driver.getDriver(),checkoutPage.cashOnDeliveryDeleteButonuUcNokta);
            checkoutPage.cashOnDeliveryDeleteButonuUcNokta.click();
            checkoutPage.cashOnDeliveryDeleteButonuDelete.click();
            ReusableMethods.wait(0.1);
            try {
                ReusableMethods.waitForVisibility(checkoutPage.cashOnDeliveryDeleteButonuUcNokta,3);
                checkoutPage.cashOnDeliveryDeleteButonuUcNokta.click();
                checkoutPage.cashOnDeliveryDeleteButonuDelete.click();
                ReusableMethods.wait(0.1);
            } catch (Exception e) {}
    }
}
