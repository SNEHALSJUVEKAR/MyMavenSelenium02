package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGoogleTitle() {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Get title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Assertion
        assertTrue(title.contains("Google"));

        // Close browser
        driver.quit();
    }
}
