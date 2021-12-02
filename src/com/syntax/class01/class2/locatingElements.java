package com.syntax.class01.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        //driver.findElement(By.id("email")).sendKeys("hussainamran@gmail.com");
        driver.findElement(By.name("email")).sendKeys("hussainamrand");
        driver.findElement(By.name("pass")).sendKeys("hsdkjfnkdf");
        //driver.findElement(By.name("login")).click();
       // driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }
}
