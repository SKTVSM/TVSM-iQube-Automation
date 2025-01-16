package testcase;

import PageObject.HomePage;
import org.testng.annotations.Test;

public class TC_001_Clickonlogin extends baseTest {

    @Test
    public void clickingonloginCTA(){
        HomePage hm= new HomePage(driver);
        hm.clicklogin();
    }





}
