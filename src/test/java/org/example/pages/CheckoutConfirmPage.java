package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutConfirmPage extends BasePage {
    private final By confirmButton = By.id("button-confirm");

    @Step("Click Confirm button to move on to next page")
    public void clickConfirmButton(){
        //moveToElementAndHover(confirmButton);
//        WebDriverWait wait = new WebDriverWait(Scenario1Test.driver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='brandSlider']/div[1]/div/div/div/img)[50]")));
//        element.click();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        //java.time.Duration
        wait.until(ExpectedConditions.elementToBeClickable(confirmButton)).click();
        //click(confirmButton);
    }
}
