package org.example.selenium;

import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

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
        loginPage.clickLoginButton();

        String expectedTitle = driver.getTitle();

        //Then
        assertPageTitleEqualsExpectedTitle(expectedTitle);
    }

    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, "My Account");
    }


}
