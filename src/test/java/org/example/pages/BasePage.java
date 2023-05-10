package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BasePage {
    private final By logOutSuccessPageLink = By.linkText("Logout");

    private final By landingPageLink = By.xpath("//*[@id=\"entry_217821\"]/figure/a");

    protected static WebDriver driver;

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected void hover(By locator) {
        WebElement webElement = find(locator);
        Actions action = new Actions(driver);
        action.moveToElement(webElement).perform();
    }

    protected void sendKeys(By locator, String input){
        find(locator).sendKeys(input);
    }

    protected String getText(By locator){
        return find(locator).getText();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    @Step("Click the Logout Button")
    public LogOutSuccessPage logout(){
        click(logOutSuccessPageLink);
        return new LogOutSuccessPage();
    }

    public LandingPage goToLandingPage(){
        click(landingPageLink);
        return new LandingPage();
    }
}
