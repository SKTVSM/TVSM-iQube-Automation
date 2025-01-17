package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class baseTest {

    public WebDriver driver;
    public Properties p;

    public Logger logger; //log variable


    @Parameters({"os","browser"})
    @BeforeClass
    public void setup(String os,String br) throws IOException {

        //for loading propertyfile

        FileReader  file = new FileReader("./src/test/resources/configflie/properties");
         p = new Properties();
         p.load(file);

        logger= LogManager.getLogger(this.getClass());


        //Passing browser value  from xml file for execution
        switch (br.toLowerCase()) {

            case "chrome":driver= new ChromeDriver();break;
            case "edge":driver= new EdgeDriver();break;
            case "firefox":driver= new FirefoxDriver();break;
            default:
                System.out.println("Invalid Browser name");
                return;
        }
        // log initiation for all method
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("TestURL")); //reading url value from property file

    }

    @AfterClass
    public void teardown(){

        driver.quit();

        System.out.println("quiting Browser successfully");

    }




}
