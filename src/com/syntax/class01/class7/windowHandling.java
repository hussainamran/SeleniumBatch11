package com.syntax.class01.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class windowHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        // get the address/handle of the page/window
        String signPageHandle=driver.getWindowHandle();

        //locate the btns help, terms, privacy
        // System.out.println("The window handle for the signup page is :"+signPageHandle);
        //WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
       // WebElement termBtn=driver.findElement(By.xpath("//a[text()='Terms']"));
       // WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        //click on them to open up new windows
       // helpBtn.click();
        //termBtn.click();
        //privacyBtn.click();

        // we havent switched the focus so it is still on the main/home/signup page
        //to get all the window handles

        Set<String> allWindowHandles=driver.getWindowHandles();

        //print the size of allwindowHandles
        System.out.println("Number of the handle is :"+allWindowHandles.size());

        //in order to print all window handles we need to iterate over the set
        Iterator<String> it= allWindowHandles.iterator();
        while(it.hasNext()){
            //switch to terms page
           String handle= it.next();
           // now switch to this particular handle/window
           driver.switchTo().window(handle);
           String title=driver.getTitle();
           //if condition
           if(title.equalsIgnoreCase("Google Account Help")){
               System.out.println(title);
               break;
           }
        }
       // signPageHandle=it.next();
       // String helpPageHandle=it.next();
       // String termPageHandle=it.next();
       // String privacyPageHandle=it.next();/

        //System.out.println("The handle for signup page is :"+signPageHandle);
        //System.out.println("The handle for help page is :"+helpPageHandle);
       // System.out.println("The handle for term page is :"+termPageHandle);
        //System.out.println("The handle for privacy page is :"+privacyPageHandle);

        //switch to help page
       // driver.switchTo().window(privacyPageHandle);
        //System.out.println(driver.getTitle());
    }
}
