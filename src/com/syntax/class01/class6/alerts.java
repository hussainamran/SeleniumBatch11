package com.syntax.class01.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to syntax checkbox demo and check the first checkbox
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //enable the alert
        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);
        //switch the focus of selenium
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        // handling confirmation alert
        // enabling the confirmation alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        //switch the focus
        Alert conformationAlert = driver.switchTo().alert();
        //get the text from this alert
        System.out.println(conformationAlert.getText());

        //cancel the alert
        conformationAlert.dismiss();

        Thread.sleep(2000);
        // prompt alert enable
        driver.findElement(By.cssSelector("button#prompt")).click();
        //switch the focus
        Alert promptAleart = driver.switchTo().alert();
        promptAleart.sendKeys("Hello we need to sleep");
        //accept
        promptAleart.accept();
        driver.close();
    }
}