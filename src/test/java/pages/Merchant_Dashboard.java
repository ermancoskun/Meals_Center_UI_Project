package pages;

import org.openqa.selenium.By;
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

    //Merchant>backoffice>orders>completed
    @FindBy(xpath = "//li[@class='position-relative orders_completed']")
    public WebElement completedLink;

    @FindBy(xpath = "//h5[@class='head m-0']")
    public WebElement completedText;

    //merchant>backoffice/orders>completed/completedtodayCount
    @FindBy(xpath = "(//div[text()='0'])[5]")
    public WebElement completedtodayCount;

    //merchant>backoffice/orders>completed/ordertypeddm
    @FindBy(xpath = "(//select[@class='selectpicker'])[1]")
    public WebElement orderTypeDdm;

    //merchant>backoffice/orders>completed/paymentstatusddm
    @FindBy(xpath = "//select[@title='Payment status']")
    public WebElement paymentStatusDdm;

    //merchant>backoffice/orders>completed/sortddm
    @FindBy(xpath = "//select[@title='Sort']")
    public WebElement sortDdm;
    //merchant>backoffice/orders>completed/acceptingOrdersButton
    @FindBy(xpath = "//button[@class='btn btn-green']")
    public WebElement acceptingOrdersButton;

    //merchant>backoffice/orders>completed/cancelButton
    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    public WebElement  cancelButton;

    //merchant>dashboard>ordertype
    @FindBy(xpath ="//li[@class='services_settings']")
    public WebElement orderTypeLink;

    //merchant>dashboard>ordertype>delivery
    @FindBy(xpath ="//a[@href='/backoffice/services/delivery_settings']")
    public WebElement deliveryLink;

    //merchant>dashboard>ordertype>delivery>settingtext
    @FindBy(xpath ="(//li[@class='active'])[1]")
    public WebElement settingText;

    //merchant>dashboard>ordertype>delivery>checkbox1
    @FindBy(xpath = "//label[@for='merchant_opt_contact_delivery']")
    public WebElement checkbox1;
    //merchant>dashboard>ordertype>delivery>checkbox2

    @FindBy(xpath = "//label[@for='free_delivery_on_first_order']")
    public WebElement checkbox2;

    //merchant>dashboard>ordertype>delivery>fixedchargeddm
    @FindBy(xpath = "//select[@id='AR_option_merchant_delivery_charges_type']")
    public WebElement fixedchargeDdm;

    //merchant>dashboard>ordertype>delivery>servicefeebox
    @FindBy(xpath ="//input[@type='text']")
    public WebElement serviceFeeBox;

    //merchant>dashboard>ordertype>delivery
    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement errorMessage;

    //merchant>dashboard>ordertype>delivery>savebutton
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement saveButon;

    //merchant>dashboard>ordertype>delivery>settingsSavedText
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement settingsSavedText;

    //merchant>dashboard>ordertype>delivery>fixedchargetext
    @FindBy(xpath ="//a[@href='/backoffice/services/fixed_charge'][1]")
    public WebElement fixedChargeText;

    //merchant>dashboard>ordertype>delivery>pricebox
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement priceBox;

    //merchant>dashboard>ordertype>delivery>fixedchargesavebutton
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement fixedChargeSaveButon;

    //merchant>dashboard>ordertype>delivery>alert
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement succesfullyupdatedalert;




}
