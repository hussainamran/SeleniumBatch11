package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
       WebElement radioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='gender']"));
       //radioBtn.click();

       //check if the radion btn is displayed
        boolean isDisplayed= radioBtn.isDisplayed();
        System.out.println("The female radio Btn is displayed on the webpage :"+isDisplayed);

        //check if the radio btn is enabled
       boolean isEnabled= radioBtn.isEnabled();
        System.out.println("The female radio Btn is displayed on the webpage :"+isEnabled);

        //check if the readio btn is selected
       boolean isSelected =radioBtn.isSelected();
        System.out.println("The female radio Btn is displayed on the webpage :"+isSelected);

        //select the female radio btn only if its enabled
        if(isEnabled){
            radioBtn.click();

            // after clicking the btn print if its select or not
            //isSelected=radioBtn.isSelected();
            System.out.println("The female radio Btn is displayed on the webpage :"+isSelected);
        }
    }
}
