package com.syntax.class01.reviewclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class class6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#enableAfter")));

        WebElement button=driver.findElement(By.cssSelector("button#enableAfter"));
        System.out.println(button.isEnabled());

        driver.quit();
    }
}
