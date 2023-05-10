package org.example.selenium;

import io.qase.api.annotation.Step;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageLinkTest extends BaseTest{

    @Test
    public void goToLandingPage_whenAtLoginPage_shouldGoToLandingPage(){
        //Given
        String email = "a@b.cd";
        String password = "abcd";

        //When
        LoginPage loginPage = landingPage.followLinkToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        landingPage.goToLandingPage();

        String expectedTitle = landingPage.getTitle();

        //Then
        assertPageTitleEqualsExpectedTitle(expectedTitle);
    }

    @Step("Assert Page Title is same as expected Title")
    private static void assertPageTitleEqualsExpectedTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle, "Your Store");
    }
}
