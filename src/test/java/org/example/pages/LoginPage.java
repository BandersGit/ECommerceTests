package org.example.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private final By emailAddressInputField = By.id("input-email");
    private final By passwordInputField = By.id("input-password");
    private final By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");

    public void enterEmailAddress(String emailAddress){
        sendKeys(emailAddressInputField, emailAddress);
    }

    public void enterPassword(String password){
        sendKeys(passwordInputField, password);
    }

    public void clickLoginButton(){
        click(loginButton);
    }
}
