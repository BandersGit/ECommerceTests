package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private final By buyNowButton = By.linkText("Buy now");

    @Step("Click Buy Now button")
    public CheckoutPage clickBuyNowButton(){
        click(buyNowButton);
        return new CheckoutPage();
    }
}
