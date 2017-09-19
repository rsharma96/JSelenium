package com.selenium.testpackage;

import com.selenium.utility.CaptureScreenshot;
import com.selenium.utility.Security;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by rsharma96 on 2017-09-19.
 */
public class CaptureScreenshotTest {

    public static void main(String args[]) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
        WebDriver driver = new ChromeDriver();
        CaptureScreenshot cs = new CaptureScreenshot();
        cs.takeScreenshot(driver);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
        cs.takeScreenshot(driver);
        String email = Security.decryt(Security.encrytScanner());
        String pass = Security.decryt(Security.encrytScanner());

        driver.findElement(By.id("identifierId")).sendKeys(email);
        cs.takeScreenshot(driver);
        driver.findElement(By.className("CwaK9")).click();
        //Thread.sleep(4000);
        driver.findElement(By.name("password")).sendKeys(pass);
        cs.takeScreenshot(driver);
        Thread.sleep(4000);
        driver.findElement(By.className("CwaK9")).click();
        //driver.findElement(By.xpath("//span[text(),'Next']")).click();

        WebElement compose = driver.findElement(By.xpath("//div[text()='COMPOSE']"));
        cs.takeScreenshot(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(compose));

        compose.click();
        cs.takeScreenshot(driver);

    }
}
