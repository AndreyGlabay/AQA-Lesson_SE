package com.example.test;

import com.example.pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        var loginPage = new LoginPage(driver); // (14.1) Arrange login flow using LoginPage Object.
        loginPage.login("standard_user", "secret_sauce"); // (14.1) Arrange login using LoginPage obj.
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().endsWith("inventory.html")); // (17.1) Assert URL after success login;
    }

    @Test
    public void UnSuccessLoginLockedUser() { // (16.1) Create new test method UnSuccessLoginLockedUser()
        var login = "standard_user";
        var password = "secret_sauce";
        driver.get(baseUrl);
        var loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce"); // (16.2) check login for the locked user.
        loginPage.checkMessage("this user has been locked out");   // (16.3) check the error message content.
        System.out.println(driver.getCurrentUrl());
    }
}
