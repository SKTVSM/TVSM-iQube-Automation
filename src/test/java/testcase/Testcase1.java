package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.baseTest;

import java.sql.Time;

public class Testcase1 extends baseTest {

   @Test(dataProvider ="mobilenumber")
    public static void Logintest(String Mobilenumber ,String OTP){

        WebElement loginbuttion = driver.findElement(By.xpath(Loc.getProperty("loginbuttion")));
        loginbuttion.click();

        WebElement mobilenumber= driver.findElement(By.id(Loc.getProperty("mobilenumber")));
        mobilenumber.sendKeys(Mobilenumber);

        WebElement loginviaOTPCTA = driver.findElement(By.id(Loc.getProperty("loginviaOTPCTA")));
        loginviaOTPCTA.click();

    }

    @DataProvider(name="mobilenumber")
    public Object [][] getDataFromDataProvide (){
       return new Object[][]
               {
                       {"1175506455","8426"},
                       {"9175506455","8426"},
                       {"9175506455","8426"}
               };



    }

}
