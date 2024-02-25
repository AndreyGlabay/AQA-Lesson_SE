package com.example.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver; // (13.1) Implement var for web driver;
    private static final String USERNAME_LOCATOR = "//*[@id=\"user-name\"]"; // (13.2) Create locator for Input UserName;
    private static final String PASSWORD_LOCATOR = "//*[@id=\"password\"]"; // (13.2) Create locator for Input Password;
    private static final String BUTTON_LOCATOR = "//*[@id=\"login-button\"]"; // (13.2) Create locator for Login button;
    private static final String MESSAGE_LOCATOR = "//h3[@data-test=\"error\"]"; // (13.2) Add locator for the Error msg;

    public LoginPage(WebDriver driver) { // (13.3) Create method LoginPage(WebDriver driver)
        this.driver = driver;
        userName = driver.findElement(By.xpath(USERNAME_LOCATOR)); // (13.4) Find web elements using locators.
        password = driver.findElement(By.xpath(PASSWORD_LOCATOR));
        button = driver.findElement(By.xpath(BUTTON_LOCATOR));
        message = driver.findElement(By.xpath(MESSAGE_LOCATOR));
    }

    private WebElement userName;
    private WebElement password;
    private WebElement button;
    private WebElement message;
}
