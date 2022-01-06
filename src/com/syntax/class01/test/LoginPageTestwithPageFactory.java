package com.syntax.class01.test;

import com.syntax.class01.pages.LoginPageWithPageFactory;
import com.syntax.class01.testBase.BaseClass;

public class LoginPageTestwithPageFactory {
    public static void main(String[] args) {

        // open the browser

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // create an object of loginwithPageFactory

        LoginPageWithPageFactory loginWPG=new LoginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("HRM@nhrm123");
        loginWPG.loginBtn.click();

        //close browser
        BaseClass.tearDown();
    }
}
