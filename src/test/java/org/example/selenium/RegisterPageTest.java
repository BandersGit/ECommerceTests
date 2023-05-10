package org.example.selenium;

import org.example.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    public void registerAccount_WhenInputValidValues_ShouldCreateAccount(){
        //Given


        //When
        RegisterPage registerPage = landingPage.followLinkToRegisterPage();
        registerPage.enterFirstName(REGISTER_NUMBER_STRING);
        registerPage.enterLastName(REGISTER_NUMBER_STRING);
        registerPage.enterEmail(REGISTER_NUMBER_STRING);
        registerPage.enterPhoneNumber(REGISTER_NUMBER_STRING);
        registerPage.enterPassword(REGISTER_NUMBER_STRING);
        registerPage.enterPasswordConfirm(REGISTER_NUMBER_STRING);
        registerPage.clickAcceptPrivacyPolicySquare();
        registerPage.clickContinueButton();

        //Then

    }
}
