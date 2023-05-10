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
    private final By paymentEmailField = By.id("input-payment-email");
    private final By paymentTelephoneField = By.id("input-payment-telephone");

    public void typeIntoFirstNameField(String firstName){
        sendKeys(firstNameField, firstName);
    }
    public void typeIntoLastNameField(String lastName) { sendKeys(lastNameField, lastName);}
    public void typeIntoPaymentEmailField(String paymentEmail) {sendKeys(paymentEmailField, paymentEmail);}
    public void typeIntoPaymentTelephoneField(String paymentTelephone){sendKeys(paymentTelephoneField, paymentTelephone);}
    public void typeIntoAddressOneField(String addressOne) { sendKeys(addressOneField, addressOne);}
    public void typeIntoCityField(String cityName) { sendKeys(cityField, cityName);}
    public void typePostCodeField(String postCode) { sendKeys(postCodeField, postCode);}


    public void clickCheckAgreeTermsAndConditions(){
        click(checkAgreeTermsAndConditions);
    }

    public void clickButtonContinue(){
        click(buttonContinue);
    }
}
