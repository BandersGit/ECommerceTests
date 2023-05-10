package org.example.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{

    private final By firstNameInputField = By.id("input-firstname");
    private final By lastNameInputField = By.id("input-lastname");
    private final By emailInputField = By.id("input-email");
    private final By phoneNumberInputField = By.id("input-telephone");
    private final By passwordInputField = By.id("input-password");
    private final By passwordConfirmInputField = By.id("input-confirm");
    private final By acceptPrivacyPolicySquare = By.className("agree");
    private final By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");

    public void enterFirstName(String firstName){
        sendKeys(firstNameInputField, firstName);
    }

    public void enterLastName(String lastName){
        sendKeys(lastNameInputField, lastName);
    }

    public void enterEmail(String email){
        sendKeys(emailInputField, email + "@gmail.com");
    }

    public void enterPhoneNumber(String phoneNumber){
        sendKeys(phoneNumberInputField, phoneNumber);
    }

    public void enterPassword(String password){
        sendKeys(passwordInputField, password);
    }

    public void enterPasswordConfirm(String passwordConfirm){
        sendKeys(passwordConfirmInputField, passwordConfirm);
    }

    public void clickAcceptPrivacyPolicySquare(){
        click(acceptPrivacyPolicySquare);
    }

    public void clickContinueButton(){
        click(continueButton);
    }



}
