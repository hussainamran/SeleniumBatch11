package com.syntax.class01.reviewclass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        WebElement alertBtn= driver.findElement(By.cssSelector("button#alert"));
        alertBtn.click();

       Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        driver.quit();

    }
}
