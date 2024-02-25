package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SwagLabsTest {
    private static WebDriver driver;
    @BeforeTest // (11.1) Arrange start of web browser;
    public void startBrowser() {
        driver = new ChromeDriver();
    }

    @AfterTest // (11.2) Arrange stop of web browser;
    public void stopBrowser() {
        driver.close();
    }
}
