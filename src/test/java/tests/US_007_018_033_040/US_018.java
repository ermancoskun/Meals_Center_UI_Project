package tests.US_007_018_033_040;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import pages.Merchant_Dashboard;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class US_018 {
    Admin_Dashboard ad;
    Merchant_Dashboard md;
    User_Homepage ud;
    Actions actions;
    @Test
    public void userSuccessfulLogin(){
        ud=new User_Homepage();
        actions=new Actions(Driver.getDriver());
        //1)bir browser aç.
        //2)"https://qa.mealscenter.com/" url uzerinden 'mealscenter' sitesine gider.
        //3)Cookies kabul edilir.
       /* ReusableMethods.goTouserHomePage();
        //4)Sign in butonuna basar.
        ud.signInButton.click();
        WebElement emailbox= Driver.getDriver().findElement(By.xpath("//label[@for='username']"));
        actions.sendKeys(emailbox,"merden25@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("M123456789")
                .click(Driver.getDriver().findElement(By.xpath("//span[text()='Sign in']"))).perform();

        */

        //5)geccerli emailini email kutusuna yazar.

        //6)gecerli sifresini sifre kutusuna yazar.
        //7)Sign in butonuna basar.
        //ReusableMethods.wait(2);
        //ReusableMethods.goTouserHomePage();
        ReusableMethods.userLoginMethod(ConfigReader.getProperty("betulUserEmail"),ConfigReader.getProperty("betulUserPassword"));
        WebElement userName=Driver.getDriver().findElement(By.xpath("//li/div/a"));
        //8)basarili giris yapıldı yazisinin cıktıgını dogrular.
        //9)giris yapildıktan sonra kendi isminin sayfanın sag ust kosesinde yazdigini kontrol eder
        assertTrue(userName.isDisplayed());
        //9)sayfayi kapatir
        Driver.closeDriver();
    }

}
