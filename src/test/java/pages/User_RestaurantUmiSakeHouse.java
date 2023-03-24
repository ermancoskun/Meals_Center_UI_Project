package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class User_RestaurantUmiSakeHouse {

    public User_RestaurantUmiSakeHouse() {
        PageFactory.initElements(Driver.getDriver(),this);}

    // homepage > sign in butonu > user giris sayfasi
    // .user giris sayfasi username kutusu
    @FindBy(xpath = "//*[@id='username']")
    public WebElement accountUsername;

    // .user giris sayfasi password kutusu
    @FindBy(xpath = "//*[@id='password']")
    public WebElement accountPassword;

    // .user giris sayfasi signin butonu
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement accountLoginSigninButton;

    // .sag ustteki user isim yazisi
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

    // .siparislerin tarihleri
    @FindBy(xpath = "//p[@class='text-grey m-0']")
    public List<WebElement> ordersDate;
    // >>> bu locate in çiftleri tarihler



    //*******************/duygu/************/

    // mealscenter.com/umisakehouse >> Restauranttaki ilk urunun "Add to cart" butonu
    // (Login olduktan sonra)
    @FindBy(xpath = "(//a[@class='btn btn-grey quantity-add-cart'])[1]")
    public WebElement ilkUrunAddToCartButton;

    // mealscenter.com/umisakehouse >> Checkout Butonu (Sagda ortada)
    // (Login olduktan sonra)
    @FindBy(xpath = "//a[@href='/account/checkout']")
    public WebElement checkoutButton;

    // mealscenter.com/restaurants >> Cart yazısı Butonu (Sag ust kosedeki 'Cart' yazan buton)
    // (Login olduktan sonra)
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement cartButonu;

    // mealscenter.com/restaurants >> Sepet Resmi Butonu (Sag ust kosedeki sepet resmi olan buton)
    // (Login olduktan sonra)
    @FindBy(xpath = "//li[@class='d-inline mr-3 mr-lg-0']")
    public WebElement cartLogoButonu;

    //***************/duygu/****************/


}

