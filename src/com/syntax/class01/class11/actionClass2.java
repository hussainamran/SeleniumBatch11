package com.syntax.class01.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class actionClass2 {
    public static String url = "http://amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //moving the curser to the particular element using action class
     // find the element
        WebElement acountandList=driver.findElement(By.cssSelector("a#nav-link-accountList"));
        Actions action=new Actions(driver);
        action.moveToElement(acountandList).perform();

        //taking screen shot of the page
        TakesScreenshot ts1=(TakesScreenshot) driver;
        File sourceFile =ts1.getScreenshotAs(OutputType.FILE);


        try{
            FileUtils.copyFile(sourceFile,new File("screenshot/amazon/adminlogi.png"));

            //copy the screen shot to a new directory inside the project and give the path that particular screenshot
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

