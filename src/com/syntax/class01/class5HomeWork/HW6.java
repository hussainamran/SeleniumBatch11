package com.syntax.class01.class5HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.linkText("//a[text()='All Examples']")).click();
        Thread.sleep(2000);
        WebElement alert=driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alert.click();
        Thread.sleep(2000);
        WebElement boostAlert=driver.findElement(By.xpath("//a[text()='Bootstrap Alerts']"));
        boostAlert.click();
        driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']")).click();
        //Alert autoAlert=driver.switchTo().alert();
        //autoAlert.accept();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[@id='normal-btn-success']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//button[@type='button']")).click();
        Thread.sleep(2000);
    }
}
