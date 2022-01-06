package com.syntax.class01.reviewclass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement radioBtn=driver.findElement(By.xpath("(//*[@value='Male'])[2]"));
        System.out.println(radioBtn.isDisplayed());

        if(radioBtn.isDisplayed()){
            radioBtn.click();
        }
        driver.quit();
    }
}
