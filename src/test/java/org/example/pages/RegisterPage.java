package org.example.pages;

import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends BasePage{

    private final Random rand = new Random();

    private final By firstNameInputField = By.id("");
    private final By lastNameInputField = By.id("");
    private final By emailInputField = By.id("");
    private final By phoneNumberInputField = By.id("");
    private final By passwordInputField = By.id("");
    private final By passwordConfirmInputField = By.id("");
    private final By acceptPrivacyPolicySquare = By.id("");
    private final By continueButton = By.id("");

    public String generateRegisterNumber(){
        int registerNumber = rand.nextInt();
        return Integer.toString(registerNumber);
    }

    public void enterFirstName(String firstName){
        sendKeys(firstNameInputField, firstName);
    }

    public void enterLastName(String lastName){
        sendKeys(lastNameInputField, lastName);
    }

    public void enterEmail(String email){
        sendKeys(emailInputField, email);
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
