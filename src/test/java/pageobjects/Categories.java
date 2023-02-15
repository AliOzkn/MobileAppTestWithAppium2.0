package pageobjects;

import PageComponents.Helper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Categories extends Helper {

    @AndroidFindBy(className = "android.widget.TextView")
    WebElement mainCategories;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GİYİM & AKSESUAR']")
    WebElement clothAndAccessory;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Çanta & Aksesuar']")
    WebElement bagAndAccessories;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Laptop Çantası']")
    WebElement laptopBag;


    public void selectCategory() {
        click(mainCategories);
        click(clothAndAccessory);
        click(bagAndAccessories);
        click(laptopBag);


    }

}
