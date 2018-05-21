package Test;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidKeyCode;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GreatTafsirs {
    private static AndroidDriver driver;

    @BeforeClass
    public static void setUp() throws Exception {

        File app = new File("C:/Users/rshawabkeh/Desktop/Appium", "greatTafsirs-release_4-1-2018.apk");
        //To create an object of Desired Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("udid", "4df7ab2c3aab301d");
        capabilities.setCapability(CapabilityType.VERSION, "4.4.2");
        capabilities.setCapability("deviceName", "GT-N7100");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("app-package", "com.itgsolutions.greattafsirs");
        capabilities.setCapability("app-activity", "com.itgsolutions.greattafsirs.views.LogFile");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @Test
    public void myTest() throws InterruptedException {

        Thread.sleep(200);
        driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnMainSearchByWord')]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'etSearchWord')]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'etSearchWord')]")).sendKeys("محمد"+"\n");



    }
}
