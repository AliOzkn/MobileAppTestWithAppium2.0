package scenarios;

import TestComponents.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProductE2ETest extends BaseTest {


    @Test
    void verifySuccessfulPurchaseSteps() {
        categories.selectCategory();
        product.selectProduct();
        cart.goToAddressPage();
        address.setNewAddress();
        payment.selectCargo();
        payment.paymentMethod();

        assertTrue(payment.gpaySubmitBtn.isEnabled());



    }
}
