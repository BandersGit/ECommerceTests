package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    private final By loginPageLink = By.linkText("My account");
    private final By registerPageLink = By.linkText("Register");
    private final By searchBar = By.name("search");
    private By firstProduct;

    @Step("Click and follow link to Login Page")
    public LoginPage followLinkToLoginPage (){
        click(loginPageLink);
        return new LoginPage();
    }

    @Step("Hover, click and follow link to Register Page")
    public RegisterPage followLinkToRegisterPage(){
        moveToElementAndHover(loginPageLink);
        click(registerPageLink);
        return new RegisterPage();
    }

    @Step("Search product with Search Bar")
    public ProductPage productSearch(String input) throws InterruptedException {
        click(searchBar);
        sendKeys(searchBar, input);
        firstProduct = By.linkText(input);
        Thread.sleep(2000);
        click(firstProduct);
        return new ProductPage();
    }
}
