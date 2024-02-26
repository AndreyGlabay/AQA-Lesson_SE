package com.example.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// (20) Copy and rename new test class: LoginPage.java -> InventoryPage.java
// (20.0) Remove all unnecessary;
// (20.1) Create locator for Inventory items;

public class InventoryPage {
    private WebDriver driver;
    private static final String INVENTORY_ITEMS_LOCATOR = "//*[@id='inventory_container']//div[@class='inventory_item]";
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
}
