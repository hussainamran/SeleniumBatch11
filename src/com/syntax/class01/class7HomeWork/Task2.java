package com.syntax.class01.class7HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        WebElement chiltFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(chiltFrame);

        WebElement text=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        //getting the text from the child iframe
        System.out.println("The text from the child frame is :"+text.getText());
        driver.close();

    }
}
