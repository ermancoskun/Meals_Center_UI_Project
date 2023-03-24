package tests.US_012_013_021_039_duygu;

import pages.User_Homepage;
import pages.User_LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class ortakMethodlar {

    static User_Homepage homepage=new User_Homepage();
    static User_LoginPage loginPage=new User_LoginPage();

    public static void loginMethodu(){
        homepage=new User_Homepage();
        loginPage=new User_LoginPage();



        // Anasayfadaki sign in butonuna tıklanır.
        homepage.homePageSignInButton.click();

        // Acılan login sayfasına gecerli email adresi girilir
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("duyguUserName"));

        // Gecerli password girilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("duyguUserPassword"));

        // Sign in butonuna tıkalnır.
        loginPage.loginSignInButton.click();

        // Anasayfadaki teslimat adresi kutusuna gecerli posta kodu(=10001) girilir.
        homepage.adresButonu.sendKeys(ConfigReader.getProperty("adres"));

        // Ilk satırdakı 10001 posta koduna tıklanır.
        homepage.adres10001.click();
    }
    public static void azBekle(double saniye) { // bu method, 1 saniyeden daha kısa bekleyebilmek icindir.
        try {
            Thread.sleep((long) (saniye * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
