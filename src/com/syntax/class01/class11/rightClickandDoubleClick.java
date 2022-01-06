package com.syntax.class01.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class rightClickandDoubleClick {
    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions=new Actions(driver);
       // actions.contextClick(rightClick).perform();
// locate double click

        WebElement doubleclick=driver.findElement((By.xpath("//button[text()='Double-Click Me To See Alert']")));
        actions.doubleClick().perform();
        Thread.sleep(5000);
    }
}