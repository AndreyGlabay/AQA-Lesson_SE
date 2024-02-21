package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ChromeNewTest {                            // (step 8) Create new test class;
    WebDriver driver;                                   // (step 8.0) Declare var for WebDriver;
    String urlDemoqa = "https://demoqa.com/";           // (step 8.0) Initiate var for URL;
    String pathElements = "elements";                   // (step 8.0) Initiate var for Path;
    String pathForms = "automation-practice-form";      // (step 9.2) Initiate var for Path;
    String pageElements = urlDemoqa + pathElements;     // (step 8.0) Initiate var for EP;
    String pageForms = urlDemoqa + pathForms;           // (step 9.2) Initiate var for EP;


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
        driver.get(pageElements);                        // (step 8.3) Implements Web Page getting;
        WebElement element = driver.findElement(By.className("left-pannel"));
        List<WebElement> elements = driver.findElements(By.className("left-pannel"));

        WebElement elem0 = driver.findElement(By.cssSelector("#left-pannel .element-group .group-header " +
                ".header-wrapper .header-text"));
        WebElement elem1 = driver.findElement(By.id("left-pannel"));
        WebElement elem2 = driver.findElement(By.name("left-pannel"));
        WebElement elem3 = driver.findElement(By.linkText("Elements"));
        WebElement elem4 = driver.findElement(By.partialLinkText("click"));

        WebElement olink = driver.findElement(By.tagName("a"));
        List<WebElement> Elements  = driver.findElements(By.tagName("li"));
        System.out.println("xxx");
    }

    @Test
    public void testForm1() {  // (9) Implements test method for check Form
        final var FIRST_NAME_LOCATOR = "//*[@id=\"firstName\"]"; // (9.1) Implements Locator for the FirstName input;
        final var LAST_NAME_LOCATOR = "//*[@id=\"lastName\"]";   // (9.1) Implements Locator for the LastName input;

        driver.get(pageForms); // (9.3) Get new instance of web page with forms
        var firstName = driver.findElement(By.xpath(FIRST_NAME_LOCATOR)); // (9.4) Find an element using Locator;
        firstName.sendKeys("John"); // (9.5) Insert value to this element;
        System.out.println("x");

    }
}
