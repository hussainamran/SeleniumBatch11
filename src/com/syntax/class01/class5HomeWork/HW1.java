package com.syntax.class01.class5HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        /*
        HW1: Amazon link count:
        Open chrome browser
        Go to “https://www.amazon.com/”
        Get all links
        Get number of links that has text
        Print to console only the links that has text
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println( "Get all the links "+links.size());
        for(WebElement link:links){
            String linkText=link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText);
                driver.close();
            }
        }
    }
}
