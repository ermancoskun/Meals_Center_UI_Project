package tests.US_005_030_031_032;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import utilities.TestBaseRaporClass;

public class US_032_A_Sizes extends TestBaseRapor {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    SoftAssert softAssert = new SoftAssert();
    Faker faker=new Faker();

    @BeforeClass
    public void setUp()  {
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
    public void tc03205() {
        extentTest = extentReports.createTest("Size List sayfası update fonksiyon testi",
                "Size List sayfasinde urunleri update edebilmeli");
        faker=new Faker();
        String ilkName=faker.name().name();
        ReusableMethods.wait(1);
        String updateName=faker.name().nameWithMiddle();
        merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.addNewButton.click();
        ReusableMethods.wait(1);
        merchant_dashboard.sizeNameBox.sendKeys(ilkName);
        merchant_dashboard.saveButton.click();
        ReusableMethods.wait(1);
        merchant_dashboard.updateButton.click();
        merchant_dashboard.sizeNameBox.clear();
        merchant_dashboard.sizeNameBox.sendKeys(updateName);
        merchant_dashboard.saveButton.click();
        ReusableMethods.wait(1);
        softAssert.assertTrue(merchant_dashboard.succesfullyUpdatedYazisi.isDisplayed(), "update basarisiz");
        merchant_dashboard.sizeLinkiActive.click();
        String eklenenName=merchant_dashboard.listIlkName.getText();
        softAssert.assertEquals(updateName+" Publish",eklenenName);
        merchant_dashboard.deleteButtonSizeAll.click();
        ReusableMethods.wait(1);
        ReusableMethods.waitForVisibility(merchant_dashboard.deleteConfirmationButton,2);
        merchant_dashboard.deleteConfirmationButton.click();
        softAssert.assertAll();
        extentTest.pass("Size List sayfasinde urun basariyla update edildi.");
    }



}
