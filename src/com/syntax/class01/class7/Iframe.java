package com.syntax.class01.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        // switch to the desired frame
        driver.switchTo().frame("frame1");


        // getting the webelement
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The tsxt is :"+text1.getText());

        // as frame 2 doesnt lie inside frame 1 so inorder to get there we need to switch our focus to the default page
        driver.switchTo().defaultContent();

        // switch to the desired frame 2
        driver.switchTo().frame("frame2");

        //locate the webelement
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The tsxt is :"+text2.getText());

        //in order to click on webElement "from"
        //switch the fcous back to the default

        driver.switchTo().defaultContent();
        // i can simply locate elememt as it is inside the frame and perform operation on it



    }
}
