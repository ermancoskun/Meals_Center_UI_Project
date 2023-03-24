package tests.US_001_002_003_004;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class US_003 {

    @Test
    public void test01(){
        ReusableMethods.goTouserHomePage();
        ReusableMethods.userLoginMethod("erman.coskun","1234567");


    }
}
