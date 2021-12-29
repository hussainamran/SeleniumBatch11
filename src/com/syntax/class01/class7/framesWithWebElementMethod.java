package com.syntax.class01.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesWithWebElementMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //switch to the desired frame using webElement

        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        //switch to default
        driver.switchTo().defaultContent();

        // switching to the frame using index
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.cssSelector("h1#sampleHeading")).getText());

    }
}
