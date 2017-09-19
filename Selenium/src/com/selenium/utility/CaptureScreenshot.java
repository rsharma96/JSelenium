package com.selenium.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by rsharma96 on 2017-09-19.
 */
public class CaptureScreenshot {

    public void takeScreenshot(WebDriver driver) throws IOException {


//        (TakesScreenshot)driver.getScreenshotAs(); // it will throw error but if we encapsulate (TakesScreenshot)driver
        //into parenthesis then the error will gone
        // This statement will take Screenshot in the format of FILE
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // to import any package hover over the word and then press alt + Enter

// Once the screenshot is taken lets copy that to another desired location

        FileUtils.copyFile(scr,
                new File("/Users/gaurnitai/Documents/SeleniumJava/" +
                        "IDEAJava/JSelenium/screenshots/"+System.currentTimeMillis()+".jpeg"));


    }


}
