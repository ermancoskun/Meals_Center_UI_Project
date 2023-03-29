package tests.US_022_023_024;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.assertTrue;

public class US_023 extends TestBaseRapor {

    Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();




    SoftAssert softAssert=new SoftAssert();



    @Test
    public void test01(){
        merchant_dashboard=new Merchant_Dashboard();

        softAssert=new SoftAssert();

        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //- Soldaki panelde Dashboard yazısının seçili olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        extentTest=extentReports.createTest("profilegitme","profilegitme2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

        softAssert.assertTrue(merchant_dashboard.Dashboardyazısı.isDisplayed());

        extentTest.pass("Dashboard panelinde olduğum doğrulandı.");

        softAssert.assertAll();





    }

    @Test (groups = "smoke")
    public void test02(){

        merchant_dashboard=new Merchant_Dashboard();

        softAssert=new SoftAssert();

        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //- Soldaki panelde Dashboard yazısının seçili olduğu doğrulanır.
        //- Total orders yazısının ve değerinin görünür olduğu doğrulanır.
        //- Total Cancel yazısının ve değerinin görünür olduğu doğrulanır.
        //- Total refund yazısının ve değerinin görünür olduğu doğrulanır.
        //- Total Sales yazısının ve değerinin görünür olduğu doğrulanır.
        //-Sales this week yazısının ve değerinin görünür olduğu doğrulanır.
        //- Earning this week yazısının ve değerinin görünür olduğu doğrulanır.
        //- Your balance yazısının ve değerinin görünür olduğu doğrulanır.
        //- Order received yazısının ve değerinin görünür olduğu doğrulanır.
        //- Today delivered yazısının ve değerinin görünür olduğu doğrulanır.
        //- Today sales yazısının ve değerinin görünür olduğu doğrulanır.
        //- Today refund yazısının ve değerinin görünür olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        extentTest=extentReports.createTest("bilgilerimingözükmesi","bilgilerimingözükmesi2");

        ReusableMethods.merchantLogin();

        extentTest.info("kullanıcı adı ve şifre ile giriş yapıldı.");

        softAssert.assertTrue(merchant_dashboard.TotalOrders.isDisplayed());

        extentTest.pass("Total Orders bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TotalCancel.isDisplayed());

        extentTest.pass("Total Cancel bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TotalRefund.isDisplayed());

        extentTest.pass("Total Refund bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TotalSales.isDisplayed());

        extentTest.pass("Total Sales bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.SalesThisWeek.isDisplayed());

        extentTest.pass("SalesThisWeek bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.EarningThisWeek.isDisplayed());

        extentTest.pass("EarningThisWeek bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.YourBalance.isDisplayed());

        extentTest.pass("YourBalance bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.OrderReceived.isDisplayed());

        extentTest.pass("OrderReceived bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TodayDelivered.isDisplayed());

        extentTest.pass("TodayDelivered bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TodaySales.isDisplayed());

        extentTest.pass("TodaySales bilgisinin görünür olduğu test edildi.");

        softAssert.assertTrue(merchant_dashboard.TotalRefund.isDisplayed());

        extentTest.pass("TodayRefund bilgisinin görünür olduğu test edildi.");

    softAssert.assertAll();
    }


    @Test
    public void test03(){

        merchant_dashboard=new Merchant_Dashboard();

        softAssert=new SoftAssert();
        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //- Soldaki panelde Dashboard yazısının seçili olduğu doğrulanır.
        //- Sales Overview grafiğinin görünür olduğu doğrulanır.
        //- Overview of Review
        // grafiğinin görünür olduğu doğrulanır.
        //-Top Customers grafiğinin görünür olduğu doğrulanır.
        //-Last Orders grafiğinin görünür olduğu doğrulanır.
        //-Popular items grafiğinin görünür olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        extentTest=extentReports.createTest("graphics show up","graphics show up2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");

        softAssert.assertTrue(merchant_dashboard.SalesOverview.isDisplayed());

        extentTest.pass("Tested that the SalesOverview chart is visible.");

        softAssert.assertTrue(merchant_dashboard.OverviewOfReview.isDisplayed());

        extentTest.pass("Tested that the OverviewOfReview graphic is visible.");

        softAssert.assertTrue(merchant_dashboard.TopCustomers.isDisplayed());

        extentTest.pass("Tested that the TopCustomers graph is visible.");

        softAssert.assertTrue(merchant_dashboard.LastOrders.isDisplayed());

        extentTest.pass("Tested that the LastOrders graph is visible.");

        softAssert.assertTrue(merchant_dashboard.PopularItems.isDisplayed());

        extentTest.pass("Tested that the LastOrders graph is visible.");

        softAssert.assertAll();









    }
}
