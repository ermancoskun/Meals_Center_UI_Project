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

    // /backoffice/merchant/dashboard >> Dasboard menusunun tamami
    @FindBy(xpath = "//div[@id='vue-siderbar-menu']")
    public WebElement dasboardMenusununTamami;

    // /backoffice/merchant/dashboard >> Dasboard menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[1]")
    public WebElement dashboardMenuButonu;

    // /backoffice/merchant/dashboard >> Merchant menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[2]")
    public WebElement merchantMenuButonu;

    // /backoffice/merchant/dashboard >> Orders menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[3]")
    public WebElement ordersMenuButonu;

    // /backoffice/merchant/dashboard >> Attributes menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[6]")
    public WebElement attributesMenuButonu;

    // /backoffice/merchant/dashboard >> Food menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[7]")
    public WebElement foodMenuButonu;

    // /backoffice/merchant/dashboard >> Order menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[8]")
    public WebElement orderTypeMenuButonu;

    // /backoffice/merchant/dashboard >> Payment Gateway menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[9]")
    public WebElement paymentGatewayMenuButonu;

    // /backoffice/merchant/dashboard >> Promo menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[10]")
    public WebElement promoMenuButonu;

    // /backoffice/merchant/dashboard >> Images menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[11]")
    public WebElement imagesMenuButonu;

    // /backoffice/merchant/dashboard >> Account menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[12]")
    public WebElement accountMenuButonu;

    // /backoffice/merchant/dashboard >> Buyers menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[14]")
    public WebElement buyersMenuButonu;

    // /backoffice/merchant/dashboard >> Users menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[15]")
    public WebElement usersMenuButonu;

    // /backoffice/merchant/dashboard >> Reports menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[16]")
    public WebElement reportsMenuButonu;

    // /backoffice/merchant/dashboard >> Inventory Management menusu butonu
    @FindBy(xpath = "(//ul[@class='sidebar-nav']/li)[18]")
    public WebElement inventoryManagementMenuButonu;



}
