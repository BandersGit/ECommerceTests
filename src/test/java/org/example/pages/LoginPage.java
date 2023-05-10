package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private final By emailInputField = By.id("input-email");
    private final By passwordInputField = By.id("input-password");
    private final By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");

    @Step("Type Email Address {email} into input field")
    public void enterEmail(String email){
        sendKeys(emailInputField, email);
    }

    @Step("Type Password {password} into password field")
    public void enterPassword(String password){
        sendKeys(passwordInputField, password);
    }

    @Step("Click the Login Button")
    public void clickLoginButton(){
        click(loginButton);
    }
}
