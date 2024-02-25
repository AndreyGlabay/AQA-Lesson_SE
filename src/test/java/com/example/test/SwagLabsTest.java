package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsTest {
    private static WebDriver driver; // (11) Implement var for web driver;
    public static final String baseUrl = "https://www.saucedemo.com/v1/"; // (11.3) Implement var for base URL;

    @BeforeTest // (11.1) Arrange start of web browser;
    public void startBrowser() {
        driver = new ChromeDriver();
    }

    @AfterTest // (11.2) Arrange stop of web browser;
    public void stopBrowser() {
        driver.close();
    }

    @Test
    public void SuccessLoginStandardUser() {
        var login = "standard_user"; // (12.1) Implements var login with valid login.
        var password = "secret_sauce"; // (12.2) Implements var password with valid password.
        driver.get(baseUrl); // (11.4) Implement open web page GET URL using web driver;
    }
}
