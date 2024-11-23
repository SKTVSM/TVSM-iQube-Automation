package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.baseTest;

import java.sql.Time;

public class Testcase1 extends baseTest {

   @Test
    public static void Logintest(){

        WebElement loginbuttion = driver.findElement(By.xpath(Loc.getProperty("loginbuttion")));
        loginbuttion.click();

        WebElement mobilenumber= driver.findElement(By.id(Loc.getProperty("mobilenumber")));
        mobilenumber.sendKeys("9175506455");

        WebElement loginviaOTPCTA = driver.findElement(By.id(Loc.getProperty("loginviaOTPCTA")));
        loginviaOTPCTA.click();

    }

}
