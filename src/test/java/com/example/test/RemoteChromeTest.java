package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RemoteChromeTest { // (6.a) Copy test class ChromeTest and rename it to RemoteChromeTest
    String baseUrl = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void driverOpening(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void driverClosing() { // (4.b) Move driver closing to the @AfterTest
        driver.close();
    }

    @Test (testName = "Check Chrome instance")
    public void testChrome() {
        driver.get(baseUrl);
        var title = driver.getTitle();
        Assert.assertEquals(title, "DEMOQA");
    }
}
