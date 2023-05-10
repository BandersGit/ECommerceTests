package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    private final By guestCheckoutButton = By.xpath("//*[@id=\"form-checkout\"]/div/div[1]/div/div[1]/div/div[3]");
    private final By firstNameField = By.id("input-payment-firstname");
    private final By lastNameField = By.id("input-payment-lastname");
    private final By addressOneField = By.id("input-payment-address-1");
    private final By cityField = By.id("input-payment-city");
    private final By postCodeField = By.id("input-payment-postcode");
    private final By checkAgreeTermsAndConditions = By.xpath("//*[@id=\"form-checkout\"]/div/div[2]/div/div[5]/label");
    private final By continueButton = By.id("button-save");
    private final By paymentEmailField = By.id("input-payment-email");
    private final By paymentTelephoneField = By.id("input-payment-telephone");

    @Step("Click guest checkout radio button")
    public void clickGuestCheckoutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(guestCheckoutButton));
        click(guestCheckoutButton);
    }

    @Step("Fill in obligatory information")
    public void typeIntoFirstNameField(String firstName) { sendKeys(firstNameField, firstName);}
    public void typeIntoLastNameField(String lastName) { sendKeys(lastNameField, lastName);}
    public void typeIntoPaymentEmailField(String paymentEmail) {sendKeys(paymentEmailField, paymentEmail);}
    public void typeIntoPaymentTelephoneField(String paymentTelephone){sendKeys(paymentTelephoneField, paymentTelephone);}
    public void typeIntoAddressOneField(String addressOne) { sendKeys(addressOneField, addressOne);}
    public void typeIntoCityField(String cityName) { sendKeys(cityField, cityName);}
    public void typePostCodeField(String postCode) { sendKeys(postCodeField, postCode);}

    @Step("Click Agree terms & conditions checkbox")
    public void clickCheckAgreeTermsAndConditions(){
        click(checkAgreeTermsAndConditions);
    }

    @Step("Click Continue button to move on to next page")
    public CheckoutConfirmPage clickContinueButton(){
        moveToElementAndHover(continueButton);
        click(continueButton);
        return new CheckoutConfirmPage();
    }

}
