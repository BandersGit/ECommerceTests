package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage extends BasePage {

    private final By loginPageLink = By.linkText("My account");
    private final By registerPageLink = By.linkText("Register");
    private final By logOutSuccessPageLink = By.linkText("Logout");
    private final By searchBar = By.name("search");
    private final By firstProduct = By.className("title");

    public LoginPage followLinkToLoginPage (){
        click(loginPageLink);
        return new LoginPage();
    }

    public RegisterPage followLinkToRegisterPage(){

        hover(loginPageLink);
        click(registerPageLink);
        return new RegisterPage();
    }

    public LogOutSuccessPage followLinkToLogoutSucessPage(){
        click(logOutSuccessPageLink);
        return new LogOutSuccessPage();
    }

    public void productSearch(String input){
        click(searchBar);
        sendKeys(searchBar, input);
        click(firstProduct);
    }
}
