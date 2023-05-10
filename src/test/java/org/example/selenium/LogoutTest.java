package org.example.selenium;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.LogOutSuccessPage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    @QaseTitle("Logout test should Logout when logged in")
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

    @Step("Assert Displayed message is the equals expected message")
    private static void assertLogoutSuccessTextIsDisplayed(String logoutSuccessText) {
        Assert.assertEquals(logoutSuccessText, "Account Logout");
    }
}
