package com.syntax.class01.HomeWork.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement TexBox = driver.findElement(By.id("customer.firstName"));
        TexBox.sendKeys("John");
        WebElement TB = driver.findElement(By.id("customer.lastName"));
        TB.sendKeys("Smith");
        WebElement TB1 = driver.findElement(By.id("customer.address.street"));
        TB1.sendKeys("2345 Hlooand RD");
        WebElement TB2 = driver.findElement(By.id("customer.address.city"));
        TB2.sendKeys("Alexandria");
        WebElement TB3 = driver.findElement(By.id("customer.address.state"));
        TB3.sendKeys("VA");
        WebElement TB4 = driver.findElement(By.id("customer.address.zipCode"));
        TB4.sendKeys("34564");
        WebElement TB5 = driver.findElement(By.id("customer.phoneNumber"));
        TB5.sendKeys("240-586-4747");
        WebElement TB6 = driver.findElement(By.id("customer.ssn"));
        TB6.sendKeys("234-34-2343");
        WebElement TB7 = driver.findElement(By.id("customer.username"));
        TB7.sendKeys("johnsmith");
        WebElement TB8 = driver.findElement(By.id("customer.password"));
        TB8.sendKeys("Parart2#2");
        WebElement TB9 = driver.findElement(By.id("repeatedPassword"));
        TB9.sendKeys("Parart2#2");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}