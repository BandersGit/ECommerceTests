package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends BasePage {

    private final By loginPageLink = By.linkText("My account");
    private final By registerPageLink = By.linkText("Register");
    private final By logOutSuccessPageLink = By.linkText("Logout");
    private final By searchBar = By.name("search");
    private By firstProduct;

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

    public ProductPage productSearch(String input) throws InterruptedException {
        click(searchBar);
        sendKeys(searchBar, input);
        firstProduct = By.linkText(input);
        Thread.sleep(2000);
        click(firstProduct);
        return new ProductPage();
    }
}
