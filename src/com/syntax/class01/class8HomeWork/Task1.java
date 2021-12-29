package com.syntax.class01.class8HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto http://syntaxprojects.com/window-popup-modal-demo.php
        click on follow on instagram
        get the title and of new window and print it on the console
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement instagram = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        instagram.click();

        Set<String> allwindowhandles = driver.getWindowHandles();
        Iterator<String> iterator = allwindowhandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            driver.switchTo().window(handle);
            if (handle.contains("Instagram")) {
            }
        }
        System.out.println("The title of the new window is "+driver.getTitle());
           // driver.quit();
        }
    }
