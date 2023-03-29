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

    //adminUrl>backoffice>login>dashboardsummary
    @FindBy(xpath = "//div[@class='report-inner']")
    public List<WebElement> dashboardSummaryInfo;

    //adminUrl>backoffice>login>commissionsummary
    @FindBy(xpath = "//div [@id='boxes']")
    public List<WebElement> commissionSummary;
    //adminUrl>backoffice>login>ordersSummaryInfo
    @FindBy(xpath ="(//div[@class='dashboard-statistic position-relative mb-3'])[1]")
    public List<WebElement> ordersSummary;

    //adminUrl>backoffice>login>salesoverview
    @FindBy(xpath = "//div[@class='card mb-3']")
    public List<WebElement> salesOverview;

    //adminUrl>backoffice>login>merchant
    @FindBy(xpath = "(//a[@href='javascript:;'])[1]")
    public WebElement merchantLink;

    //adminUrl>backoffice>login>merchant>list
    @FindBy(xpath = "//a[@href='/backoffice/vendor/list']")
    public WebElement listLink;

    //adminUrl>backoffice>login>merchant>list>allmerchantText
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement allMerchantText;

    //adminUrl>backoffice>login>merchant>list>merchantInfo
    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public  List<WebElement> updatedMerchantInfo;

    //adminUrl>backoffice>login>merchant>list>editlink
    @FindBy(xpath = "(//i[@class=\"zmdi zmdi-border-color\"])[1]")
    public WebElement editLink;

    //adminUrl>backoffice>login>merchant>list>editlink>restaurantbox

    @FindBy(xpath = "//label[@for='AR_merchant_restaurant_name']")
    public WebElement restaurantnameBox;

    //adminUrl>backoffice>login>merchant>list>editlink>statusDdm

    @FindBy(xpath = "(//select[@class='form-control custom-select form-control-select'])[2]")
    public WebElement statusboxDdm;

    //adminUrl>backoffice>login>merchant>list>editlink>savebutton
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement merchantsaveBtn;

    //adminUrl>backoffice>login>merchant>list>editlink>savebutton>text
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public  WebElement updatedText;

    //adminUrl>backoffice>login>merchant>list>searchbox

    @FindBy(xpath ="//input[@type='search']")
    public WebElement searchBox;

    //adminUrl>backoffice>login>merchant>list>deletebutton

    @FindBy(xpath ="(//i[@class=\"zmdi zmdi-delete\"])[1]")
    public WebElement deleteButton;

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

    // admin login > orders > all order > siparişin yanındaki göz imgesi
    @FindBy(xpath = "(//i[@class='zmdi zmdi-eye'])[1]")
    public WebElement viewOrder;

    // admin login > orders > all order > siparişin yanındaki indirme imgesi
    @FindBy(xpath = "(//i[@class='zmdi zmdi-download'])[1]")
    public WebElement downloadOrder;

    // admin  login > orders > all order > siparişin yanındaki göz imgesi > summary başlığı
    @FindBy(xpath = "//h5[text()='Summary']")
    public WebElement summary;

    @FindBy(xpath = "//a[text()='Earnings']")
    public WebElement dasboardEarningsMenusu;
    @FindBy(xpath = "//a[text()='Merchant Earnings']")
    public WebElement dasboardMerchantEarningsMenusu;
    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement earningsMerchantSiralamaButonu;
    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement earningsBalanceSiralamaButonu;
    @FindBy(xpath = "(//div[@class='d-flex'])[32]")
    public WebElement earningsTotalBalanceBoxi;
    @FindBy(xpath = "//i[@class=\"zmdi zmdi-eye\"][1]")
    public WebElement merchantDetayBilgisiButonu;
    @FindBy(xpath = "//h6[text()='Merchant Info']")
    public WebElement merchantDetayBilgisiYazisi;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement merchantEarningsSearchbox;






//a[text()='Merchant Earnings']




}
