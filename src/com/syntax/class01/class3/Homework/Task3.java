package com.syntax.class01.class3.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*
        task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement Fname=driver.findElement(By.cssSelector("input[name *='first_name']"));
        Fname.sendKeys("Amran");
        WebElement Lname=driver.findElement(By.cssSelector("input[name *='last_name']"));
        Lname.sendKeys("Handjnd");
        WebElement email=driver.findElement(By.cssSelector("input[name *='email']"));
        email.sendKeys("huansdnk@gmail.com");
        WebElement pNumber=driver.findElement(By.cssSelector("input[name *='phone']"));
        pNumber.sendKeys("123-121-1232");
        WebElement address=driver.findElement(By.cssSelector("input[name *='address']"));
        address.sendKeys("2342 Hillside Rd");
        WebElement city=driver.findElement(By.cssSelector("input[name *='city']"));
        city.sendKeys("Alexandria");
        WebElement state=driver.findElement(By.cssSelector("select[name *='state']"));
        state.sendKeys("Virginia");
        WebElement zip=driver.findElement(By.cssSelector("input[name *='zip']"));
        zip.sendKeys("22342");
        WebElement web=driver.findElement(By.cssSelector("input[name *='website']"));
        web.sendKeys("syntax");
        Thread.sleep(2000);
        driver.close();



    }
}
