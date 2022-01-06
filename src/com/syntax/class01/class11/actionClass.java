package com.syntax.class01.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //first check how many iframe we have switch to the iframe
        driver.switchTo().frame(0);
        //locate the draggable
        WebElement dragable=driver.findElement(By.cssSelector("div#draggable"));
        //locate the dropoff location
        WebElement dropoff=driver.findElement(By.cssSelector("div#droppable"));

        Actions actions=new Actions(driver);
        //drag the source to drop off
        //actions.dragAndDrop(dragable,dropoff).perform();

        //when ever in selenium we use morethen one the we have to use build
        actions.clickAndHold(dragable).moveToElement(dropoff).release().build().perform();

    }
}