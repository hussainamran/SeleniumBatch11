package com.syntax.class01.reviewclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
       WebElement checkBox= driver.findElement(By.xpath("//input[@value='Option-1']"));

        if(checkBox.isSelected()){
            System.out.println("It is already selected");
        }else {
            checkBox.click();
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
