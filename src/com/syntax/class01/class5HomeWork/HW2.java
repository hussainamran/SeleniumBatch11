package com.syntax.class01.class5HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        /*//
        HW 2
        HRMS Application Negative Login:
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
        WebElement userNameField=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userNameField.sendKeys("Admin");
        WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginbtn.click();
        WebElement text=driver.findElement(By.xpath("//span[@id='spanMessage']"));

        //verify error massage with text "Password cannot be empty"
        System.out.println(text.isDisplayed());
        driver.close();

    }
}
