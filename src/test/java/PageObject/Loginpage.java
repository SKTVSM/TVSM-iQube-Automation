package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

    public Loginpage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//h1[normalize-space()='TVS iQube Customer Login']")
    WebElement txt_onloginpage;




    public String getloginpagetext(){

      String txtloginpage =  txt_onloginpage.getText();
       return txtloginpage;

    }

}
