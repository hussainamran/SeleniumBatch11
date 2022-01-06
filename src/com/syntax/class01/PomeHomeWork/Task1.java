package com.syntax.class01.PomeHomeWork;

import com.syntax.class01.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1 extends CommonMethods {

    @FindBy(id="textUsername")
    public WebElement username;
    @FindBy(id="textPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    public Task1(){
        PageFactory.initElements(driver,this);
    }
}
