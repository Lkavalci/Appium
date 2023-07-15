import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

    // NOT:
// apk sayesinde telefona kurulan programların apklarını, (yollarını, adreslerini) alabiliyoruz.
// kurulu olan bir uygulamayı driver.activeApp sayesinde hundle degeri ile cağırabiliyoruz. (yani uygulamayı acabiliyoruz)
// driver.activateapp(bundleId "com.google.android.calculator"); calculator classında bu yolu kullanarak calculatoru acabiliriz.
public class AppYukleme {


    AndroidDriver<AndroidElement> driver;// Android cihazlar icin kullanilmasi gereken driverdir. ios da kullanılmaz.

    @Test
    public void test01() throws MalformedURLException {

        //  kullanici gerekli kurulumlari yapar
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");// Eger ki kullandigimiz android surumu 6 veya ustuyse UiAutomator2 kullanilir
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\WISE\\APPIUM\\Appium\\Apps\\arabam.com_4.8.0_Apkpure.apk");
        // app capabilityType bir uygulamayi yuklemek istedigimizde indirdigimiz apk dosyasinin path uzantisini vererek o uygulamayi yuklemek icin kullandigimiz desiredCapability


        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // 30 sn bekle çalışmazsa işlemi bitirmesi için komut girdik
    }
}
