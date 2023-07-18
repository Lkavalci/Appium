package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import utils.Driver;

    public class DriverDeneme {
        AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver(); // driver class ına ne yazdıysak o calısacak
                    // appPackage ve appActivity de ne belirlediysek o
        @Test
        public void test01(){
            System.out.println(driver.getDeviceTime()); // saati yazdırdık


        }
    }

