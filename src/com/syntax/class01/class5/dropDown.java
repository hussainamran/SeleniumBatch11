package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //find the Webelemet "drop down
        WebElement days=driver.findElement(By.cssSelector("select#select-demo"));

        // use the select class to select from drop down
        Select select=new Select(days);
        select.selectByIndex(1);

        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(7);
        Thread.sleep(2000);

        select.selectByVisibleText("Thursday");
        select.selectByValue("Wednesday");

       List<WebElement> alloptions=select.getOptions();
       int size=alloptions.size();
        System.out.println(size);

        //iterate through list all option anf get the text of each option
        for (int i = 0; i < size; i++) {
           String optionalText=alloptions.get(i).getText();
            System.out.println(optionalText);

        }
    }
}
