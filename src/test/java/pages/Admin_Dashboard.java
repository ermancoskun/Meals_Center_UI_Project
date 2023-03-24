package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_Dashboard {
    public Admin_Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //adminUrl>backoffice>login/usernameBox
    @FindBy (xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement usernameBox;


    //adminUrl>backoffice>login/passwordBox
    @FindBy (xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement passwordBox;

    //adminUrl>backoffice>login/signinButton
    @FindBy (xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement signinButton;


}
