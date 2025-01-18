package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class baseTest {

    public static WebDriver driver;
    public Properties p;

    public Logger logger; //log variable



    @BeforeClass (groups = {"Sanity","Regression"}) // adding grouping to base class
    @Parameters({"os","browser"})
    public void setup(String os ,String br) throws IOException {

        //for loading property file

        FileReader  file = new FileReader("./src/test/resources/configflie/properties");
         p = new Properties();
         p.load(file);

        logger= LogManager.getLogger(this.getClass());

        //System.out.println(os); // pring os


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

    @AfterClass (groups = {"Sanity","Regression"})
    public void teardown(){

        driver.quit();

        System.out.println("Quiting Browser successfully");

    }

    public String randomeString() {
        String generatedString = randomAlphabetic(5);
        return (generatedString);
    }

    public String randomeNumber() {
        String generatedString2 = RandomStringUtils.randomNumeric(10);
        return (generatedString2);
    }

    public String captureScreen(String tname) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }
        return destination;

    }





}
