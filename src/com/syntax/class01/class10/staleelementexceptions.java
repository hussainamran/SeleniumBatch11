package com.syntax.class01.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleelementexceptions {

    public static String url="https://chercher.tech/practice/stale-element";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        // find the refresh btn

        WebElement refeshBtn=driver.findElement(By.cssSelector("button#refresh-button"));


        //wait for 11 second and then click on btn
        Thread.sleep(11000);
//in order to handle exception locate it again
        refeshBtn=driver.findElement(By.cssSelector("button#refresh-button"));
        //click on it
        refeshBtn.click();

    }

}
