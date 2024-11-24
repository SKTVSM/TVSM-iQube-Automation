package testcase;

import Ulitlites.ReadXlData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.baseTest;

public class Testcase1 extends baseTest {

   @Test(dataProviderClass = ReadXlData.class,dataProvider = "sheetdata")

    public static void Logintest(String mobilenumber ,String OTP){


        WebElement loginbuttion = driver.findElement(By.xpath("//i[@title='login']"));
        loginbuttion.click();

        WebElement mobilenumbertext= driver.findElement(By.id("LoginMobileNumber"));
        mobilenumbertext.sendKeys(mobilenumber);

        WebElement loginviaOTP = driver.findElement(By.id("btnLogin"));
        loginviaOTP.click();

    }

}
