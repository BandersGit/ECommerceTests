package org.example.selenium;

import org.example.pages.RegisterPage;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterPageTest extends BaseTest {

    String registerNum;

    @Test
    public void register() {
        RegisterPage registerPage = landingPage.followLinkToRegisterPage();

        registerNum = registerPage.generateRegisterNumber();
    }
}
