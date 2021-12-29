package com.syntax.class01.class3.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ajgfjd");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement elelment=driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        System.out.println( elelment.getText());
        Thread.sleep(2000);
        driver.close();
    }
}
