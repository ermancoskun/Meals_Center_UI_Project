package tests.US_005_030_031_032;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseRaporClass;

public class US_032_B_Ingredients extends TestBaseRaporClass {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setUp() {
        extentTest = extentReports.createTest("Merchant sayfasının acilmasi",
                "Merchant sayfasi acilmali");
        merchant_dashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLogin();
        merchant_dashboard.attributesLinki.click();
        extentTest.info("Attributesi linkine tiklandi.");
        merchant_dashboard.ingredientsLinki.click();
        extentTest.pass("Sİze linkine tiklandi.");

    }

    @Test
    public void tc03201() {
        extentTest = extentReports.createTest("Ingredients List sayfasi testi", "Ingredients List sayfasi acilmali");
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.sizeSayfasiBasligi.isDisplayed(), "Ingredients List sayfasi acilmadi");
        extentTest.pass("Ingredients List sayfasi basarili bir sekilde acildi.");
    }

    @Test
    public void tc03202() {
        extentTest = extentReports.createTest("noBasligi, nameBasligi, actionsBasligi, searchSizeBox, addNewButton baslıkları ve simgeleri gorunurlugu testi",
                "noBasligi, nameBasligi, actionsBasligi, searchSizeBox, addNewButton baslıkları ve simgeleri gorunur olmali");
        merchant_dashboard = new Merchant_Dashboard();
        softAssert = new SoftAssert();
        softAssert.assertTrue(merchant_dashboard.noBasligi.isDisplayed(), "noBasligi gorulmedi");
        softAssert.assertTrue(merchant_dashboard.nameBasligi.isDisplayed(), "nameBasligi gorulmedi");
        softAssert.assertTrue(merchant_dashboard.actionsBasligi.isDisplayed(), "actionsBasligi gorulmedi");
        softAssert.assertTrue(merchant_dashboard.searchSizeBox.isDisplayed(), "searchSizeBox gorulmedi");
        softAssert.assertTrue(merchant_dashboard.addNewButton.isDisplayed(), "addNewButton gorulmedi");
        softAssert.assertTrue(merchant_dashboard.noBasligi.isDisplayed(), "size sayfasi acilmadi");
        softAssert.assertAll();
        extentTest.pass("Ingredients List sayfasi noBasligi, nameBasligi, actionsBasligi, searchSizeBox, addNewButton basliklari ve simgeleri goruldu.");
    }

    @Test
    public void tc03203() {
        extentTest = extentReports.createTest("Ingredients List yeni urun ekleme ve silme testi",
                "Ingredients List yeni urun eklenebilmeli ve urun silinebilmeli");
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        String addNameStr="Big Battal";
        merchant_dashboard.sizeNameBox.sendKeys(addNameStr);
        merchant_dashboard.saveButton.click();
        String eklenenName=merchant_dashboard.listIlkName.getText();
        Assert.assertEquals(addNameStr+" Publish",eklenenName);
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        extentTest.pass("Ingredients List e urun ekleme ve silme basariyla gerceklesti");
/*
        List<WebElement> listName = Driver.getDriver().findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody//td[2]"));
        for (WebElement element : listName) {
            System.out.println(element.getText());
        }
 */
    }

    @Test
    public void tc03204() {
        extentTest = extentReports.createTest("Ingredients List e sadece ozel karekter ya da rakamlardan olusan isim girme testi",
                "Ingredients List e sadece ozel karekter ya da rakamlardan olusan isim girilmemeli");
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        String addSizeNameOzelKarakter=",;*+-";
        merchant_dashboard.sizeNameBox.sendKeys(addSizeNameOzelKarakter);
        merchant_dashboard.saveButton.click();
        String eklenenNameOzelKarakter=merchant_dashboard.listIlkName.getText();
        softAssert.assertNotEquals(addSizeNameOzelKarakter+" Publish",eklenenNameOzelKarakter,"Ingredients List e sadece ozel karekterli isim eklendi");
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        merchant_dashboard.addNewButton.click();
        String addSizeNameRakam="0123456987";
        merchant_dashboard.sizeNameBox.sendKeys(addSizeNameRakam);
        merchant_dashboard.saveButton.click();
        String eklenenNameRakam=merchant_dashboard.listIlkName.getText();
        softAssert.assertNotEquals(addSizeNameRakam+" Publish",eklenenNameRakam,"Ingredients List e sadece rakamlardan olusan isim eklendi");
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        softAssert.assertAll();

        extentTest.pass("Size Liste sadece ozel karekter ya da rakamlardan olusan isim girilmedi");
    }

    @Test
    public void tc03205() {
        extentTest = extentReports.createTest("Ingredients List sayfası update fonksiyon testi",
                "Ingredients List sayfasinde urunleri update edebilmeli");
        Faker faker=new Faker();
        String ilkName=faker.name().name();
        String updateName=faker.name().nameWithMiddle();
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.sizeNameBox.sendKeys(ilkName);
        merchant_dashboard.saveButton.click();

        merchant_dashboard.updateButton.click();
        merchant_dashboard.sizeNameBox.clear();
        merchant_dashboard.sizeNameBox.sendKeys(updateName);
        merchant_dashboard.saveButton.click();
        softAssert.assertTrue(merchant_dashboard.succesfullyUpdatedYazisi.isDisplayed(), "update basarisiz");
        merchant_dashboard.ingredientsLinkiActive.click();
        String eklenenName=merchant_dashboard.listIlkName.getText();
        softAssert.assertEquals(updateName+" Publish",eklenenName);
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        softAssert.assertAll();
        extentTest.pass("Ingredients List sayfasinde urun basariyla update edildi.");
    }


    @Test
    public void tc03206() {
        extentTest = extentReports.createTest("Ingredients Add bolumunde aynı isimli urunun tekrarlı kayıt yapılamama testi",
                "Ingredients Add bolumunde aynı isimli urun tekrarli kayit yapilamamali");
        Faker faker=new Faker();
        String addNameStrFkr=faker.name().name();
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.sizeNameBox.sendKeys(addNameStrFkr);
        merchant_dashboard.saveButton.click();
        String eklenenName1=merchant_dashboard.listIlkName.getText();

        merchant_dashboard.addNewButton.click();
        merchant_dashboard.sizeNameBox.sendKeys(addNameStrFkr);
        merchant_dashboard.saveButton.click();
        String eklenenName2=merchant_dashboard.listIlkName.getText();

        softAssert.assertNotEquals(eklenenName1,eklenenName2,"Ayni urun tekrarli eklenebiliyor");


        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        extentTest.pass("Ingredients Add bolumunde aynı isimli urunun kayıt yapılmadigi test edildi");
        softAssert.assertAll();
    }


    @Test
    public void tc03207() {
        extentTest = extentReports.createTest("Ingredients List sayfasinda search box testi",
                "Ingredients List sayfasinda search box ta arama yapilmali");
        Faker faker=new Faker();
        String addNameStrFkr=faker.name().name();
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.sizeNameBox.sendKeys(addNameStrFkr);
        merchant_dashboard.saveButton.click();
        String eklenenName=merchant_dashboard.listIlkName.getText();
        merchant_dashboard.searchSizeBox.sendKeys(addNameStrFkr, Keys.ENTER);
        String arananName=merchant_dashboard.listIlkName.getText();
        Assert.assertEquals(eklenenName,arananName);
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        extentTest.pass("Ingredients List sayfasinda search box ta arama basariyla yapildi.");
    }

}
