package com.syntax.class01.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {

    public static String url="https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        //print all the rows of the webtable in the console

        // locate the rows in the table using xpath and save it in a variable

        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //print number of rows
        System.out.println("The number of rows in the table are--- "+tableRows.size());

        // iterate through each webelemnt and get the text out of it

        for(WebElement row:tableRows){
           String text=row.getText();
            System.out.println(text);

        }
        //prints all the headder text

        List<WebElement>tableheadder=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
       for(WebElement headder:tableheadder){
           System.out.println( headder.getText());
       }
       //print the culom number two
        List<WebElement>col2=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
       for (WebElement col:col2){
           System.out.println("The colom 2 data "+col.getText());
       }
    }
}
