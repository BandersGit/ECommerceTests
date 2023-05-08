package org.example.selenium;

import org.example.pages.ProductPage;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    String searchTerm = "Sony VAIO";
    @Test
    public void searchProduct() throws InterruptedException {
        ProductPage productPage = landingPage.productSearch(searchTerm);
    }
}
