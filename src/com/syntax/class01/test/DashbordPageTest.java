package com.syntax.class01.test;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.pages.DashboardPage;
import com.syntax.class01.pages.LoginPageWithPageFactory;
import com.syntax.class01.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class DashbordPageTest {
    public static void main(String[] args) {
        //open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //locate the Elements and send keys
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        WebElement user=login.username;
        CommonMethods.sendText(user,"Admin");

        WebElement password=login.password;
        CommonMethods.sendText(password,"Hum@nhrm123");

        login.loginBtn.click();
        // test the deshboard page for the welcome elemnt task
        DashboardPage dashboardPage=new DashboardPage();
        WebElement massage=dashboardPage.WlcomeAdmin;
        System.out.println(massage.getText());
        CommonMethods.takeTheScreenShot("Dashbordpage");
        BaseClass.tearDown();
    }
}
