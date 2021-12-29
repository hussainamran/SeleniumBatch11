package com.syntax.class01.class5HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement fnameText=driver.findElement(By.xpath("//input[@name='firstname']"));
        fnameText.sendKeys("Amran");
        WebElement lnameText=driver.findElement(By.xpath("//input[@name='lastname']"));
        lnameText.sendKeys("Haysbd");
        WebElement emailText=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailText.sendKeys("hscjs1232@gamil.com");
        WebElement confemailText=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        confemailText.sendKeys("hscjs1232@gamil.com");
        WebElement passText=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passText.sendKeys("hscjs1232@");
        WebElement monthText=driver.findElement(By.xpath("//select[@id='month']"));
        monthText.sendKeys("Jan");
        WebElement dayText=driver.findElement(By.xpath("//select[@id='day']"));
        dayText.sendKeys("23");
        WebElement yearText=driver.findElement(By.xpath("//select[@id='year']"));
        yearText.sendKeys("1991");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(200);
        driver.close();
    }
}
