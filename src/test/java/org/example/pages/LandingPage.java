package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage extends BasePage {

    private final By loginPageLink = By.linkText("My account");
    private final By registerPageLink = By.linkText("Register");

    public LoginPage followLinkToLoginPage (){
        click(loginPageLink);
        return new LoginPage();
    }

    public RegisterPage followLinkToRegisterPage(){

        hover(loginPageLink);
        click(registerPageLink);
        return new RegisterPage();
    }
}
