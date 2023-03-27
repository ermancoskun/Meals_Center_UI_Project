package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    // admin login > orders
    @FindBy(xpath = "//li[@class='admin_orders']")
    public WebElement ordersSection;

    // admin login > orders > all order
    @FindBy(xpath = "(//ul[@class='sidebar-nav-sub-menu'])[2]")
    public WebElement allOrderSection;

    // admin login > orders > all order > orders
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement orders;

    // admin login > orders > all order > (total) cancel
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement totalCancels;

    // admin login > orders > all order > total refund
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement totalRefund;

    // admin login > orders > all order > total orders
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement totalOrders;

    // admin login > orders > all order > order list
    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement orderList;

    // admin login > orders > all order > order ID yazısı
    @FindBy(xpath = "//th[text()='Order ID']")
    public WebElement orderIdText;

    // admin login > orders > all order > order ID listesi
    @FindBy(xpath = "//td[@class='sorting_1']")
    public List<WebElement> orderIdList;

    // admin login > orders > all order > tarih filtreleme kutusu
    @FindBy(xpath = "//input[@type='search']")
    public WebElement dateSearchBox;

    // admin login > orders > all order > tarih filtreleme kutusu > yesterday
    @FindBy(xpath = "//li[@data-range-key='Yesterday']")
    public WebElement yesterday;

    // admin login > orders > all order > tarih filtreleme kutusu > today
    @FindBy(xpath = "//li[@data-range-key='Today']")
    public WebElement today;

    // admin login > orders > all order > tarih filtreleme kutusu > Last 7 days
    @FindBy(xpath = "//li[@data-range-key='Last 7 days']")
    public WebElement last7days;

    // admin login > orders > all order > tarih filtreleme kutusu > Last 30 days
    @FindBy(xpath = "//li[@data-range-key='Last 30 Days']")
    public WebElement last30days;







}
