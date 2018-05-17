package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class RamiTest {

    private static AndroidDriver driver;

    @BeforeClass
    public static void setUp() throws Exception {
//location of the app
        File app = new File("C:/Users/rshawabkeh/Desktop/Appium", "CALCU.apk");
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
        capabilities.setCapability("app-package", "com.gomo.calculator");
        //set the Launcher activity name of the app
        capabilities.setCapability("app-activity", "com.gomo.calculator.ui.activity.MainActivity");
//driver object with new Url and Capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }

    @Test
    public void myTest() {
        WebElement sevenKey = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'input_num_7')]"));
        sevenKey.click();

        WebElement PlusKey = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'display_op_add')]"));
        PlusKey.click();

        WebElement ThreeKay = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'input_num_3')]"));
        ThreeKay.click();

        WebElement EqualSign = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'display_eq')]"));
        EqualSign.click();

        WebElement total = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,result)]"));

        String TotalValue = total.getText();
        System.out.print(TotalValue);



    }


}
