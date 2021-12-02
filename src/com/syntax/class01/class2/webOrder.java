package com.syntax.class01.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
       WebElement usernaem=driver.findElement(By.id("ctl00_MainContent_username"));
       usernaem.sendKeys("Tester");
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    }
}
