package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant_Dashboard {

    public Merchant_Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Merchant Login/usernameBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement usernameBox;

    //Merchant Login/passwordBox
    @FindBy (xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement passwordBox;

    //Merchant Login/signInButton
    @FindBy (xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement signInButton;


    //merchant>dashboard/orders link
    @FindBy (xpath = "//li[@class='merchant_orders']")
    public WebElement ordersLink;

    //merchant>dashboard/scheduled Link
    @FindBy (xpath = "//a[text()='Scheduled']")
    public WebElement scheduledLink;

    //merchant>backoffice/orders>scheduled/scheduledBaslikText
    @FindBy (xpath = "//div[@class='flex-col d-none d-lg-block']")
    public WebElement scheduledBaslikText;

    //merchant>backoffice/orders>scheduled/completedTodayCount
    @FindBy (xpath = "//div[@class='ronded-green']")
    public WebElement completedTodayCount;

    //merchant>backoffice/orders>scheduled/acceptedButton
    @FindBy (xpath = "//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement acceptedButton;

    //merchant>backoffice/orders>scheduled/rejectButton
    @FindBy (xpath = "//span[text()='Reject']")
    public WebElement rejectButton;

    ///backoffice/orders/scheduled>assignDriverButton
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement assignDriverButton;

    // merchant login > image
    @FindBy(xpath = "//div[@class='col-md-6 m-0 p-0 left-container']")
    public WebElement loginImage;

    // merchant login > merchant login yazısı
    @FindBy(xpath = "//h6[@class='mb-4']")
    public WebElement textMerchantLogin;

    // merchant login > meals center amblemi
    @FindBy(xpath = "//img[@class='img-60 rounded-circle']")
    public WebElement amblem;

    // merchant login > remember me kutucuğu
    @FindBy(xpath = "//div[@class='custom-checkbox ml-3']")
    public WebElement rememberMeKutucuk;

    // merchant login > App store download linki
    @FindBy(xpath = "(//div[@class='p-2'])[1]")
    public WebElement appStoreLink;

    // merchant login > Play store download linki
    @FindBy(xpath = "(//div[@class='p-2'])[1]")
    public WebElement playStoreLink;

    // merchant login > This field is required yazısı
    @FindBy(xpath = "(//div[@class='errorMessage'])[1]")
    public WebElement requiredText;

    // merchant login > Incorrect username or password yazısı
    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement incorrectText;


}
