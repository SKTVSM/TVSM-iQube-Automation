package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class myfirsttest {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://uat-www.tvsmotor.net/electric-vehicle/tvs-iqube");
        System.out.println("site load successfully");

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement loginbuttion = driver.findElement(By.xpath("//i[@title='login']"));
        loginbuttion.click();


        driver.close();


    }
}
