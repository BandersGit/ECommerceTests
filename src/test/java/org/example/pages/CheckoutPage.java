package org.example.pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    private final By firstNameField = By.id("input-payment-firstname");
    private final By lastNameField = By.id("input-payment-lastname");
    private final By addressOneField = By.id("input-payment-address-1");
    private final By cityField = By.id("input-payment-city");
    private final By postCodeField = By.id("input-payment-postcode");
    private final By checkAgreeTermsAndConditions = By.id("input-agree");
    private final By buttonContinue = By.id("button-save");

    public void typeIntoFirstNameField(String input){
        sendKeys(firstNameField, input);
    }
    //FORTSÄTT MED INPUTS HÄR
    public void clickCheckAgreeTermsAndConditions(){
        click(checkAgreeTermsAndConditions);
    }

    public void clickButtonContinue(){
        click(buttonContinue);
    }
}
