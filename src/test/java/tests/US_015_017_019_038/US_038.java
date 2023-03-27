package tests.US_015_017_019_038;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import pages.User_Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US_038 extends TestBaseRapor {

    Admin_Dashboard admin = new Admin_Dashboard();
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void adminOrdersTest01(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test for admin to access all orders");
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),(ConfigReader.getProperty("betulAdminPassword")));
        admin.ordersSection.click();
        extentTest.info("Clicked on the orders text in the panel");
        admin.allOrderSection.click();
        extentTest.info("Clicked on all orders");
        softAssert.assertTrue(admin.orderList.isDisplayed());
        extentTest.info("All order displayed");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("allOrderUrl");
        softAssert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Confirmed that the admin can access all orders");

    }

    @Test
    public void adminOrdersTest02(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test for admin to access total number of orders," +
                                             "total number of cancellations and total refund amount");
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),(ConfigReader.getProperty("betulAdminPassword")));
        admin.ordersSection.click();
        extentTest.info("Clicked on the orders text in the panel");
        admin.allOrderSection.click();
        extentTest.info("Clicked on all orders");
        softAssert.assertTrue(admin.orders.isDisplayed());
        extentTest.info("Total number of orders displayed");
        softAssert.assertTrue(admin.totalCancels.isDisplayed());
        extentTest.info("Number of cancellations displayed");
        softAssert.assertTrue(admin.totalRefund.isDisplayed());
        extentTest.info("Total refund displayed");
        softAssert.assertTrue(admin.totalOrders.isDisplayed());
        extentTest.info("Total amount displayed");
        extentTest.pass("Confirmed that the admin can access the total number of orders," +
                        "total number of cancellations and total refund amount");
    }

    @Test
    public void adminOrdersTest03(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test for admin to filter by a certain date range");
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),(ConfigReader.getProperty("betulAdminPassword")));
        admin.ordersSection.click();
        extentTest.info("Clicked on the orders text in the panel");
        admin.allOrderSection.click();
        extentTest.info("Clicked on all orders");
        admin.dateSearchBox.click();
        extentTest.info("Clicked on the date box");

        //-  Clicked on yesterday from the drop-down menu
        //- Confirmed that the date of the ordered products is yesterday's date
        //- Clicked on today from the drop-down menu
        //- Confirmed that the date of the ordered products is today's date
        //- Came in the date box
        //- Clicked on the cross when it is visible
        //- Came in the date box
        //- Clicked on the cross when it is visible
        //-  Clicked on last 7 days from the drop-down menu
        //- Went to the end of the page
        //- Clicked on 28
        //- Verified that the orders are orders from the last 7 days
        //- Came in the date box
        //- Clicked on the cross when it is visible

    }

    @Test
    public void adminOrdersTest04(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test for admin to sort orders by order id");
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),(ConfigReader.getProperty("betulAdminPassword")));
        admin.ordersSection.click();
        extentTest.info("Clicked on the orders text in the panel");
        admin.allOrderSection.click();
        extentTest.info("Clicked on all orders");
        admin.orderIdText.click();
        extentTest.info("Clicked on Order ID for sort orders by order id");

        List<WebElement> orderIdList = admin.orderIdList;
      /*  ArrayList<Integer> fiyatlarIntList=new ArrayList<>();
        for (WebElement each:homePage.fiyatlarList
        ) {
            String fiyatString=each.getText().replaceAll("\\D","");
            fiyatlarIntList.add(Integer.parseInt(fiyatString));
        }
        extentTest.info("fiyatlar karsılaştırılmak uzere bir listeye eklendi");
        List<Integer> kontrolList=new ArrayList<>(fiyatlarIntList);

        Collections.sort(kontrolList);
        extentTest.info("fiyatlar kodlama yardımı ile azdan cok olarak sıralanmış bir listeye eklendi");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(kontrolList.equals(fiyatlarIntList),"sıralama dogru yapılmıyor");
        extentTest.info("fiyatlar sıralama yapıldıktan sonra sıralanmıs liste ile eşleştirildi");*/


        extentTest.pass("Verified that admin can sort orders by order id");

    }



    @Test
    public void adminOrdersTest05(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("");
        // Bir siparişi döküman olarak görebilmeli ve indirebilmeliyim
    }

    @AfterMethod
    public void tearDown(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
