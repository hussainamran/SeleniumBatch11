package com.syntax.class01.Utils;

import com.syntax.class01.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {
    /*
    sends text to a given Element
    @param element-->WebElement
    @param text-->the text that you want to send
     */

    public static void sendText(WebElement element ,String text){
        element.clear();
        element.sendKeys(text);
    }
    public void switchToFrame(int index){
        driver.switchTo().frame(index);

    }
    public static void takeTheScreenShot(String filename ){
        //        take screen shot
        TakesScreenshot ts=(TakesScreenshot) driver;
//        take screen shot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
//        we need to save the screenshot file in our computer

        try {
            FileUtils.copyFile(screenShot,new File("screenshot/POM/"+filename+".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
