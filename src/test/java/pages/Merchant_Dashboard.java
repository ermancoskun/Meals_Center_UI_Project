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

    //backoffice/orders/scheduled>assignDriverButton
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement assignDriverButton;


    //merchant > Dasshboard / All Orders link
    @FindBy (xpath = "//li[@class='position-relative orders_history']")
    public WebElement allOrdersLink;

    //merchant > Dasshboard / orderHistory
    @FindBy (xpath = "//a[@class='navbar-brand']")
    public WebElement orderHistoryText;


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




    @FindBy(xpath="(//a[@id=\"dropdownMenuLink\"])[1]")
    public WebElement merchantname;


    @FindBy(xpath="(//a[@class=\"dropdown-item\"])[1]")
    public WebElement profil;

    @FindBy(xpath="//label[@for=\"AR_merchant_user_first_name\"]")
    public WebElement firstnamebox;

    @FindBy(xpath = "(//li[@class=\"active\"])[1]")
    public WebElement BasicDetailsbox;

    @FindBy(xpath ="//input[@id=\"AR_merchant_user_last_name\"]" )
    public WebElement Lastnamebox;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_contact_email\"]")
    public WebElement Emailbox;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_contact_number\"]")
    public WebElement Contactnumber;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_username\"]")
    public WebElement Username;

    @FindBy(xpath="//button[@style=\"padding: 0.375rem 0.75rem;\"]")
    public WebElement browseboxı;

    @FindBy(xpath="//img[@src=\"https://qa.mealscenter.com/backoffice/../upload/6/44f575b2-c0dd-11ed-ac97-2cea7f508bb0@thumbnail.jpg\"]")
    public WebElement browseboxpicture;

    @FindBy(xpath="//span[@class=\"label\"]")
    public WebElement AddFilesbuton;

    @FindBy(xpath="//span[@style=\"font-size: 1.5rem;\"]")
    public WebElement browseçıkış;

    @FindBy(xpath="//input[@type=\"submit\"]")
    public WebElement Savebox1;

    @FindBy(xpath="(//i[@class=\"zmdi zmdi-lock-outline\"])[1]")
    public WebElement ChangePasswordlinki;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_old_password\"]")
    public WebElement Oldpasswordbox;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_new_password\"]")
    public WebElement Newpasswordbox;

    @FindBy(xpath="//input[@id=\"AR_merchant_user_repeat_password\"]")
    public WebElement Confirmpasswordbox;

    @FindBy(xpath="//input[@class=\"btn btn-green btn-full mt-3 changepassButton\"]")
    public WebElement Savebox2;

    @FindBy(xpath="//div[@class=\"alert alert-success\"]")
    public WebElement Updateyazısı;

    @FindBy(xpath="//a[text()=\"Dashboard\"]")
    public WebElement Dashboardyazısı;

    @FindBy(xpath="//div[@class=\"rounded-status-report rounded r1\"]")
    public WebElement TotalOrders;

    @FindBy(xpath="//div[@class=\"rounded-status-report rounded r2\"]")
    public WebElement TotalCancel;

    @FindBy(xpath="//div[@class=\"rounded-status-report rounded r3\"]")
    public WebElement TotalRefund;

    @FindBy(xpath="//div[@class=\"rounded-status-report rounded r4\"]")
    public WebElement TotalSales;

    @FindBy(xpath="(//div[@style=\"padding: 10px;\"])[1]")
    public WebElement SalesThisWeek;

    @FindBy(xpath="(//div[@style=\"padding: 10px;\"])[2]")
    public WebElement EarningThisWeek;

    @FindBy(xpath="(//div[@style=\"padding: 10px;\"])[3]")
    public WebElement YourBalance;

    @FindBy(xpath="(//div[@class=\"card-body\"])[4]")
    public WebElement OrderReceived;

    @FindBy(xpath="(//div[@class=\"card-body\"])[5]")
    public WebElement TodayDelivered;

    @FindBy(xpath="(//div[@class=\"card-body\"])[6]")
    public WebElement TodaySales;

    @FindBy(xpath="(//div[@class=\"card-body\"])[7]")
    public WebElement TodayRefund;

    @FindBy(xpath="(//div[@class=\"card-body\"])[10]")
    public WebElement SalesOverview;

    @FindBy(xpath="(//div[@class=\"card-body\"])[12]")
    public WebElement OverviewOfReview;

    @FindBy(xpath="(//div[@class=\"card-body\"])[11]")
    public WebElement TopCustomers;

    @FindBy(xpath="(//div[@class=\"card-body\"])[8]")
    public WebElement LastOrders;

    @FindBy(xpath="(//div[@class=\"card-body\"])[9]")
    public WebElement PopularItems;


}
