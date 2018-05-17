package Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GreatTafsirs {
    private static AndroidDriver driver;

    @BeforeClass
    public static void setUp() throws Exception {
//location of the app
        File app = new File("C:/Users/rshawabkeh/Desktop/Appium", "greatTafsirs-release_4-1-2018.apk");
        //To create an object of Desired Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
//OS Name
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("udid", "4d001ce1d0db3200");
//Mobile OS version. In My case its running on Android 4.2
        capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
//To Setup the device name
        capabilities.setCapability("deviceName", "SM-G360H");
        capabilities.setCapability("platformName", "Android");
//set the package name of the app
        capabilities.setCapability("app-package", "com.itgsolutions.greattafsirs");
        //set the Launcher activity name of the app
        capabilities.setCapability("app-activity", "com.itgsolutions.greattafsirs.views.LogFile");
//driver object with new Url and Capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @Test
    public void myTest() throws InterruptedException {

        Thread.sleep(3000);
        WebElement Search = driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnMainSearchByWord')]"));
        Search.click();

        WebElement SearchText = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'etSearchWord')]"));
        SearchText.click();
        SearchText.sendKeys("محمد");


        //driver.getKeyboard().sendKeys("محمد");

        Thread.sleep(2000);

        driver.quit();


    }
}
