package com.syntax.class01.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        // declearing a imlpicit wait for finding elements

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

       WebElement getUser= driver.findElement(By.cssSelector("button#save"));
       getUser.click();

       WebElement fname=driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(fname.getText());
    }
}
