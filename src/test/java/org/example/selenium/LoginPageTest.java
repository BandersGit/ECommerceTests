package org.example.selenium;

import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    //test follow link to Login Page
    @Test
     public void login() {
        LoginPage loginPage = landingPage.followLinkToLoginPage();
    }

    @Test
    public void login_whenInputValidAccountDetails_shouldLogin(){
        //Given
        String emailAddress = "aName";
        String password = "aPassword";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmailAddress(emailAddress);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

    }
}
