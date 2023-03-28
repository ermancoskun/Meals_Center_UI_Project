package tests.US_005_030_031_032;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import pages.User_CheckoutPage;
import pages.User_Homepage;
import pages.User_RestaurantUmiSakeHouse;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.security.SecureRandom;
import java.util.List;

public class Calisma {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker=new Faker();
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void calisma() {





    }


}