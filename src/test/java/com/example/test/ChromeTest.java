package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {
    String baseUrl = "https://demoqa.com/"; // (1.c) Implements new var with URL for website visiting.
    WebDriver driver; // (4) Move driver to the var.

    @BeforeTest
    public void driverOpening(){ // (4.a) Move driver opening to the @BeforeTest
        driver = new ChromeDriver(); // (1.b) implements new driver with WebDriver for Chrome.
    }

    @AfterTest
    public void driverClosing() { // (4.b) Move driver closing to the @AfterTest
        driver.close();
    }

    @Test (testName = "Check Chrome instance")
    public void testChrome() { // (1.a) implement annotation @Test with test method testChrome().
        driver.get(baseUrl); // (1.d) implements new instance for website visiting with the driver.
        var title = driver.getTitle(); // (1.e) get Title from the website.
        Assert.assertEquals(title, "DEMOQA"); // (1.f) Assert the Title.
    }
}
