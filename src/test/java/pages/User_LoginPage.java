package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class User_LoginPage {

    public User_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // mealscenter.com/account/login >> mail kutusu(Mobile number or email)
    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailBox;

    // mealscenter.com/account/login >> passwordbox(Password*)
    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordBox;

    // mealscenter.com/account/login >> Sign in butonu
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement loginSignInButton;


}
