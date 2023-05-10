package org.example.selenium;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    @QaseTitle("Register account with valid values")
    public void registerAccount_WhenInputValidValues_ShouldCreateAccount(){
        //Given
        String email = REGISTER_NUMBER_STRING + "@gmail.com";

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

        String expectedTitle = registerPage.getTitle();

        //Then
        assertPageTitleEqualsExpectedTitle(expectedTitle);
    }

    @Step("Assert Page Title is same as expected Title")
    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle, "Your Account Has Been Created!");
    }
}
