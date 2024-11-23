package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class baseTest {

    public static WebDriver driver;
    public static Properties prop= new Properties();

    public static FileReader fr;

@BeforeTest
    public void setup() throws IOException {

    System.out.println("the path is "+System.getProperty("user.dir"));
        if (driver==null) {
            FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configflie\\properties");
            prop.load(fr);
        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("TestURL"));
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("TestURL"));
        } else if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get(prop.getProperty("TestURL"));
        }


    }
   @AfterTest
    public static void teardown(){
        driver.close();
        System.out.println("Closing Browser Buccessfully");

    }




}
