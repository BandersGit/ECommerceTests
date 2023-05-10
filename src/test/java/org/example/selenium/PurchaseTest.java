package org.example.selenium;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.BasePage;
import org.example.pages.CheckoutConfirmPage;
import org.example.pages.CheckoutPage;
import org.example.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    @Test
    @QaseTitle("Purchase with Guest Checkout and valid customer details should succeed")
    public void checkOut_withValidProductAndValidAccountDetails_ShouldSucceed() throws InterruptedException {
        //Given
        String searchTerm = "Sony VAIO";
        String email = REGISTER_NUMBER_STRING + "@gmail.com";

        //When
        ProductPage productPage = landingPage.productSearch(searchTerm);

        CheckoutPage checkoutPage = productPage.clickBuyNowButton();
        checkoutPage.clickGuestCheckoutButton();
        checkoutPage.typeIntoFirstNameField(REGISTER_NUMBER_STRING);
        checkoutPage.typeIntoLastNameField(REGISTER_NUMBER_STRING);
        checkoutPage.typeIntoPaymentEmailField(email);
        checkoutPage.typeIntoPaymentTelephoneField(REGISTER_NUMBER_STRING);
        checkoutPage.typeIntoAddressOneField(REGISTER_NUMBER_STRING);
        checkoutPage.typeIntoCityField(REGISTER_NUMBER_STRING);
        checkoutPage.typePostCodeField(REGISTER_NUMBER_STRING);
        checkoutPage.clickCheckAgreeTermsAndConditions();

        CheckoutConfirmPage checkoutConfirmPage = checkoutPage.clickContinueButton();
        Thread.sleep(2000);
        checkoutConfirmPage.clickConfirmButton();
        Thread.sleep(1000);
        String expectedTitle = BasePage.getTitle();

        //Then
        assertPageTitleEqualsExpectedTitle(expectedTitle);
    }

    @Step("Assert Page Title is same as expected Title")
    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle, "Your order has been placed!");
    }
}
