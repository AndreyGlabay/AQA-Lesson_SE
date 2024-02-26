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

    public LoginPage(WebDriver driver) { // (13.3) Create an object using method LoginPage(WebDriver driver)
        this.driver = driver;
        userNameField = driver.findElement(By.xpath(USERNAME_LOCATOR)); // (13.4) Put elements to the obj using locators.
        passwordField = driver.findElement(By.xpath(PASSWORD_LOCATOR));
        button = driver.findElement(By.xpath(BUTTON_LOCATOR));
        message = driver.findElement(By.xpath(MESSAGE_LOCATOR));
    }

    private WebElement userNameField; // (13.5) Create WebElements for the UserName input;
    private WebElement passwordField; // (13.5) Create WebElements for the Password input;
    private WebElement button; // (13.5) Create WebElements for the Login button;
    private WebElement message; // (13.5) Create WebElements for the Error message;

    public void login(String username, String password) {
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        button.click();
    }
}
