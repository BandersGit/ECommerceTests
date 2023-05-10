package org.example.selenium;

import org.example.pages.CheckoutPage;
import org.example.pages.ProductPage;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    //Temporary test
    @Test
    public void checkOut_withValidProductAndValidAccountDetails_ShouldSucceed() throws InterruptedException {

        //Given
        String searchTerm = "Sony VAIO";
        String email = REGISTER_NUMBER_STRING + "@gmail.com";
        String firstName = REGISTER_NUMBER_STRING;
        String lastName = REGISTER_NUMBER_STRING;
        String paymentTelephone = REGISTER_NUMBER_STRING;
        String addressOne = REGISTER_NUMBER_STRING;
        String cityName = REGISTER_NUMBER_STRING;
        String postCode = REGISTER_NUMBER_STRING;

        //When
        ProductPage productPage = landingPage.productSearch(searchTerm);
        CheckoutPage checkoutPage = productPage.clickBuyNowButton();
        checkoutPage.typeIntoFirstNameField(firstName);
        checkoutPage.typeIntoLastNameField(lastName);
        checkoutPage.typeIntoPaymentEmailField(email);
        checkoutPage.typeIntoPaymentTelephoneField(paymentTelephone);
        checkoutPage.typeIntoAddressOneField(addressOne);
        checkoutPage.typeIntoCityField(cityName);
        checkoutPage.typePostCodeField(postCode);

        //Then
    }
}
