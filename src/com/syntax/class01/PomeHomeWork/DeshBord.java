package com.syntax.class01.PomeHomeWork;

import com.syntax.class01.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeshBord extends CommonMethods {
    @FindBy (id="Admin")
   public WebElement WlcomeAdmin;

    public DeshBord(){
        PageFactory.initElements(driver,this);
    }


}
