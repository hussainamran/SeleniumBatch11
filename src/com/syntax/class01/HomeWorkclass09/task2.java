package com.syntax.class01.HomeWorkclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class task2 {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

    public static void main(String[] args) {
        /*
        and delete all the eneteries which have product mymoney and lives in us state
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for (int i = 0; i < rows.size(); i++) {
            String text=rows.get(i).getText();
            if(text.contains("MyMoney")&&text.contains("US")){
                List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkbox.get(i-1).click();
            }
        }
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']")).click();
        driver.quit();
    }
}