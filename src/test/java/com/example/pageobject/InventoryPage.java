package com.example.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// (20) Copy and rename new test class: LoginPage.java -> InventoryPage.java
// (20.0) Remove all unnecessary;
// (20.1) Create locator for Inventory items;
// (21.4) Create locator for images.

public class InventoryPage {
    private WebDriver driver;
    private static final String INVENTORY_ITEMS_LOCATOR = "//div[@id='inventory_container']//div[@class='inventory_item']";
    private static final String INVENTORY_IMAGES_LOCATOR = "//div[@class='inventory_item']//img[@class='inventory_item_img']";

    private List<WebElement> inventoryItems; // (20.2) Implements the list of Inventory items.
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        inventoryItems = driver.findElements(By.xpath(INVENTORY_ITEMS_LOCATOR)); // (20.3) Get items by locator.
    }

    public int getNumberOfInventoryItems() { // (20.4) Create the method.
        return inventoryItems.size(); // (20.5) get inventory items qty.
    }

    public List<String> getImageUrl() {

    }
}
