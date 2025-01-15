package Pages;

import base.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRideNewpage extends baseTest {




    public void FullName(String Name){
        WebElement Fullnametext = driver.findElement(By.id("name"));
        Fullnametext.sendKeys(Name);
    }
    public void Email (String Email){
        WebElement EmailidTextbox = driver.findElement(By.id("Email"));
        EmailidTextbox.sendKeys(Email);
    }

    public void MobileNumber(String MobileNumber){
        WebElement MobileNumberText = driver.findElement(By.id("Mobile"));
        MobileNumberText.sendKeys(MobileNumber);
    }

    public void Pincode(String pincodeorcity){
        WebElement pincodetextbox = driver.findElement(By.id("txtTestrideLocation"));
        pincodetextbox.sendKeys(pincodeorcity);

        }

    public void Dealership (String dealerName)
    {
        WebElement dealershiptextbox = driver.findElement(By.id("selectDealerList"));
        dealershiptextbox.sendKeys(dealerName);
    }

    public void submit(){

        WebElement SubmitCTA= driver.findElement(By.id("btnSubmitTestrideBooking"));
        SubmitCTA.click();
    }

    public void Checkbox(){

        WebElement consentcheckbox = driver.findElement(By.id("IsHomeTestRide"));
        consentcheckbox.click();

        /*
        //check if consent is already select
        if(!consentcheckbox.isSelected()){
            //click the checkbox to select
            consentcheckbox.click();
    }
        // (Optional) Verify the checkbox is selected
        if (consentcheckbox.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Failed to select the checkbox.");
        }
         */

}







}
