package com.syntax.class01.class7HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();


        WebElement followBTN=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        WebElement likeBTN=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));

        followBTN.click();
        likeBTN.click();

        Set<String>allwindowHandles=driver.getWindowHandles();
        Iterator<String>iterator=allwindowHandles.iterator();
        String followPageHandle=iterator.next();
        String likePageHandle=iterator.next();

        System.out.println("The handle for the follow on instagram page is :"+followPageHandle);
        System.out.println("The handle for the like on facebook page is :"+likePageHandle);

        driver.switchTo().window(followPageHandle);
        driver.close();
    }
}
