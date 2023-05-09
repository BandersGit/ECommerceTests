package org.example.selenium;

import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void login_whenInputValidAccountDetails_shouldLogin(){
        //Given
        String email = "aName";
        String password = "aPassword";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

    }
}
