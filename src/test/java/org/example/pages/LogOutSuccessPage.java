package org.example.pages;

import org.openqa.selenium.By;

public class LogOutSuccessPage extends BasePage {

    private final By logoutSuccessMessage = By.xpath("//*[@id=\"content\"]/h1");

    public String getLogoutSuccessText() {
        return getText(logoutSuccessMessage);
    }
}
