package com.syntax.class01.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class uplodeFile {
    public static String url = "https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //locate the choose file button
        WebElement choosefile = driver.findElement(By.cssSelector("input#file-upload"));
//        in order to upload th file
        choosefile.sendKeys("C:\\Users\\Amran\\Desktop\\imgres.html\\");
//        locate the submit and click upload
        driver.findElement(By.cssSelector("input#file-submit")).click();
    }
}