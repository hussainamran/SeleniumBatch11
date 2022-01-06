package com.syntax.class01.reviewclass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowsHandle {
    public static String url="https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&c[…]%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //  click on the facebook link to open up a new facebook tab/ window
        WebElement fb = driver.findElement(By.xpath("//a[text()='Terms']"));
        fb.click();

        //print or get the pagehandle of defult page

        String mainpagehandle=driver.getWindowHandle();
        System.out.println("The current page handle is : "+mainpagehandle);

        //to switch to terms page and click on overview
        //get all the windows handles
        //sekect the one associated with terms window
        //switch to it and click on overview

        Set<String>allhandles=driver.getWindowHandles();

        //find the one associated with page terms

        Iterator<String>it=allhandles.iterator();
        while (it.hasNext()){
            //get the windohandle from the set
            String handel=it.next();
            //cheack if it is the required one
            driver.switchTo().window(handel);
            //now check if it is the desired one
            if(driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms?gl=US&hl=en")){
                System.out.println(driver.getTitle());
                break;
            }
        }
        driver.findElement(By.xpath("//a[text()='Overview']")).click();
        driver.switchTo().defaultContent();

    }
}
