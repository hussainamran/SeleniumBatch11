package com.syntax.class01.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        // test
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        WebElement CreateNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        CreateNewAccount.click();
    }
}
