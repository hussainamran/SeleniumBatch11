package com.syntax.class01.pages;

import com.syntax.class01.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy (id="welcome")
    public  WebElement welcomeAdmin;

    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }

}
