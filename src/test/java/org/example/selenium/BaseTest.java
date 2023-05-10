package org.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.Random;

public class BaseTest {

    protected WebDriver driver;
    private final static String baseUrl = "https://ecommerce-playground.lambdatest.io/";
    protected static LandingPage landingPage;
    protected static String REGISTER_NUMBER_STRING = generateRegisterNumberString();

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
    }

    public static String generateRegisterNumberString(){
        int registerNumber = new Random().nextInt();
        return Integer.toString(Math.abs(registerNumber));
    }

    @BeforeMethod
    public void init(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        landingPage = new LandingPage();
        landingPage.setDriver(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
