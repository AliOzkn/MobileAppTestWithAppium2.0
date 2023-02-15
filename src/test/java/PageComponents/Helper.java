package PageComponents;

import com.github.javafaker.Faker;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static TestComponents.BaseTest.driver;
public class Helper {
    public Faker faker;
    WebDriverWait wait;


    public Helper() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        faker = new Faker();
    }

    public void click(WebElement el) {
        wait.until(ExpectedConditions.visibilityOf(el)).click();
    }
    public void wait(WebElement el) {
        wait.until(ExpectedConditions.visibilityOf(el));
    }
}
