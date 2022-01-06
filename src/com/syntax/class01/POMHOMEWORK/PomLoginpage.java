package com.syntax.class01.POMHOMEWORK;

import com.syntax.class01.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginpage extends CommonMethods {
    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement Admin;
    @FindBy(id="searchSystemUser_userName")
    public WebElement validusername;
    @FindBy(id="searchSystemUser_userType")
    public WebElement UserRole;


    public PomLoginpage(){
        PageFactory.initElements(driver,this);
    }

}
