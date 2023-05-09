package org.example.selenium;

import org.example.pages.CheckoutPage;
import org.example.pages.ProductPage;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    //Temporary test
    @Test
    public void logout_withValidProductAndValidAccountDetails_ShouldSucceed() throws InterruptedException {

        //Given
        String searchTerm = "Sony VAIO";
        String email = REGISTER_NUMBER_STRING + "@gmail.com";

        //When
        ProductPage productPage = landingPage.productSearch(searchTerm);
        CheckoutPage checkoutPage = productPage.clickBuyNowButton();
        //checkoutPage.typeIntoFirstNameField();

        //Then
    }
}
