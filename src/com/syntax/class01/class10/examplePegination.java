package com.syntax.class01.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class examplePegination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        // login code username:Admin password Hum@nhrm123

        //user name
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        //password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        //log inbtn
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        // click on Pim
        WebElement pim = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pim.click();

        //click on employeeList
        WebElement employeebtn = driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
        employeebtn.click();

        //-----------dealing with the table-----------------------------
        // as staleElement exception is there so its required to find these elements inside the loop every time
        //******************************
        // look for ID 263354A
        //locate the tables and get the rows
        // List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        //locate the next Btn
        //WebElement NxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));

        //iterate the list and look for the required id 263354A

        //declare a boolean that will be a flag to control the refilling of our list with new enteries of the next page
        //unitl we have found thw desired row or entery

        boolean notFound = true;

        while (notFound) {
            //relocate the rows after the page is refresh to avoide stale elemnts exception
            //locate the table and get the rows
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
           // List<WebElement> buttonRows = driver.findElements(By.xpath("//input[@type='checkbox']"));

            for (int i = 0; i < tableRows.size(); i++) {
                    //get the text out of the webelement in list
                    String text = tableRows.get(i).getText();

                    //check if the row contains the id we are looking for
                    if (text.contains("26335A")) {
                        System.out.println("the index of the id in table is : "+i);

                        // debuging the xpath
                        String xpath="//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input";

                        //WebElement chechBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+1+"]/td/input"));
                        WebElement chechBox=driver.findElement(By.xpath(xpath));
                        System.out.println("the xpath to the checkbox is :"+xpath);
                        chechBox.click();
                        System.out.println();
                        System.out.println(chechBox.isDisplayed());
                        // we found the desired row so we need to end the while loop
                        notFound = false;
                        //we found the desire row so we donot want to iterate the rest of the list of webelemnts and waste time
                        break;

                    }

                }
                //click on next btn once the loop has traversed the whole list
            if (notFound) {
                WebElement NxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                NxtBtn.click();

            }

            }
        }
    }
