package org.example.selenium;

import org.example.pages.LogOutSuccessPage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logout_whenLoggedIn_shouldLogout() {
        //Given
        String email = "a@b.cd";
        String password = "abcd";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        LogOutSuccessPage logOutSuccessPage = loginPage.logout();

        String logoutSuccessText = logOutSuccessPage.getLogoutSuccessText();

        //Then
        assertLogoutSuccessTextIsDisplayed(logoutSuccessText);
    }

    private static void assertLogoutSuccessTextIsDisplayed(String logoutSuccessText) {
        Assert.assertEquals(logoutSuccessText, "Account Logout");
    }
}
