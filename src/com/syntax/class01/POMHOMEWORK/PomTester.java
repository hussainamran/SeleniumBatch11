package com.syntax.class01.POMHOMEWORK;

import com.syntax.class01.Utils.CommonMethods;
import com.syntax.class01.pages.DashboardPage;
import com.syntax.class01.pages.LoginPageWithPageFactory;
import com.syntax.class01.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class PomTester {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPageFactory login = new LoginPageWithPageFactory();
        WebElement user = login.username;
        CommonMethods.sendText(user, "Admin");

        WebElement password = login.password;
        CommonMethods.sendText(password, "Hum@nhrm123");
        login.loginBtn.click();
        PomLoginpage page = new PomLoginpage();
        page.Admin.click();
        page.validusername.sendKeys("jamescamron");
        page.UserRole.sendKeys("ESS");
        CommonMethods.takeTheScreenShot("Dashbordpage");
        CommonMethods.tearDown();

    }
}
