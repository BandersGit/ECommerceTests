package org.example.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private final By emailInputField = By.id("input-email");
    private final By passwordInputField = By.id("input-password");
    private final By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");

    public void enterEmail(String email){
        sendKeys(emailInputField, email);
    }

    public void enterPassword(String password){
        sendKeys(passwordInputField, password);
    }

    public MyAccountPage clickLoginButton(){
        click(loginButton);
        return new MyAccountPage();
    }
}
