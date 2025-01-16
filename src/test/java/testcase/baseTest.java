package testcase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class baseTest {

    public WebDriver driver;

    public Logger logger; //log variable


    @BeforeClass
    public void setup(){

        logger= LogManager.getLogger(this.getClass()); // log initiation for all method

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tvsmotor.com/electric-scooters/tvs-iqube");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void teardown(){

        driver.close();

        System.out.println("Closing Browser successfully");

    }




}
