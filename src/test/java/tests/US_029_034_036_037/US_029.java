package tests.US_029_034_036_037;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_029 {

    Merchant_Dashboard  merchant_dashboard=new Merchant_Dashboard();

    @Test
    public void TC_01(){

        //merchantStart
        ReusableMethods.merchantLogin();

        //Click the Orders link  in the Dashboard menu
        merchant_dashboard.ordersLink.click();

        //Click the Completed link
        merchant_dashboard.completedLink.click();

        //Verify that "Completed Today" text is visible on the page.
        Assert.assertTrue(merchant_dashboard.completedText.isDisplayed());

        //Verify that the number of orders completed today and the number of actual orders completed today match.

        int  expectedCount=0;
        int  actualCount= Integer.parseInt(merchant_dashboard.completedtodayCount.getText());

        System.out.println(actualCount);

        Assert.assertEquals(expectedCount,actualCount);

        //Close the browser
        Driver.closeDriver();
    }

     @Test
     public void TC_02(){

         Merchant_Dashboard  merchant_dashboard=new Merchant_Dashboard();

         //merchantStart
         ReusableMethods.merchantLogin();

         //Click the Orders link  in the Dashboard menu.
         merchant_dashboard.ordersLink.click();

         //Click the Completed link
         merchant_dashboard.completedLink.click();

         //Choose dinein option in order type menu

         Select select=new Select(merchant_dashboard.orderTypeDdm);
         select.selectByVisibleText("Dinein");

         //Choose paid option in payment status menu

         Select select2=new Select(merchant_dashboard.paymentStatusDdm);
         select2.selectByVisibleText("Paid");

         //Choose order id-descending option in sort menu

         Select select3=new Select(merchant_dashboard.sortDdm);
         select3.selectByValue("order_id_desc");

         //Close the browser
         Driver.closeDriver();
     }
    @Test
    public void TC_03(){

        Merchant_Dashboard  merchant_dashboard=new Merchant_Dashboard();

        //merchantStart
        ReusableMethods.merchantLogin();

        //Click the Orders link  in the Dasboard menu.
        merchant_dashboard.ordersLink.click();

        //Click the Completed link
        merchant_dashboard.completedLink.click();

        //Verify that Accepting Orders button is enabled
        merchant_dashboard.acceptingOrdersButton.click();

        //Click the cancel button
        merchant_dashboard.cancelButton.click();

        //Close the browser
        Driver.closeDriver();



    }
    }
