package com.syntax.class01.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableWithPagination {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //print the row that contains student name Archy J

        //located the table rows using xpath
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));

        //locate the next button on the table
        WebElement nextBtn = driver.findElement(By.xpath("//a[@class='next_link']"));

        //iterate over the list and see if the desired row is there or not

       boolean notFound=true;
        while (notFound) {
            for (WebElement element : tableRows) {

                String textrow=element.getText();
                if (textrow.contains("Archy J")) {
                    System.out.println(textrow);
                    notFound=false;
                    break;
                }
            }
            if(notFound){
                nextBtn.click();

            }

        }
    }
}