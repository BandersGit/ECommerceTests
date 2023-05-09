package org.example.selenium;

import org.example.pages.RegisterPage;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterPageTest extends BaseTest {

    Random rand = new Random();
    int newUserNum;
    //test follow link to Register Page
    @Test
    public void register() {
        RegisterPage registerPage = landingPage.followLinkToRegisterPage();

        newUserNum = rand.nextInt();
    }
}
