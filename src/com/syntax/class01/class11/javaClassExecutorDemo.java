package com.syntax.class01.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class javaClassExecutorDemo {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        //create an instance of JS Executor
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.border='2px solid red'",username);

        js.executeScript("arguments[0].style.background='yellow'",password);

        //locate the element login button
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        //loginBtn.click();

        js.executeScript("arguments[0].click()",loginBtn);

        
    }
}