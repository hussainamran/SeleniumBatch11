package com.syntax.class01.reviewclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement text=driver.findElement(By.xpath("//*[@id='sampleHeading']"));
        String actualText=text.getText();
        System.out.println(actualText);

        driver.quit();
    }
}
