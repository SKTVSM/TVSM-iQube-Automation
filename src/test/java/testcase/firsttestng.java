package testcase;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class firsttestng {

    @Test(priority = 1)
    void openapplication(){
        System.out.println("opening application ");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("login in application");

    }
    @Test (priority = 3)
    void closeapplication(){
        System.out.println("closing application ");
    }
}
