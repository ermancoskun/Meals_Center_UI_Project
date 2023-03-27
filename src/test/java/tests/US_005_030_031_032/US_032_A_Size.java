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

public class US_032_A_Size extends TestBaseRaporClass {
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
        merchant_dashboard.sizeLinki.click();
        extentTest.pass("Sİze linkine tiklandi.");

    }

    @Test
    public void tc03201() {
        extentTest = extentReports.createTest("Size List sayfasi testi", "Size List sayfasi acilmali");
        merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.sizeSayfasiBasligi.isDisplayed(), "Size List sayfasi acilmadi");
        extentTest.pass("Size List sayfasi basarili bir sekilde acildi.");
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
        extentTest.pass("Size sayfasi noBasligi, nameBasligi, actionsBasligi, searchSizeBox, addNewButton basliklari ve simgeleri goruldu.");
    }

    @Test
    public void tc03203() {
        extentTest = extentReports.createTest("Size List yeni urun ekleme ve silme testi",
                "Size List yeni urun eklenebilmeli ve urun silinebilmeli");
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
        extentTest.pass("Size liste urun ekleme ve silme basariyla gerceklesti");
/*
        List<WebElement> listName = Driver.getDriver().findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody//td[2]"));
        for (WebElement element : listName) {
            System.out.println(element.getText());
        }
 */
    }

    @Test
    public void tc03204() {
        extentTest = extentReports.createTest("Size Liste sadece ozel karekter ya da rakamlardan olusan isim girme testi",
                "Size Liste sadece ozel karekter ya da rakamlardan olusan isim girilmemeli");
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        String addSizeNameOzelKarakter=",;*+-";
        merchant_dashboard.sizeNameBox.sendKeys(addSizeNameOzelKarakter);
        merchant_dashboard.saveButton.click();
        String eklenenNameOzelKarakter=merchant_dashboard.listIlkName.getText();
        softAssert.assertNotEquals(addSizeNameOzelKarakter+" Publish",eklenenNameOzelKarakter,"Size Liste sadece ozel karekterli isim eklendi");
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        merchant_dashboard.addNewButton.click();
        String addSizeNameRakam="0123456987";
        merchant_dashboard.sizeNameBox.sendKeys(addSizeNameRakam);
        merchant_dashboard.saveButton.click();
        String eklenenNameRakam=merchant_dashboard.listIlkName.getText();
        softAssert.assertNotEquals(addSizeNameRakam+" Publish",eklenenNameRakam,"Size Liste sadece rakamlardan olusan isim eklendi");
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        softAssert.assertAll();

        extentTest.pass("Size Liste sadece ozel karekter ya da rakamlardan olusan isim girilmedi");
    }

    @Test
    public void tc03205() {
        extentTest = extentReports.createTest("Size List sayfası update fonksiyon testi",
                "Size List sayfasinde urunleri update edebilmeli");
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
        merchant_dashboard.sizeLinkiActive.click();
        String eklenenName=merchant_dashboard.listIlkName.getText();
        softAssert.assertEquals(updateName+" Publish",eklenenName);
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        softAssert.assertAll();
        extentTest.pass("Size List sayfasinde urun basariyla update edildi.");
    }


    @Test
    public void tc03206() {
        extentTest = extentReports.createTest("Size Add bolumunde aynı isimli urunun tekrarlı kayıt yapılamama testi",
                "Size Add bolumunde aynı isimli urun tekrarli kayit yapilamamali");
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

        Assert.assertNotEquals(eklenenName1,eklenenName2);

        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();

        extentTest.pass("Size Add bolumunde aynı isimli urunun kayıt yapılmadigi test edildi");

    }


    @Test
    public void tc03207() {
        extentTest = extentReports.createTest("Size List sayfasinda search box testi",
                "Size List sayfasinda search box ta arama yapilmali");
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
        extentTest.pass("Size List sayfasinda search box ta arama basariyla yapildi.");
    }

}
