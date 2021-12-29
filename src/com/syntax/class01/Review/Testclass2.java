package com.syntax.class01.Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println(" browser launched");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

    }
}
