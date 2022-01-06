package com.syntax.class01.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        //task is to open up a newtab and a new window
        //switch to new tab and get the taxt

        WebElement newTab=driver.findElement(By.cssSelector("button#tabButton"));
        WebElement windowTab=driver.findElement(By.cssSelector("button#windowButton"));


        newTab.click();
        windowTab.click();

        // print the handle of the main page/home page / parent page
        // getwindowhandles return us the handle of current window so on sets

       String parentHandle=driver.getWindowHandle();
        System.out.println("Parent window handle "+parentHandle);

        // to switch to newtab and get the text
        // 1. get all handles

        Set<String> allhandles=driver.getWindowHandles();

        // find the desired handle i.e of newtab by iterating theough the set

        Iterator<String>iterator=allhandles.iterator();
        //iterating over each handle to see if it is deseired one
        while (iterator.hasNext()){
           String handler=iterator.next();
           driver.switchTo().window(handler);
           //now get the title and check if it desire or not
            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }

        }
        WebElement test=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(test.getText());

        // click on new window massage

        driver.switchTo().window(parentHandle);
// click on new window with massage btn
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();

        driver.quit();
    }
}
