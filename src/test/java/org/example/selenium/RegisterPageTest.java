package org.example.selenium;

import org.example.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    public void register() {
        RegisterPage registerPage = landingPage.followLinkToRegisterPage();
    }
}
