package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {



    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }






}
