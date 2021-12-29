package com.syntax.class01.class3.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        task1:(use xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement span=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        System.out.println(span.getText());
        Thread.sleep(Long.parseLong("2000"));
        driver.close();
    }
}
