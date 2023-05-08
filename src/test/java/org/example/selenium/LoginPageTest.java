package org.example.selenium;

import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    //test follow link to Login Page
    @Test
     public void login() {
        LoginPage loginPage = landingPage.followLinkToLoginPage();
    }
}
