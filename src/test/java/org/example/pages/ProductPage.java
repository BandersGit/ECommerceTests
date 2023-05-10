package org.example.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private final By buyNowButton = By.xpath("//*[@id=\"entry_216843\"]/button");

    public CheckoutPage clickBuyNowButton(){
        click(buyNowButton);
        return new CheckoutPage();
    }
}
