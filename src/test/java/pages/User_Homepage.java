package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class User_Homepage {

public User_Homepage(){

    PageFactory.initElements(Driver.getDriver(),this);
}
    // homepage sol ust mealscenter butonu
    @FindBy(xpath = "//div[@class='top-logo']")
    public WebElement mealscenterHpButton;

    // homepage header yazisi
    @FindBy (xpath = "//h2[@class='text-center mb-3']")
    public WebElement mealscenterHpHeaderScript;

    // homepage main banner
    @FindBy(xpath = "//div[@id='main-search-banner']")
    public WebElement mealscenterHpMainBanner;

    // homepage American butonu
    @FindBy (xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public WebElement mealscenterHpAmericanButton;

    // homepage more butonu
    @FindBy (xpath = "//a[@id='dropdownCuisine']")
    public WebElement mealscenterHpmoreButton;

    // homepage ust sol yon butonu
    @FindBy (xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[1]")
    public WebElement mealscenterHpUpperLeftNavigateButton;

    // homepage cookie kabul butonu
    @FindBy (xpath = "(//button[@ref_key='_ref'])[1]")
    public WebElement mealscenterHpCookieAcceptButton;

    // .homepage arama kutusu
    @FindBy(xpath = "//input[@class='form-control form-control-text']")
    public WebElement homePageSearchBox;

    // .home page sign in butonu
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement homePageSignInButton;


    //////////////////////////////////////////////////////////////////////

    // UserHomePage >> Enter delivery address
    // (Login olduktan sonra)
    @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
    public WebElement adresButonu;

    // UserHomePage >> Enter delivery address >> girilen adres 10001 >>
    // (Login olduktan sonra)
    @FindBy(xpath = "//h6[text()='10001']")
    public WebElement adres10001;

    // UserHomePage/restaurants >> Cuisines bolumundeki "Show more+" Butonu (Solda ortada)
    // (Login olduktan sonra)
    @FindBy(xpath = "//a[@aria-controls='collapseExample']")
    public  WebElement cuisinesShowMoreButton;

    // UserHomePage/restaurants >> Filter bolumunde
    // (!)filtreleme yaptıktan sonra cıkan(!) "Clear all" Butonu (Solda ustte)
    // (Login olduktan sonra)
    @FindBy(xpath = "(//a[@href='javascript:;'])[27]")
    public WebElement filterClearAllButton;

    // UserHomePage/restaurants >> Cuisines bolumundeki Japanese checkBox Butonu (Solda ortada)
    // (Login olduktan sonra)
    @FindBy(xpath = "(//div[@class='custom-control custom-checkbox'])[19]")
    public WebElement japaneseCheckBox;

    // UserHomePage/restaurants >> Ilk restaurantın ait olduğu cuisine bilgisi
    // (Login olduktan sonra)
    @FindBy(xpath = "(//span[@class='a-12 mr-1'])[1]")
    public WebElement ilkRestaurantCuisineBilgisi;

    // UserHomePage/restaurants >> Umi Sake House Restaurant
    // (Login olduktan sonra)
    @FindBy(xpath = "//h5[text()='Umi Sake House']")
    public WebElement umiSakeHouseRestaurantButton;


}
