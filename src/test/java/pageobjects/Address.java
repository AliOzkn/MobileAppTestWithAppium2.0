package pageobjects;

import PageComponents.Helper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


import static TestComponents.BaseTest.driver;

public class Address extends Helper {

    @AndroidFindBy(xpath = "//android.widget.Button[@text='KABUL ET']")
    WebElement acceptCookies;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' Yeni adres oluştur']")
    WebElement createNewAddressBtn;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[1]")
    WebElement addressTitle;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[2]")
    WebElement firstName;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[3]")
    WebElement lastName;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[4]")
    WebElement phoneNumber;
    @AndroidFindBy(xpath = "//android.view.View[@text='Seçiniz']")
    WebElement city;
    @AndroidFindBy(xpath = "(//android.view.View[@index='1'])[18]")
    WebElement township;
    @AndroidFindBy(xpath = "(//android.view.View[@index='1'])[20]")
    WebElement district;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@index='1'])[5]")
    WebElement address;


    public void personalInformation() {
        click(acceptCookies);
        click(createNewAddressBtn);
        addressTitle.sendKeys("Home");
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        phoneNumber.sendKeys(faker.numerify("###########"));
    }

    public void city(){
        click(city);
        driver.findElement(new AppiumBy
                        .ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "ÇANAKKALE" + "\").instance(0))"))
                .click();
        click(township);
        driver.findElement(new AppiumBy
                        .ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "GÖKÇEADA" + "\").instance(0))"))
                .click();
        click(district);
        driver.findElement(new AppiumBy
                        .ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "BADEMLİ KÖYÜ" + "\").instance(0))"))
                .click();
        address.sendKeys(faker.address().streetName() + faker.address().buildingNumber());
        driver.findElement(new AppiumBy
                        .ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "KAYDET" + "\").instance(0))"))
                .click();
    }

    public void setNewAddress(){
        personalInformation();
        city();
    }
}
