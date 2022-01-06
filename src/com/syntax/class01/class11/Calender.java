package com.syntax.class01.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //code to login
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //clicking on leave button
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        //*************************Dealing with calenders*****************************************

        //open the calender
        driver.findElement(By.cssSelector("input#calFromDate")).click();

        //select month
        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));

        //use select class
        Select select = new Select(month);
        select.selectByVisibleText("Aug");

        //selcct the year

        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        //using select class
        Select select1 = new Select(year);
        select1.selectByValue("2022");

        //selecting a particular data from table
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        // iterate through the dates
        for (WebElement date : dates) {
            String datetext = date.getText();
            if (datetext.equalsIgnoreCase("15")) {
                date.click();
            }

        }
    }
}