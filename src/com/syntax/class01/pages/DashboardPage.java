package com.syntax.class01.pages;

import com.syntax.class01.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {
    @FindBy (id="welcome")
    public WebElement wlcomeAdmin;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }


}
