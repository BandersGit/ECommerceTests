package org.example.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private final By buyNowButton = By.linkText("Buy now");

    public CheckoutPage clickBuyNowButton(){
        click(buyNowButton);
        return new CheckoutPage();
    }
}
