package org.example.selenium;

import org.example.pages.LoginPage;
import org.example.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    //test follow link to Register Page
    @Test
    public void register() {
        RegisterPage registerPage = landingPage.followLinkToRegisterPage();
    }
}
