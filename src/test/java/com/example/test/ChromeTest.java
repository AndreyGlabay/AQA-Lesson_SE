package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest {
    String baseUrl = "https://demoqa.com/"; // (1.c) Implements new var with URL for website visiting.
    @Test
    public void testChrome() { // (1.a) implement annotation @Test with test method testChrome().
        WebDriver driver = new ChromeDriver(); // (1.b) implements new driver with WebDriver.
        driver.get(baseUrl); // (1.d) implements website visiting with the driver.
        var title = driver.getTitle(); // (1.e) implements var for put website title to it.
        Assert.assertEquals(title, "DEMOQA"); // (1.f) Assert the website title.


    }
}
