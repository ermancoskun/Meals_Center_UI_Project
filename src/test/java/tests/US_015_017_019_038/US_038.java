package tests.US_015_017_019_038;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.nio.file.Files;
import java.nio.file.Paths;
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
        List<WebElement> orderIdListesi = admin.orderIdList;
        ArrayList<Integer> orderIdListInt = new ArrayList<>();
        for (WebElement eachId : orderIdListesi
        ) {
            String idString = eachId.getText().replaceAll("\\D","");
            orderIdListInt.add(Integer.parseInt(idString));
        }
        extentTest.info("IDs have been added to a list for comparison");
        List<Integer> controlList = new ArrayList<>(orderIdListInt);
        Collections.sort(controlList);
        extentTest.info("IDs added to a list sorted in descending order");
        softAssert.assertTrue(controlList.equals(orderIdListInt),"Sorting is not done correctly");
        extentTest.info("IDs were matched with the sorted list after sorting");
        extentTest.pass("Verified that admin can sort orders by order id");

    }

    @Test
    public void adminOrdersTest05(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Test that the administrator can view and download an order as a document");
        ReusableMethods.adminLogin(ConfigReader.getProperty("betulAdminName"),(ConfigReader.getProperty("betulAdminPassword")));
        admin.ordersSection.click();
        extentTest.info("Clicked on the orders text in the panel");
        admin.allOrderSection.click();
        extentTest.info("Clicked on all orders");
        admin.viewOrder.click();
        extentTest.info("Clicked on the eye image");
        softAssert.assertTrue(admin.summary.isDisplayed(),"Order details could not be displayed");
        extentTest.info("Verified that order details can be viewed on the page that opens");
        Driver.getDriver().navigate().back();
        extentTest.info("Returned to previous page");
        admin.downloadOrder.click();
        String filePath = "C:\\Users\\fbalp\\Downloads\\document.pdf";
        softAssert.assertTrue(Files.exists(Paths.get(filePath)));
        extentTest.info("Verified that order details can be downloaded  as PDF");
        extentTest.pass("Verified that the administrator can view and download an order as a document");
    }

   /* @AfterMethod
    public void tearDown(){
        admin = new Admin_Dashboard();
        softAssert = new SoftAssert();
        softAssert.assertAll();
        Driver.closeDriver();
    }*/

}
