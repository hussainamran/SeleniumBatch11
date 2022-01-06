package com.syntax.class01.test;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.pages.LoginPageWithPageFactory;
import com.syntax.class01.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class LoginPageTest {
    public static void main(String[] args) {
        //open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //locate the Elements and send keys
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        WebElement user=login.username;
        CommonMethods.sendText(user,"Admin");

        WebElement password=login.password;
        CommonMethods.sendText(password,"Hum@nhrm122");

        login.loginBtn.click();

        //take screenshot
        CommonMethods.takeTheScreenShot("LoginPage");

        //close the browser
        BaseClass.tearDown();

    }
}
