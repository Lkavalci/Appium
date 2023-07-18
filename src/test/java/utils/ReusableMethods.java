package utils;

import io.appium.java_client.android.AndroidDriver;

public class ReusableMethods {

    // olusturdugumuz methodları buraya koyuyoruz.


    // aranan textin bulunana kadar kaydır methodu :
    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();
    }
}
