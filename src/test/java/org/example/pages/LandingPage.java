package org.example.pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    private final By loginPageLink = By.linkText("My account");
    private final By registerPageLink = By.linkText("Register");

    public LoginPage followLinkToLoginPage (){
        click(loginPageLink);
        return new LoginPage();
    }

    public RegisterPage followLinkToRegisterPage(){
        click(registerPageLink);
        return new RegisterPage();
    }
}
