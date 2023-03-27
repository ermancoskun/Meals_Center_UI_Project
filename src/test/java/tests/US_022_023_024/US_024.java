package tests.US_022_023_024;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.assertTrue;

public class US_024 extends TestBaseRapor {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    Actions actions;

    @Test

    public void test01() {
        merchant_dashboard = new Merchant_Dashboard();
        actions = new Actions(Driver.getDriver());

        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //-Food dropdownın altında category seçeneğinin görünür  olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");

        assertTrue(merchant_dashboard.CategoryListYazısı.isDisplayed());

        extentTest.pass("Category Sayfasına gittiğim doğrulanır.");


    }

    @Test
    public void test02() {
        merchant_dashboard = new Merchant_Dashboard();

        actions = new Actions(Driver.getDriver());
        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //-Food dropdownın altında category seçeneğine tıkladığımda category list sayfasına yönlendirildiğim doğrulanmalı.
        //- Category list sayfasındaki ögelerin görünür olduğu doğrulanmalı.
        //- Tarayıcı kapatılır.

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");

        assertTrue(merchant_dashboard.CategoryListYazısı.isDisplayed());

        extentTest.pass("Category Sayfasına gittiğim doğrulanır.");

        assertTrue(merchant_dashboard.SignatureRoll.isEnabled());

        extentTest.pass("Signature Roll kategorisinin erişilebilirliği test edildi");

        assertTrue(merchant_dashboard.MakiandclassicRoll.isEnabled());

        extentTest.pass("MakiandclassicRoll kategorisinin erişilebilirliği test edildi");

        assertTrue(merchant_dashboard.Sushibox.isEnabled());

        extentTest.pass("Sushibox kategorisinin erişilebilirliği test edildi");

        assertTrue(merchant_dashboard.PickedForYou.isEnabled());

        extentTest.pass("PickedForYou kategorisinin erişilebilirliği test edildi");


    }

