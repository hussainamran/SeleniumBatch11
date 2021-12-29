package com.syntax.class01.class5;

import javafx.scene.control.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to syntax checkbox demo and check the first checkbox
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //locate the webelement checkbox
        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        // check the check Box
        singleCheckBox.click();
        Thread.sleep(2000);

        //uncheck the check box
        singleCheckBox.click();

        // check all the text boxes simultaneously
        //select a xpath that has common attribute value for all the checkboxes
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        Thread.sleep(2000);
        //print the number of checkboxes
        int size = checkBox.size();
        System.out.println("The total number of checkboxes is: " + size);

        //iterate through each webElement
        for (WebElement element : checkBox) {
            //select the check box with text option3
            //get the attribute "value" of all checkBox
            String valueOfAttribute = element.getAttribute("value");
            System.out.println(valueOfAttribute);

//check only whoes value is "option-3"
            if (valueOfAttribute.contains("Option-3")) {
                //chek on the checkbox whose attribute value is Option-3
                element.click();
                Thread.sleep(2000);


            }
        }
    }
}