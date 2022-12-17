package BasePackage;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

public class BaseDeviceTest extends AbstractTestNGCucumberTests {

    DesiredCapabilities caps = new DesiredCapabilities();
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    public static Device device;
    private WebDriver webDriver;
    private String url = "https://youtu.be/4_vtOKcfCG8?t=20";
    //https://youtu.be/34jjrqiezm8?t=106


    @BeforeTest
    public void androidSetup() throws IOException, DeviceNotFoundException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--incognito");
        options.setHeadless(true);
        webDriver = new ChromeDriver(options);
        webDriver.get(url);
        WebElement play = webDriver.findElement(By.xpath("//*[@id='movie_player']"));
        play.click();
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);
        device = deviceInfo.getFirstDevice();
        try {
            if (deviceInfo.anyDeviceConnected()) {
                System.out.println("Device Name - " + device.getDeviceProductName());
                System.out.println("Device id   - " + device.getUniqueDeviceID());
                System.out.println("Device Build – " + device.getBuildVersion());
                System.out.println("Device Model Name – " + device.getModelNumber());
                System.out.println("Device Android Version – " + device.getProductVersion());
                System.out.println("Device Serial Number – " + device.getSerialNumber());
                caps.setCapability("deviceName", device.getModelNumber());
                caps.setCapability("appActivity", "com.twitter.android.StartActivity");
                caps.setCapability("appPackage", "com.twitter.android");
                caps.setCapability(MobileCapabilityType.NO_RESET, true);
                caps.setCapability("unicodeKeyboard", false);
                caps.setCapability("resetkeyboard", false);
                caps.setCapability("newCommandTimeout", 4000);
                caps.setCapability("adbExecTimeout", 10000);
                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                Process process = Runtime.getRuntime().exec("adb shell settings put secure location_mode 3");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeviceNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void iosSetup() throws IOException, DeviceNotFoundException {
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.IOS);
        device = deviceInfo.getFirstDevice();
        try {
            if (deviceInfo.anyDeviceConnected()) {
                System.out.println("Device Name - " + device.getDeviceProductName());
                System.out.println("Device id   - " + device.getUniqueDeviceID());
                System.out.println("Device Build – " + device.getBuildVersion());
                System.out.println("Device Model Name – " + device.getModelNumber());
                System.out.println("Device iOS Version – " + device.getProductVersion());
                System.out.println("Device Serial Number – " + device.getSerialNumber());
                caps.setCapability("deviceName", device.getModelNumber());
                caps.setCapability("udid", device.getUniqueDeviceID());
                caps.setCapability("bundleId", device.getDeviceProductName());
                caps.setCapability(CapabilityType.VERSION, device.getProductVersion());
                caps.setCapability(MobileCapabilityType.NO_RESET, true);
                caps.setCapability("resetkeyboard", false);
                caps.setCapability("unicodeKeyboard", false);
                caps.setCapability("newCommandTimeout", 4000);
                driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeviceNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static MobileElement element(By element) {return driver.findElement(element); }

    @AfterTest
    public void tearDown() {
        driver.quit();
        webDriver.quit();
    }
}
