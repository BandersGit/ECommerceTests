package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage{

    private final By firstNameInputField = By.id("input-firstname");
    private final By lastNameInputField = By.id("input-lastname");
    private final By emailInputField = By.id("input-email");
    private final By phoneNumberInputField = By.id("input-telephone");
    private final By passwordInputField = By.id("input-password");
    private final By passwordConfirmInputField = By.id("input-confirm");
    private final By acceptPrivacyPolicySquare = By.xpath("//*[@id=\"content\"]/form/div/div/div/label");
    private final By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");

    @Step("Type First Name {firstName} into input field")
    public void enterFirstName(String firstName){
        sendKeys(firstNameInputField, firstName);
    }

    @Step("Type Last Name {lastName} into input field")
    public void enterLastName(String lastName){
        sendKeys(lastNameInputField, lastName);
    }

    @Step("Type Email Address {email} into input field")
    public void enterEmail(String email){
        sendKeys(emailInputField, email);
    }

    @Step("Type Phone Number {phoneNumber} into input field")
    public void enterPhoneNumber(String phoneNumber){
        sendKeys(phoneNumberInputField, phoneNumber);
    }

    @Step("Type Password {password} into input field")
    public void enterPassword(String password){
        sendKeys(passwordInputField, password);
    }

    @Step("Type Password Confirmation {passwordConfirmation} into input field")
    public void enterPasswordConfirm(String passwordConfirm){
        sendKeys(passwordConfirmInputField, passwordConfirm);
    }

    @Step("Click Accept Privacy Policy Button")
    public void clickAcceptPrivacyPolicySquare(){
        click(acceptPrivacyPolicySquare);
    }

    @Step("Click Continue Button")
    public void clickContinueButton(){
        click(continueButton);
    }

}
