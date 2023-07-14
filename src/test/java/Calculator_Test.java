import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Calculator_Test {

    AndroidDriver<AndroidElement> driver;// Android cihazlar icin kullanilmasi gereken driverdir. ios da kullanılmaz.

// AppiumDriver<AndroidElement> driver2; // hem android hem de ios cihazlar icin kullanilabilen driver(Android icin bu driver kullanilabilir)
// AppiumDriver<MobileElement> driver3; // ios icin kullanilir (Android cihazlar icin de kullanilabilir)


@Test
    public void test01() throws MalformedURLException {

    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");// Eger ki kullandigimiz android surumu 6 veya ustuyse UiAutomator2 kullanilir
    capabilities.setCapability(MobileCapabilityType.APP,"C:\\WISE\\APPIUM\\Appium\\Apps\\Calculator_8.4.1 (520193683)_Apkpure.apk");


    driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // 30 sn bekle çalışmazsa işlemi bitirmesi için komut girdik



}

}
