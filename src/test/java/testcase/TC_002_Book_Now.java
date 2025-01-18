package testcase;

import PageObject.HomePage;
import PageObject.SelectVehiclePage;
import TestBase.baseTest;
import org.testng.annotations.Test;

public class TC_002_Book_Now extends baseTest {

    @Test (groups= {"Regression","Sanity"})
    public void selectvarintandcolour() throws InterruptedException {
        HomePage hm= new HomePage(driver);
        System.out.println(driver.getCurrentUrl());

        hm.clickOnBookNow();

        SelectVehiclePage selectVehiclePage =new SelectVehiclePage(driver);

        System.out.println(driver.getCurrentUrl());

        logger.info("selecting variant and colour");

        selectVehiclePage.selectiqube3kwhandcolour();
        logger.info("click on next CTA ");
        selectVehiclePage.clickonNextCTA();

    }




}
