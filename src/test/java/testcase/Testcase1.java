package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.baseTest;

public class Testcase1 extends baseTest {

   @Test
    public static void Logintest(){


        WebElement loginbuttion = driver.findElement(By.xpath("//i[@title='login']"));
        loginbuttion.click();

    }

}
