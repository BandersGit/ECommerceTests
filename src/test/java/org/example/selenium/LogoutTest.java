package org.example.selenium;

import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void login_whenInputValidAccountDetails_shouldLogin() {
        //Given
        String email = "a@b.cd";
        String password = "abcd";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        loginPage.logout();

        String logoutSuccessMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();

        //Then
        assertLogoutSuccessMessageIsDisplayed(logoutSuccessMessage);
    }

    private static void assertLogoutSuccessMessageIsDisplayed(String logoutSuccessMessage) {
        Assert.assertEquals(logoutSuccessMessage, "Account Logout");
    }
}
