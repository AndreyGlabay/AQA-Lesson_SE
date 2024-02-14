package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FireFoxTest { // (3) Create a separate test class and move testFireFox() to it.
    String baseUrl = "https://demoqa.com/"; // (1.c) Implements new var with URL for website visiting.
    WebDriver driver; // (4) Move driver to the var.

    @BeforeTest
    public void driverOpening(){ // (4.a) Move driver opening to the @BeforeTest
        driver = new FirefoxDriver(); // (1.b) implements new driver with WebDriver for Chrome.
    }

    @AfterTest
    public void driverClosing() { // (4.b) Move driver closing to the @AfterTest
        driver.close();
    }

    @Test(testName = "Check FireFox instance")
    public void testFireFox() { // (1.a) implement annotation @Test with test method testFireFox().
        driver.get(baseUrl); // (2.b) implements new instance for website visiting with the driver.
        var title = driver.getTitle(); // (2.c) get Title from the website.
        Assert.assertEquals(title, "DEMOQA"); // (2.d) Assert the Title.
    }
}
