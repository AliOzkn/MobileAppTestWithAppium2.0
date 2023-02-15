package TestComponents;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pageobjects.*;
import utilities.DeviceFarmUtility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Listeners({Listener.class})

public class BaseTest {
    String S;
    public static AppiumDriver driver;
    DesiredCapabilities capabilities;

    public Categories categories;
    public Product product;
    public Cart cart;
    public Address address;
    public Payment payment;

    public BaseTest() {
        S = DeviceFarm.ANDROID_S.path;
    }

    @BeforeMethod
    public void setUp() {
        try {
            capabilities = new DesiredCapabilities();
            capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.S);
            capabilities.setCapability("app", new File("src/main/resources/apps/A101.apk").getAbsolutePath());
            driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Error:" + e.getCause());
        } catch (SessionNotCreatedException e) {
            System.out.println("Error:" + e.getCause());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        categories = new Categories();
        product = new Product();
        cart = new Cart();
        address = new Address();
        payment = new Payment();
    }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
    }

}
