package pageobjects;

import PageComponents.Helper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Cart extends Helper {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEPETİ ONAYLA']")
    WebElement confirmCart;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ÜYE OLMADAN DEVAM ET']")
    WebElement continueWithoutAMemberBtn;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='E-posta Adresiniz']")
    WebElement email;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='1'])[4]")
    WebElement confirmationBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GÖNDER']")
    WebElement sendBtn;


    public void goToAddressPage(){
        click(confirmCart);
        click(continueWithoutAMemberBtn);
        email.sendKeys(faker.bothify("??##?#?#@gmail.com"));
        click(confirmationBtn);
        click(sendBtn);
    }
}
