package org.example.pages;

import org.example.selenium.BaseTest;
import org.openqa.selenium.By;

public class CheckoutConfirmPage extends BasePage {
    private final By confirmButton = By.id("button-confirm");

    public void clickContinueButton(){
        moveToElementAndHover(confirmButton);
        click(confirmButton);
    }
}
