package testcase;

import PageObject.HomePage;
import TestBase.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TC_001_Clickonlogin extends baseTest {

    @Test (groups = "Sanity")
    public void clickingonloginCTA(){
        HomePage hm= new HomePage(driver);
        logger.info(" clicking BOok Now on home page ");
        hm.clicklogin();
        //Assert.fail(); //try to fail test case for see report

    }





}
