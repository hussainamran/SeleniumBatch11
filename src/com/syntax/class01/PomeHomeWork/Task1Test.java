package com.syntax.class01.PomeHomeWork;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.pages.LoginPage;
import com.syntax.class01.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class Task1Test {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPage loginPage=new LoginPage();
        WebElement username=loginPage.usernameField;
        CommonMethods.sendText(username,"Admin");
        WebElement password= loginPage.passwordField;
        CommonMethods.sendText(password,"arjherknd");
        loginPage.loginBtn.click();
        CommonMethods.takeTheScreenShot("Task1screenshot");
        BaseClass.tearDown();
    }
}
