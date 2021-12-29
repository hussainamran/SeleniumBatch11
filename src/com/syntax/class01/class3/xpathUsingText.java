package com.syntax.class01.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement alert=driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alert.click();
        Thread.sleep(2000);

    }
}
