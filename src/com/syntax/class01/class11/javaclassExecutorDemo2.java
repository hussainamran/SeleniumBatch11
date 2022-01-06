package com.syntax.class01.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class javaclassExecutorDemo2 {
    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //scrool down

        js.executeScript("window.scrollBy(0,4000)");

        //wait
        Thread.sleep(2000);

        //scrool up
        js.executeScript("window.scrollBy(0,-4000)");

        //scroll till the element is in view
        WebElement backtoTop=driver.findElement(By.cssSelector("span.navFooterBackToTopText"));
        js.executeScript("arguments[0].scrollIntoView(true)",backtoTop);

        js.executeScript("arguments[0].click()",backtoTop);
    }
}