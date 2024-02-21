package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeNewTest {                            // (step 8) Create new test class;
    WebDriver driver;                                   // (step 8.0) Declare var for WebDriver;
    String urlRozetka = "https://rozetka.com.ua/";      // (step 8.0) Initiate var for URL;
    String pathRozetksHome = "ua/";                     // (step 8.0) Initiate var for Path;
    String homePage = urlRozetka + pathRozetksHome;     // (step 8.0) Initiate var for EP;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();                    // (step 8.1) Implements Chrome instance opening;
    }

    @AfterTest
    public void afterTest() {
        driver.close();                                 // (step 8.2) Implements Chrome instance closing;
    }

    @Test
    public void findElementSet1() {
        driver.get(homePage);                           // (step 8.3) Implements Web Page getting;
    }
}
