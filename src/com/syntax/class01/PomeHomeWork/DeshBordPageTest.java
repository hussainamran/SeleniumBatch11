package com.syntax.class01.PomeHomeWork;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.pages.LoginPageWithPageFactory;
import com.syntax.class01.testBase.BaseClass;

public class DeshBordPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        DeshBord deshBord=new DeshBord();
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();

        loginPageWithPageFactory.username.sendKeys("Admin");
        loginPageWithPageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();
        String text=deshBord.WlcomeAdmin.getText();
        System.out.println(text);
        CommonMethods.takeTheScreenShot("DashBord");
        BaseClass.tearDown();



    }
}
