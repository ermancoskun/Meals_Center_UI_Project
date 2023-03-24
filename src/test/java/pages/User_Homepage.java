package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class User_Homepage {

public User_Homepage(){

    PageFactory.initElements(Driver.getDriver(),this);
}
    // homepage sol ust mealscenter butonu
    @FindBy(xpath = "//div[@class='top-logo']")
    public WebElement mealscenterButton;

    // homepage header yazisi
    @FindBy (xpath = "//h2[@class='text-center mb-3']")
    public WebElement headerScript;

    // homepage main banner
    @FindBy(xpath = "//div[@id='main-search-banner']")
    public WebElement mainBanner;

    // homepage American butonu
    @FindBy (xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public WebElement americanButton;

    // homepage more butonu
    @FindBy (xpath = "//a[@id='dropdownCuisine']")
    public WebElement moreButton;

    // homepage ust sol yon butonu
    @FindBy (xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[1]")
    public WebElement upperLeftNavigateButton;

    // homepage cookie kabul butonu
    @FindBy (xpath = "(//button[@ref_key='_ref'])[1]")
    public WebElement cookieAcceptButton;

    // .homepage > arama kutusu
    @FindBy(xpath = "//input[@class='form-control form-control-text']")
    public WebElement searchBox;

    // .home page > sign in butonu
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;

    // homepage > sign in butonu > user giris sayfasi >> username kutusu
    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;

    // .user giris sayfasi > password kutusu
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    // .user giris sayfasi > signin butonu
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement loginSigninButton;

    // user sayfasi > sag ustteki user ismi yazisi
    @FindBy(xpath = "//a[@id='dropdownMenuLink']")
    public WebElement nameButton;

    // .isme tiklayinca acilan dropdown menu > My orders seçenegi
    @FindBy(xpath = "//a[text()=' My orders ']")
    public WebElement myOrdersSection;

    // .My orders sayfasi > sipariş miktari yazisi
    @FindBy(xpath = "//div[@class='col-lg-3 d-none d-lg-block']")
    public WebElement orderQuantity;

    // .My orders sayfasi > total amount yazisi
    @FindBy(xpath = "(//div[@class='col-lg-2 d-none d-lg-block'])[2]")
    public WebElement totalAmount;

    // .My orders sayfasi > sepet resmi
    @FindBy(xpath = "(//div[@class='col-lg-2 d-none d-lg-block'])[1]")
    public WebElement bagImage;

    // .My orders sayfasi > sipariş arama kutusu
    @FindBy(xpath = "//input[@placeholder='Search order']")
    public WebElement searchOrderBox;

    // .My orders sayfasi > siparis listesi
    @FindBy(xpath = "//div[@class='kmrs-row row m-0 rounded p-2 mb-2']")
    public List<WebElement> orderList;

    // .My orders sayfasi > end of result yazisi
    @FindBy(xpath = "//p[text()='end of results']")
    public WebElement endOfResult;

    // .goruntulenen siparisin numarası
    @FindBy(xpath = "//h6[text()='Order #10253 ']")
    public WebElement visibleOrderNo;

    //anasayfa en ustundeki logo elementi login olmadan
    @FindBy(xpath = "(//img[@class='img-200'])[1]")
    public WebElement ilkLogoElementi;

    // login olmadan anasayfa en alttaki contact us linki
    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactusLinkElementi;

    //userHp>contact/phoneNumber
    @FindBy(xpath = "(//p//font/b)[1]")
    public WebElement contactPhoneNumberElementi;

    //userHp>contact/gmail
    @FindBy(xpath = "(//p//font/b)[2]")
    public WebElement contactGmailElementi;

    //userHp>contact/fullname isim kutusu
    @FindBy(id = "AR_contact_fullname")
    public WebElement contactPageFulnameBox;

    //userHp>contact/mail kutusu
    @FindBy(xpath = "//label[@for='AR_contact_email_address']")
    public WebElement contactPageEmailBox;

    //userHp>contact/mesaj yazılan yer
    @FindBy(id="AR_contact_message")
    public WebElement userMessageBox;

    //userHp>contact/submit butonu
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement contactPageSubmitButton;

    //userHp>contact/submit yaptıktıksonra cıkan yazı basarılı olan
    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement successfulMessageElementi;

}
