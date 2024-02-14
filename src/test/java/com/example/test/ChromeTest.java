package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
    String baseUrl = "https://demoqa.com/";
    @Test
    public void testChrome() {
        WebDriver driver = new ChromeDriver();

    }
}
