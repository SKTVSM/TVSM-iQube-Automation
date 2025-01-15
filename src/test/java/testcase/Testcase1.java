package testcase;

import Pages.TestRideNewpage;
import Ulitlites.ReadXlData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.baseTest;

public class Testcase1 extends baseTest {

   @Test(dataProviderClass = ReadXlData.class,dataProvider = "sheetdata")

    public static void Logintest(String mobilenumber ,String OTP){

       /*


        WebElement loginbuttion = driver.findElement(By.xpath("//i[@title='login']"));
        loginbuttion.click();

        WebElement mobilenumbertext= driver.findElement(By.id("LoginMobileNumber"));
        mobilenumbertext.sendKeys(mobilenumber);

        WebElement loginviaOTP = driver.findElement(By.id("btnLogin"));
        loginviaOTP.click();


        */

    }
    /*
    @Test (priority = 1)
    /public testnewTR(){

        TestRideNewpage TR= new TestRideNewpage();

        TR.FullName("sachin.Kadlag");
        TR.MobileNumber("9175506455");
        TR.Email("9175506455@yopmail.com");
        TR.Pincode("411001");
        TR.Checkbox();
        TR.submit();


     */



    }


