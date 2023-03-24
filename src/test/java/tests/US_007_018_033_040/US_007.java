package tests.US_007_018_033_040;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class US_007 {
    //1)bir browser ac
    //2)"https://qa.mealscenter.com/" url uzerinden 'mealscenter' sitesine gider
    //3) cokies kabul eder
    //4)dogru sayfada oldugunu mealscenter logosu ve gecerli url ile dogrular
    //5) sayfayi en alta indirir
    //6)Anasayfa uzerinde contuct us linkinin gorunur oldugunutest eder.
    //7)sayfayi kapatir
    User_Homepage user_homepage;
    Actions actions;

    @Test
    public void contactUsLinkSeen() {
        user_homepage = new User_Homepage();
        //1)bir browser ac
        //2)"https://qa.mealscenter.com/" url uzerinden 'mealscenter' sitesine gider
        //3) cokies kabul eder
        ReusableMethods.goTouserHomePage();
        String expectedUrl = ConfigReader.getProperty("userUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(actualUrl.equals(expectedUrl));
        assertTrue(user_homepage.ilkLogoElementi.isDisplayed());
        //5) sayfayi en alta indirir
        JSUtilities.scrollToBottom(Driver.getDriver());
        //6)Anasayfa uzerinde contuct us linkinin gorunur oldugunutest eder.
        assertTrue(user_homepage.contactusLinkElementi.isDisplayed());
    }

    @Test
    public void contactUsPageAccessTest() {
        user_homepage = new User_Homepage();//class levelda olusturulup deger atamasi yapılmadi icin
        actions = new Actions(Driver.getDriver());
        ReusableMethods.goTouserHomePage();
        actions.sendKeys(Keys.CONTROL).keyDown(Keys.END).perform();
        ReusableMethods.wait(2);
        user_homepage.contactusLinkElementi.click();
        String expectedIcerik = "contactus";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(actualUrl.contains(expectedIcerik));
    }

    @Test
    public void verificationOfContactInformationTest() {
        user_homepage = new User_Homepage();
        actions = new Actions(Driver.getDriver());
        ReusableMethods.goTouserHomePage();
        actions.sendKeys(Keys.CONTROL).keyDown(Keys.END).perform();
        ReusableMethods.wait(2);
        user_homepage.contactusLinkElementi.click();
        String expectedSitePhoneNumber = ConfigReader.getProperty("sitePhoneNumber");
        String expectedSiteContactGmail = ConfigReader.getProperty("siteContactGmail");
        String actualPhoneNummer = user_homepage.contactPhoneNumberElementi.getText();
        String actualContactGmail = user_homepage.contactGmailElementi.getText();
        assertEquals(actualPhoneNummer, expectedSitePhoneNumber);
        assertEquals(actualContactGmail, expectedSiteContactGmail);

    }

    @Test
    public void contactMessageSendingTest() {
        user_homepage = new User_Homepage();
        actions = new Actions(Driver.getDriver());
        //1)bir browser ac.
        //2)"https://qa.mealscenter.com/" url uzerinden 'mealscenter' sitesine gider.
        //3)Cookies kabul edilir.
        //5)anasayfayi en alta indirir.
        //6)'Contact us' linkine tıklar.
        //7)tamad  kutusuna ismini yazar.
        //8)email kutusuna email yazar.
        //9)mesaj bolumune mesajini yazar.
        //10)gondermek butonuna basar.
        //11)"Talebiniz gönderildi." yazisinin cıktıgını dogrular.
        //12)sayfayi kapatir
        ReusableMethods.goTouserHomePage();
        actions.sendKeys(Keys.CONTROL).keyDown(Keys.END).perform();
        ReusableMethods.wait(2);
        user_homepage.contactusLinkElementi.click();
        actions.sendKeys(user_homepage.contactPageFulnameBox, "mehmet test")
                .sendKeys(Keys.TAB)
                .sendKeys("merden25@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Bu bir test mesajidir").perform();
        user_homepage.contactPageSubmitButton.click();
        assertTrue(user_homepage.successfulMessageElementi.isDisplayed());
        Driver.closeDriver();

    }

}
