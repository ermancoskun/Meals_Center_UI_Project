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


    // https://qa.mealscenter.com/ >> Adres girme butonu (Enter delivery address)
    // (Login olduktan sonra)
    @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
    public WebElement adresButton;

    // https://qa.mealscenter.com/ >> Adres girme butonu >> girilen adres 10001
    // (Login olduktan sonra)
    @FindBy(xpath = "//h6[text()='10001']")
    public WebElement adres10001;

    // https://qa.mealscenter.com/restaurants >> Cuisines bolumundeki "Show more+" Butonu (Solda ortada)
    // (Login olduktan sonra)
    @FindBy(xpath = "//a[@aria-controls='collapseExample']")
    public  WebElement cuisinesShowMoreButton;

    // https://qa.mealscenter.com/restaurants >> Filter bolumunde
    // (!)filtreleme yaptıktan sonra cıkan(!) "Clear all" Butonu (Solda ustte)
    // (Login olduktan sonra)
    @FindBy(xpath = "(//a[@href='javascript:;'])[27]")
    public WebElement filterClearAllButton;

    // https://qa.mealscenter.com/restaurants >> Cuisines bolumundeki Japanese checkBox Butonu (Solda ortada)
    // (Login olduktan sonra)
    @FindBy(xpath = "(//div[@class='custom-control custom-checkbox'])[19]")
    public WebElement japaneseCheckBox;

    // https://qa.mealscenter.com/restaurants >> Ilk restaurantın ait olduğu cuisine bilgisi
    // (Login olduktan sonra)
    @FindBy(xpath = "(//span[@class='a-12 mr-1'])[1]")
    public WebElement ilkRestaurantCuisineBilgisi;

    // https://qa.mealscenter.com/restaurants >> Umi Sake House Restaurant
    // (Login olduktan sonra)
    @FindBy(xpath = "//h5[text()='Umi Sake House']")
    public WebElement umiSakeHouseRestaurantButton;

    //userHp>contact/submit yaptıktıksonra cıkan yazı basarılı olan
    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement successfulMessageElementi;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta
    @FindBy(xpath = "(//i[@class='zmdi zmdi-more'])[2]")
    public WebElement ucNokta;

    // My orders sayfasında new ibareli siparişin sağındaki yatay üç nokta
    @FindBy(xpath = "(//i[@class='zmdi zmdi-more'])[7]")
    public WebElement ucNoktaNew;

    // My orders sayfasında siparişlerden complete olanın sağındaki yatay üç nokta
    @FindBy(xpath = "(//i[@class='zmdi zmdi-more'])[4]" )
    public WebElement ucNoktaCompleted;

    //  My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > write a review > add review butonu
    @FindBy(xpath = "(//button[@class='btn btn-black w-100'])[2]")
    public WebElement addReviewButton;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > view
    @FindBy(xpath = "(//i[@class='zmdi zmdi-eye mr-2'])[2]")
    public WebElement viewSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > view > order detay paneli
    @FindBy(xpath = "//div[@class='order-details-panel section-cart open']")
    public WebElement orderDetail;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm view > order detay paneli > çarpı
    @FindBy(xpath = "//i[@class='zmdi zmdi-close']")
    public WebElement closePanel;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > buy again
    @FindBy(xpath = "(//i[@class='zmdi zmdi-repeat mr-2'])[2]")
    public WebElement buyAgainSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > buy again > go to checkout
    @FindBy(xpath = "//div[text()='Go to checkout']")
    public WebElement goToCheckout;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > track
    @FindBy(xpath = "(//i[@class='zmdi zmdi-car mr-2'])[2]")
    public WebElement trackSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > track > sipariş serüveni kartı
    @FindBy(xpath = "//ul[@id='progressbar']")
    public WebElement orderTrack;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > download
    @FindBy(xpath = "(//i[@class='zmdi zmdi-collection-pdf mr-2'])[2]")
    public WebElement downloadSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > cancel order
    @FindBy(xpath = "(//i[@class='zmdi zmdi-close mr-2'])[7]") //3 nokta new'in indexi ile aynı
    public WebElement cancelSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > cancel order > cancel order butonu
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement cancelOrderButton;

    //  // My orders sayfasında sipariş numarasının yanındaki ibare
    @FindBy(xpath = "(//span[text()='cancelled'])[7]")
    public WebElement cancelled;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > write a review
    @FindBy(xpath = "(//i[@class='zmdi zmdi-star-outline mr-2'])[4]")
    public WebElement writeReviewSection;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > write a review > yorum yazılan alan
    @FindBy(xpath = "//*[@id='review_content']")
    public WebElement reviewArea;

    // My orders sayfasında siparişlerin sağındaki yatay üç nokta > ddm > write a review > çarpı
    @FindBy(xpath = "//i[@class='zmdi zmdi-close font20']")
    public WebElement reviewClose;

    // user login > Sağ üstteki kullanıcı adı > Payments option
    @FindBy(xpath = " //a[text()=' Payments Options ']")
    public WebElement paymentSection;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button
    @FindBy(xpath = "//a[text()='Add new payment']")
    public WebElement addPaymentButton;

    // user login > Sağ üstteki kullanıcı adı > Payments option > sayfadaki text ve image
    @FindBy(xpath = "//div[@class='rounded p-3 grey-bg']")
    public WebElement cardAndText;

    // user login > Sağ üstteki kullanıcı adı > Payments option > kayıtlı ödeme yöntemleri
    @FindBy(xpath = "//div[@class='card p-3 fixed-height card-listing']")
    public List<WebElement> paymentMethods;

    // user login > Sağ üstteki kullanıcı adı > Payments option > delete butonu
    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement deletePaymentButton;

    // user login > Sağ üstteki kullanıcı adı > Payments option > edit butonu
    @FindBy(xpath = "//i[@class=\"zmdi zmdi-edit\"]")
    public WebElement editPaymentButton;

    //  user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > cash on delivery
    @FindBy(xpath = "//i[@class='zmdi zmdi-money-box']")
    public WebElement cash;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > cash on delivery > add cash
    @FindBy(xpath = "//span[text()='Add Cash']")
    public WebElement addCashButton;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > cash on delivery > çarpı
    @FindBy(xpath = "(//i[@class='zmdi zmdi-close font20'])[1]")
    public WebElement closeAddCash;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı
    @FindBy(xpath = "(//span[@class='mr-1'])[2]")
    public WebElement stripe;

    //user login > Sağ üstteki kullanıcı adı > Payments option > nakit ödeme yöntemi
    @FindBy(xpath = "(//h5[@class='ml-2'])[2]")
    public WebElement cashAdded;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > add stripe
    @FindBy(xpath = "//span[text()='Add Stripe']")
    public WebElement addStripeButton;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > iframe
    @FindBy(xpath = "//iframe[@frameborder='0']")
    public WebElement iframe;
    //iframe[@frameborder='0']
    //div[@id='root']
    //iframe[@name='__privateStripeFrame89128']

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > add stripe > kart no giriş box
    @FindBy(xpath = "(//span[@class='InputContainer'])[1]")
    public WebElement cardNoBox;
    // (//span[@class='CardField-number CardField-child'])[1]
    // //span[@class='CardField-restWrapper']
    //input[@name='cardnumber']
    // (//span[@class='InputContainer'])[1]

    // kart kullanıcısı adı
    @FindBy(xpath = "//label[text()='Cardholder name']")
    public WebElement cardHolder;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > add stripe > kart SKT giriş box
    @FindBy(xpath = "(//span[@class='InputContainer'])[2]")
    public WebElement dateBox;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > add stripe > kart CVC giriş box
    @FindBy(xpath = "(//span[@class='InputContainer'])[3]")
    public WebElement cvcBox;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > add stripe > zip kodu giriş box
    @FindBy(xpath = "(//span[@class='InputContainer'])[4]")
    public WebElement zipCodeBox;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment button > stripe yazısı > çarpı
    @FindBy(xpath = "(//i[@class='zmdi zmdi-close font20'])[2]")
    public WebElement closeAddStripe;

    // user login > Sağ üstteki kullanıcı adı > Payments option > Stripe ödeme yöntemi
    @FindBy(xpath = "(//h5[@class='ml-2'])[1]")
    public WebElement addedStripe;

    // user login > Sağ üstteki kullanıcı adı > Payments option > add new payment > close payment
    @FindBy(xpath = "//a[text()='Close Payment']")
    public WebElement closePaymentButton;



    //account/login user
    // girişi başarısız olduğunda çıkan uyarı yazısı:
    //"Unable to login. Check your login information and try again."
    @FindBy (xpath = "//div[@class='alert alert-warning']")
    public WebElement loginOlunamadiUyarisi;


    //login sonrasi homepage sol üstteki simge
    @FindBy (xpath = "//img[@class='img-30 rounded-pill lozad loaded']")
    public WebElement loginOlunduSimgesi;

    // homepage > cart linkini tiklayinca cikan "cart" yazisi
    @FindBy (xpath = "//*[@class='mt-3 mb-0']")
    public WebElement cartScript;

    // homepage > cart linki
    @FindBy (xpath = "(//li[@class='d-none d-lg-inline'])[2]")
    public WebElement cartLinki;

    // homepage > cart resmi
    @FindBy (xpath = "//span[@class='badge small badge-dark rounded-pill']")
    public WebElement cartImage;

    // homepage > sol alt mealscenter butonu
    @FindBy (xpath = "(//img[@class='img-200'])[2]")
    public WebElement solAltMealscenterButonu;

    // homepage > facebook butonu
    @FindBy (xpath = "/html/body/div[5]/div/div[1]/div[2]/div/div[1]")
    public WebElement facebookButton;

    // homepage > aramakutusu > sendkeys yapinca cikan ilk javascript elementi
    @FindBy (xpath = "//*[@id=\"vue-home-search\"]/div[3]/ul/li[1]")
    public WebElement searchBoxIlkElement;

    // homepage > restaurants > safya alt adres satiri
    @FindBy (xpath = "(//h1[@class='mb-4'])[1]")
    public WebElement restaurantsAdresSatiri;

    // homepage > instagram button
    @FindBy (xpath = "//a[@class='instagram']")
    public WebElement instagramButton;
}
