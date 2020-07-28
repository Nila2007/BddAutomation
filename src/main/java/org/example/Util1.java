package org.example;
  // All reusable method
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Util1 extends BasePage {
    // wait method ..
    public static void waitUntilElementToBeClickable(By by){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
     // type text method
    public static void TypeText(By by, String text,int time){
        driver.findElement(by).sendKeys(text);
    }
    // click method with  Two parameter, one for time
    public static void clickOnElement(By by,int time){
        driver.findElement(by).click();
    } //time stamp method
    public static long timestamp(){
        return (System.currentTimeMillis());
    } // below method is for text
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public static void userRegisterSuccessfully( By by ,String text){
        getTextFromElement(by);
    }public static void getStringfromElement(By by) {
        driver.findElement(by).getText();
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByVisibleIndex(By by,int n) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n);
    }

    public static void selectFromDropDownByValue(By by, String Value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(Value);
    }

    //creating Clickable method for driver to click on element
    public static void waitUntilElementToClickble(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));
    }

        }


