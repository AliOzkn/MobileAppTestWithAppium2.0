package pageobjects;

import PageComponents.Helper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Payment extends Helper {

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='₺0,00 MNG Kargo']")
    WebElement cargo;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Kaydet ve Devam Et']")
    WebElement saveAndContinueBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Garanti Pay']")
    WebElement garantiPay;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='2']")
    WebElement checkBox;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Garanti Pay ile Öde\"]")
    WebElement payWithGarantiPay;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='DEVAM']")
    public WebElement gpaySubmitBtn;

    public void selectCargo() {
        click(cargo);
        click(saveAndContinueBtn);
    }
    public void paymentMethod(){
        click(garantiPay);
        click(checkBox);
        click(payWithGarantiPay);
        wait(gpaySubmitBtn);
    }
}
