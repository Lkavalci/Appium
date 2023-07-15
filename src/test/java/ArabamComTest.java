import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ArabamComTest {


    AndroidDriver<AndroidElement> driver;// Android cihazlar icin kullanilmasi gereken driverdir. ios da kullanılmaz.

    // Arabam kac para bolumune tiklayalim
// Aracimin fiyatini merak ediyorum bolumunetiklayalim
// Wolkswagen markasini secelim
// yil secimi yapalim
// model secimi yapalim
// govde tipini secelim
// yakit tipini secelim
// vites tipini secelim
// Versiyon secimi yapalim
// aracin km bilgilerini girelim
// aracin rengini secelim
// opsiyel donanim (varsa) seecelim
// degisen bilgisi ekleyerek tramer kaydi belirtelim
// aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
// uygulamayi kapatalim

    @BeforeTest
    public void arabamTestSetup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability("appPackage", "com.dogan.arabam"); // com.dogan.arabam-->Bu uygulamanın kimliği oluyor.
        // Hangi uygulama uzerinde calismak istiyorsak apk infodan o uygulamanin degerini aliyoruz

        capabilities.setCapability("appActivity", "com.dogan.arabam.presentation.feature.home.HomeActivity");// Uygulamayi actiktan sonra hangi sayfadan baslayacagimizi orn; Anasayfa, Profil, vb
        // locate alırken home activity tercih edilir.


        driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // 30 sn bekle çalışmazsa işlemi bitirmesi için komut girdik


    }
}
