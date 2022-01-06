package com.syntax.class01.pages;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.testBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement usernameField=driver.findElement(By.xpath("//*[@name='txtUsername']"));
    public WebElement passwordField=driver.findElement(By.xpath("//*[@name='txtPassword']"));
    public WebElement loginBtn=driver.findElement(By.xpath("//*[@name='Submit']"));
}
