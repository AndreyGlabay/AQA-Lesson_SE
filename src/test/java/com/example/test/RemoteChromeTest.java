package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeTest { // (6.a) Copy test class ChromeTest and rename it to RemoteChromeTest
    String baseUrl = "https://demoqa.com/";

    // *** In this task, we use local PC for demo - localhost; IRL we're gonna to use predefined PC with Grid on it;
    String gridUrl = "http://localhost:6789"; // (6.b) Initiate gridUrl var with HTTP + localhost + port num;
    WebDriver driver;
    ChromeOptions options = new ChromeOptions(); // (6.c) Initiate options var with ChromeOptions();

    @BeforeTest
    public void driverOpening() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL(gridUrl), options); // (6.d) Modify driver opening with RemoteWebDriver();

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
        driver.get(baseUrl + "text-box"); // (7.a) Get Endpoint "https://demoqa.com/text-box";
        var text = driver.findElement(By.className("col-12 mt-4 col-md-6")).getText();//(7.b)Get element with class name;
        Assert.assertTrue(text.startsWith("Text Box")); // Assert that in the class there is the text "Text Box";
    }
}
