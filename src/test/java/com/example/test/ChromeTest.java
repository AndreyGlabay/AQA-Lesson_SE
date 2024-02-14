package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest {
    String baseUrl = "https://demoqa.com/"; // (1.c) Implements new var with URL for website visiting.
    @Test (testName = "Check Chrome instance")
    public void testChrome() { // (1.a) implement annotation @Test with test method testChrome().
        WebDriver driver = new ChromeDriver(); // (1.b) implements new driver with WebDriver for Chrome.
        driver.get(baseUrl); // (1.d) implements new instance for website visiting with the driver.
        var title = driver.getTitle(); // (1.e) get Title from the website.
        Assert.assertEquals(title, "DEMOQA"); // (1.f) Assert the Title.




    }




}
