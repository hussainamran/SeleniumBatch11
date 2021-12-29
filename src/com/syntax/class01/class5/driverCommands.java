package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        driver.manage().window().maximize();

        //get all the links that are there on ebay.com
        // as we have multiple with tag name "a" so we use driver.findelement
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The size of list containing links is :" + links.size());
        for (WebElement link : links) {
            String linkText = link.getText();
            // only print the links that have some text and ignore the rest
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
                // print all the links also with the text use the method .getattribute to have the value of
               String linkAddress =link.getAttribute("href");
                System.out.println(linkAddress);
            }
        }
    }
}