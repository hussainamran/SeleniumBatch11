package com.syntax.class01.testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    /*
    this method will navigate to a website given the url
    @param url
     */

    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}