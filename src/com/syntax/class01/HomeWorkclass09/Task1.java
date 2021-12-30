package com.syntax.class01.HomeWorkclass09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task1 {
        public static String url="https://chercher.tech/practice/explicit-wait";
    public static void main(String[] args) {
        /*
        1.click on open an alert after 5 sec and then using explicit wait manage that alert
        2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed()
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        driver.findElement(By.xpath("//button[@id='alert']")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simalert=driver.switchTo().alert();
        simalert.accept();

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        //wait.until(ExpectedConditions.)




    }
}
