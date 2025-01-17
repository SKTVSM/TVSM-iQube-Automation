package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectVehiclePage extends BasePage{


    public SelectVehiclePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[@class='d-block'])[1]") WebElement variant_iqube2_kwh ;

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //WebElement variant_iqube3_kwh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[normalize-space()='iQube 3.4 kWh']")));


    @FindBy(xpath = "//h3[normalize-space()='iQube 3.4 kWh']") WebElement variant_iqube3_kwh ;
    @FindBy(xpath = "//h3[normalize-space()='iQube S 3.4 kWh']") WebElement variant_iqube3_Skwh ;
    @FindBy(xpath="//a[@class='nav-link active']//h3[@class='d-block']") WebElement variant_iqube3_STkwh ;

    @FindBy(xpath="//a[@class='nav-link active']//h3[@class='d-block']") WebElement variant_iqube5_STkwh;

    @FindBy(xpath="//a[@class='nav-link pearl-white active']//i[@class='icon-tick']") WebElement color_white;


    @FindBy(xpath="//a[@class='nav-link ugcelebration-orange active']//i[@class='icon-tick']") WebElement color_celebrationOrange;
    @FindBy(xpath="//a[@id='submitVariantInfo']") WebElement btn_Next;


    public void selectiqube2kwhandcolour(){
    variant_iqube2_kwh.click();
    color_white.click();
}

    public void selectiqube3kwhandcolour() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", color_white);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", variant_iqube3_kwh);

        //variant_iqube3_kwh.click();

        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",color_white);

       // color_white.click();
    }
 public void clickonNextCTA(){
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btn_Next);

       // btn_Next.click();
 }

}
