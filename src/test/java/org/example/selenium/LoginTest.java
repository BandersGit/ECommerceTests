package org.example.selenium;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @QaseTitle("Login Test with valid account details should Login")
    public void login_whenInputValidAccountDetails_shouldLogin(){
        //Given
        String email = "a@b.cd";
        String password = "abcd";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        MyAccountPage myAccountPage = loginPage.clickLoginButton();

        String expectedTitle = myAccountPage.getTitle();

        //Then
        assertPageTitleEqualsExpectedTitle(expectedTitle);
    }

    @Step("Verify Login successful by asserting Page Title matches expected Title {expectedTitle}")
    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, "My Account");
    }
}
