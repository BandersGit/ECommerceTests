package org.example.pages;

import io.qase.api.annotation.Step;
import org.example.selenium.BaseTest;
import org.openqa.selenium.By;

public class CheckoutConfirmPage extends BasePage {
    private final By confirmButton = By.id("button-confirm");

    @Step("Click Confirm button to move on to next page")
    public void clickConfirmButton(){
        moveToElementAndHover(confirmButton);
        click(confirmButton);
    }
}
