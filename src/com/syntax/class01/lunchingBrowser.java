package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" ,"Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //calling a get method to get a particular website
        driver.get("http://www.google.com");

        // returns the current loaded in the browser
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is : "+url);

       String title=driver.getTitle();
        System.out.println("The current title of the page is : "+title);

        driver.close();

    }
}
