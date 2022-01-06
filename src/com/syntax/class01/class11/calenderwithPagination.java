package com.syntax.class01.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calenderwithPagination {
    public static String url = "https://www.sastaticket.pk/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //locating and clicking the calander
        driver.findElement(By.xpath("(//span[@class='dt_label'])[1]")).click();

        //locate the current month year
       WebElement month=driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
       // print the current month
        System.out.println(month.getText());

        //get the next button
        WebElement nextBtn=driver.findElement(By.xpath("//button[text()='Next Month']"));

        //loop through month till we reach our desired month goto the month September
        boolean notfound=true;
        while (notfound){
            if(month.getText().equalsIgnoreCase("September 2022")){
                System.out.println(month.getText());
                notfound=false;
                // select the date
                List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
                //traverse through dates and select the 15th date
                for(WebElement date:dates){
                   String dateText=date.getText();
                    if(dateText.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }

                }
            }else {
                nextBtn.click();
            }
        }

    }
}