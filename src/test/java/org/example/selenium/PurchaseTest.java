package org.example.selenium;

import org.example.pages.ProductPage;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    //Temporary test
    @Test
    public void searchProduct() throws InterruptedException {
        String searchTerm = "Sony VAIO";

        ProductPage productPage = landingPage.productSearch(searchTerm);
    }
}
