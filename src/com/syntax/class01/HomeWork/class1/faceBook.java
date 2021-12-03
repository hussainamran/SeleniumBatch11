package com.syntax.class01.HomeWork.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Year;

public class faceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement Fname = driver.findElement(By.name("firstname"));
        Fname.sendKeys("Tom");
        Thread.sleep(2000);
        WebElement Lname = driver.findElement(By.name("lastname"));
        Lname.sendKeys("Will");
        Thread.sleep(2000);
        WebElement Email = driver.findElement(By.name("reg_email__"));
        Email.sendKeys("tomwill12@gmil.com");
        Thread.sleep(2000);
        WebElement Emaincon = driver.findElement(By.name("reg_email_confirmation__"));
        Emaincon.sendKeys("tomwill12@gmil.com");
        Thread.sleep(2000);
        WebElement Pass = driver.findElement(By.name("reg_passwd__"));
        Pass.sendKeys("HAyajdjf12");
        Thread.sleep(2000);
        WebElement Month = driver.findElement(By.id("month"));
        Month.sendKeys("June");
        Thread.sleep(2000);
        WebElement Day = driver.findElement(By.id("day"));
        Day.sendKeys("12");
        Thread.sleep(2000);
        WebElement Year = driver.findElement(By.id("year"));
        Year.sendKeys("1991");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        driver.close();


    }
}
