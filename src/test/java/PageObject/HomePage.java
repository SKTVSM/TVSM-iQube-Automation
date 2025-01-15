package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseTest {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//a[@class='btn btn-tansparent'][normalize-space()='Book iQube']")
    WebElement Book_iQube ;

    @FindBy(xpath = "//i[@title='login']") WebElement btn_Login ;


    public void clickOnBookNow(){
        Book_iQube.click();
    }

    public void clicklogin(){
        btn_Login.click();
    }


}
