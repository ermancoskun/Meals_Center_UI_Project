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



    //merchant/backoffice/food/category_create>merchantname
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

    @FindBy(xpath="//a[text()=\"Food\"]")
    public WebElement FoodButonu;

    @FindBy(xpath="//a[text()=\"Category\"]")
    public WebElement CategoryButonu;

    @FindBy(xpath="//a[@class=\"navbar-brand\"]")
    public WebElement CategoryListYazısı;

    @FindBy(xpath="(//tr[@class=\"even\"])[1]")
    public WebElement SignatureRoll;

    @FindBy(xpath="(//tr[@class=\"even\"])[2]")
    public WebElement MakiandclassicRoll;

    @FindBy(xpath="(//tr[@class=\"odd\"])[2]")
    public WebElement Sushibox;

    @FindBy(xpath="(//tr[@class=\"odd\"])[1]")
    public WebElement PickedForYou;

    @FindBy(xpath = "(//div[@class=\"p-2\"])[1]")
    public WebElement AddNewButonu;

    @FindBy(xpath="//input[@id=\"AR_category_category_name\"]")
    public WebElement NameBox;

    @FindBy(xpath="//textarea[@id=\"AR_category_category_description\"]")
    public WebElement Descriptionbox;

    @FindBy(xpath="//button[@style=\"padding: 0.375rem 0.75rem;\"]")
    public WebElement Browsebox1;

    @FindBy(xpath="(//img[@src=\"https://qa.mealscenter.com/backoffice/../upload/6/11eabb1f-c0e0-11ed-ac97-2cea7f508bb0@thumbnail.jpg\"])[1]")
    public WebElement FeaturedImage;

    @FindBy(xpath="(//span[text()=\"Add Files\"])[1]")
    public WebElement AddFilesButonu;

    @FindBy(xpath="(//button[text()=\"Browse\"])[2]")
    public WebElement Browsebox2;

    @FindBy(xpath ="//img[@src=\"https://qa.mealscenter.com/backoffice/../upload/6/e3ee0883-c0df-11ed-ac97-2cea7f508bb0@thumbnail.jpg\"]")
    public WebElement IconImage;

    @FindBy(xpath="(//span[text()=\"Add Files\"])[2]")
    public WebElement AddFiles2;

    @FindBy(xpath ="//span[@class=\"select2-selection select2-selection--multiple\"]")
    public WebElement DishBox;

    @FindBy(xpath="//li[@id=\"select2-AR_category_dish_selected-result-6i3u-1\"]")
    public WebElement MealBox;

    @FindBy(xpath="//select[@id=\"AR_category_status\"]")
    public WebElement StatusBox;

    @FindBy(xpath="//input[@type=\"submit\"]")
    public WebElement Savebox;

    @FindBy(xpath = "//div[@class=\"alert alert-success\"]")
     public WebElement SuccesfulyUpdatedYazısı;

    @FindBy(xpath="//i[@class=\"zmdi zmdi-plus\"]")
    public WebElement ItemTranslationsButton;

    @FindBy(xpath="//input[@id=\"AR_category_category_translation_ja\"]")
    public WebElement JapaneseTranslationBox;

    @FindBy(xpath="//textarea[@id=\"AR_category_category_description_translation_ja\"]")
    public WebElement JapaneseDescriptionBox;

    @FindBy(xpath ="//input[@id=\"AR_category_category_translation_ar\"]")
    public WebElement ArabicTranslationBox;

    @FindBy(xpath="//textarea[@id=\"AR_category_category_description_translation_ar\"]")
    public WebElement ArabicDescriptionBox;

    @FindBy(xpath = "(//i[@class=\"zmdi zmdi-border-color\"])[1]")
    public WebElement UpdateButonu;

    @FindBy(xpath="//a[@data-id=\"182\"]")
    public WebElement DeleteButonu;

    @FindBy(xpath="//a[@class=\"btn btn-green item_delete\"]")
    public WebElement DeleteConfirmation;

    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-circle\"]")
    public WebElement SortButton;

    @FindBy(xpath="//div[@class=\"breadcrumbs\"]")
    public WebElement CategorySortPage;





}
