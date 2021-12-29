package com.syntax.class01.class5HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW4 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Go to ebay.com
        get all the categories and print them in the console
        select Computers/Tables & Networking
        click on search
        verify the title of page
         *///
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement selectDD=driver.findElement(By.xpath("//select[@id='gh-cat']"));
        selectDD.click();
        System.out.println(selectDD.getText());
        Select select=new Select(selectDD);
        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        System.out.println("The title of the page is :"+driver.getTitle());
        driver.close();
        }
    }

