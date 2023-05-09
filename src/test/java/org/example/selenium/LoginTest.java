package org.example.selenium;

import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
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

    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, "My Account");
    }
}
