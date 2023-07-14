import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ArabamComTest {


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

    @Test
    public void arabamtest(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability("appPackage", "com.dogan.arabam"); // com.dogan.arabam-->Bu uygulamanın kimliği oluyor.
        capabilities.setCapability("appActivity", "");
    }
}