    @Test
    public void test03() {
        merchant_dashboard = new Merchant_Dashboard();

        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");

        merchant_dashboard.AddNewButonu.click();


        extentTest.info("AddNew Butonuna basıldı.");

        merchant_dashboard.NameBox.sendKeys("mehmet");

        extentTest.info("Name boxına isim yazıldı.Böylece erişebilirliğide test edildi.");

        merchant_dashboard.Descriptionbox.sendKeys("Bu menü çok lezzetlidir.");

        extentTest.info("Description boxına tanım yazıldı.Böylece erişebilirliğide test edildi.");

        merchant_dashboard.Browsebox1.click();

        extentTest.info("Browse1 boxına tıklanır.");

        ReusableMethods.waitForPageToLoad(5);

        merchant_dashboard.FeaturedImage.click();

        extentTest.info("FeaturedImage için bir resim seçildi.");

        merchant_dashboard.AddFilesButonu.click();

        extentTest.info("AddFiles butonuna tıklandı");

        ReusableMethods.wait(7);

        merchant_dashboard.Browsebox2.click();

        extentTest.info("browse2 boxına tıklandı");

        ReusableMethods.waitForVisibility(merchant_dashboard.IconImage, 5);

        merchant_dashboard.IconImage.click();

        extentTest.info("IconImage için bir resim seçildi.");

       merchant_dashboard.AddFiles2.click();

       extentTest.info("AddFiles2 butonuna tıklandı");

        ReusableMethods.waitForVisibility(merchant_dashboard.DishBox, 3);

        merchant_dashboard.DishBox.click();

        actions.sendKeys(Keys.ENTER).perform();

        extentTest.info("Dish Boxı için Meal seçeneği seçildi.");

        Select select = new Select(merchant_dashboard.StatusBox);
        select.selectByVisibleText("Draft");


        extentTest.info("Status boxı için seçim yapıldı.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(1);

        merchant_dashboard.Savebox.click();

        extentTest.info("Yapılan değişiklikler kaydedildi.");

        assertTrue(merchant_dashboard.SuccesfullyCreatedYazısı.isDisplayed());

        extentTest.pass("Değişikliklerin başarıyla yapıldığı test edildi.");



    }

    @Test
    public void test04() {
        merchant_dashboard = new Merchant_Dashboard();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");

        merchant_dashboard.AddNewButonu.click();


        extentTest.info("AddNew Butonuna basıldı.");

        merchant_dashboard.Browsebox2.click();

        extentTest.info("browse2 boxına tıklandı");

        ReusableMethods.waitForVisibility(merchant_dashboard.IconImage, 5);

       merchant_dashboard.IconImage.click();

        extentTest.info("IconImage için bir resim seçildi.");

        merchant_dashboard.AddFiles2.click();

        extentTest.info("AddFiles2 butonuna tıklandı");

        ReusableMethods.waitForVisibility(merchant_dashboard.DishBox, 3);

        merchant_dashboard.DishBox.click();

        actions.sendKeys(Keys.ENTER).perform();

        extentTest.info("Dish Boxı için Meal seçeneği seçildi.");

        Select select = new Select(merchant_dashboard.StatusBox);
        select.selectByVisibleText("Draft");


        extentTest.info("Status boxı için seçim yapıldı.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(1);

        merchant_dashboard.Savebox.click();

        extentTest.info("Yapılan değişiklikler kaydedildi.");

        assertTrue(merchant_dashboard.SuccesfullyCreatedYazısı.isDisplayed());

        extentTest.pass("Değişikliklerin başarıyla yapıldığı test edildi.");


    }

    @Test
    public void test05() {
        merchant_dashboard = new Merchant_Dashboard();
//-Tarayıcı açılır.
//
//-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
//- Doğru mail ve password ile hesabıma giriş yapılır.
//-Food dropdownın altında category seçeneğine tıklanır.

        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");

//-Update butonuna tıklanır.
        merchant_dashboard.UpdateButonu.click();
        extentTest.info("Update butonuna basıldı.");

//-Details butonunun görünür ve seçili olduğu doğrulanır.
        assertTrue(merchant_dashboard.DetailsBox.isDisplayed());
        extentTest.pass("Details butonu görünür olduğu doğrulanır.");

//-Name boxının görünür ve clickable olduğu doğrulanır.
        assertTrue(merchant_dashboard.NameBox.isEnabled());
        extentTest.pass("Name boxının erişilebilir olduğu doğrulanır.");
//-Description boxınıngörünür ve clickable olduğu doğrulanır.
        assertTrue(merchant_dashboard.Descriptionbox.isEnabled());
        extentTest.pass("Description boxının erişilebilir olduğu doğrulanır.");

//-Featured Image boxındaki Browse seçeneğinin görünür ve active olduğu doğrulanır.
        assertTrue(merchant_dashboard.Browsebox1.isEnabled());
        extentTest.pass("Browsebox1 erişilebilir olduğu doğrulanır.");

//-Browse boxı seçildiğinde SelectFile sayfasına yönlendirildiğim doğrulanmalı.
//-SelectFile dosyasındaki herhangi bir resmin active olduğu doğrulanır.
//-SelectFile dosyasındaki bir resim seçildiğinde AddFiles boxının görünür va aktive olduğu doğrulanmalı.
//-SelectFile dosyasındaki previous ve next boxlarının görünür ve aktive olduğu doğrulanmalı.
//-SelectFile dosyasındaki search boxının görünür ve aktive olduğu doğrulanmalı.
//-Icon Image boxındaki Browse seçeneğinin görünür ve active olduğu doğrulanır.
//-Browse boxı seçildiğinde SelectFile sayfasına yönlendirildiğim doğrulanmalı.
//-SelectFile dosyasındaki herhangi bir resmin active olduğu doğrulanır.
//-SelectFile dosyasındaki bir resim seçildiğinde AddFiles boxının görünür va aktive olduğu doğrulanmalı.
//-SelectFile dosyasındaki previous ve next boxlarının görünür ve aktive olduğu doğrulanmalı.
//-SelectFile dosyasındaki search boxının görünür ve aktive olduğu doğrulanmalı.
//
//-Dish boxının görünür ve clickable olduğu doğrulanır.
//-Status Image boxının görünür ve clickable olduğu doğrulanır.
//-Item Translations dropdown menunun görünür ve clickable olduğu doğrulanır.
//
//-Dropdown menüsü altında Japanese translation boxının görünür ve clickable olduğu doğrulanır.
//-Dropdown menüsü altında Enter Japanese description here boxının görünür ve clickable olduğu doğrulanır.
//-Dropdown menüsü altında Arabic translation boxının görünür ve clickable olduğu doğrulanır.
//-Dropdown menüsü altında Enter Arabic description here boxının görünür ve clickable olduğu doğrulanır.
//-Save boxının görünür ve clickable olduğu doğrulanır.
//- Tarayıcı kapatılır.


    }

    @Test
    public void test06() {
        extentTest = extentReports.createTest("profilegitme", "profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("Food Butonuna basıldı.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Butonuna basıldı.");


    }


}
