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
    @FindBy(xpath = "//a[@href='/backoffice/vendor/edit/id/126']")
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

    @FindBy(xpath ="(//a[@class='btn btn-light datatables_delete tool_tips'])[1]")
    public WebElement deleteButton;







}
