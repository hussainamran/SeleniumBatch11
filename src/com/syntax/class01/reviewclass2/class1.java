package com.syntax.class01.reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class class1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        driver.manage().window().maximize();

        WebElement Fname=driver.findElement(By.xpath("//input[@name='firstName']"));
        Fname.clear();
        Fname.sendKeys("Amran");

        WebElement Lname=driver.findElement(By.xpath("//input[@name='lastName']"));
        Lname.clear();
        Lname.sendKeys("HAmdbj");

        WebElement Phone=driver.findElement(By.xpath("//input[@name='phone']"));
        Phone.clear();
        Phone.sendKeys("234-434-2334");

        WebElement Email=driver.findElement(By.cssSelector("input[name='userName']"));
        Email.clear();
        Email.sendKeys("hudfji@gamil.com");

        WebElement Address=driver.findElement(By.cssSelector("input[name='address1']"));
        Address.clear();
        Address.sendKeys("6523 hallis Rd");

        WebElement City=driver.findElement(By.cssSelector("input[name='city']"));
        City.clear();
        City.sendKeys("Alexandria");

        WebElement State=driver.findElement(By.cssSelector("input[name='state']"));
        State.clear();
        State.sendKeys("VA");

        WebElement PostalCode=driver.findElement(By.cssSelector("input[name='postalCode']"));
        PostalCode.clear();
        PostalCode.sendKeys("23454");

        WebElement country=driver.findElement(By.cssSelector("select[name='country']"));

        Select s=new Select(country);
        s.selectByVisibleText("ANDORRA");

        WebElement Username=driver.findElement(By.cssSelector("input[name='email']"));
        Username.clear();
        Username.sendKeys("hudfji@gamil.com");

        WebElement Password=driver.findElement(By.cssSelector("input[name='password']"));
        Password.clear();
        Password.sendKeys("Ahya12&");

        WebElement ConPassword=driver.findElement(By.cssSelector("input[name='confirmPassword']"));
        ConPassword.clear();
        ConPassword.sendKeys("Ahya12&");

        driver.findElement(By.cssSelector("input[name='submit']")).click();

        WebElement notificationMasssge=driver.findElement(By.cssSelector("td p:nth-child(2) font"));//advance css
        notificationMasssge.getText();
        System.out.println(notificationMasssge);


       /* WebElement text=driver.findElement(By.xpath("//b[contains(text(),' Note: Your user name is')]"));//advance xpath
        text.getText();
        System.out.println(text);*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(notificationMasssge.isDisplayed()){
            System.out.println("Text is done");
        }else {
            System.out.println("More work to do");
        }
        driver.quit();



    }
}