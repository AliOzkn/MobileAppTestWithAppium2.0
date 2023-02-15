package pageobjects;

import PageComponents.Helper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Product extends Helper {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filtrele']")
    WebElement filterOptions;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dell (4)']")
    WebElement dellBags;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Önerilen']")
    WebElement placementBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fiyat Yüksekten Düşüğe']")
    WebElement fromExpensiveToCheap;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEPETE EKLE']")
    WebElement addToCart;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[15]")
    WebElement goToCart;


    public void doFilter() {
        click(filterOptions);
        click(dellBags);
    }

    public void doPlacement() {
        click(placementBtn);
        click(fromExpensiveToCheap);
    }

    public void goToCart() {
        click(addToCart);
        click(goToCart);
    }

    public void selectProduct(){
        doFilter();
        doPlacement();
        goToCart();
    }
}
