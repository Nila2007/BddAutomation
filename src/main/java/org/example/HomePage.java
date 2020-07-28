package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends Util1{
    private By _registerButton = By.xpath("//a[@class='ico-register']");
   private By _registerPageConformText = By.xpath("//strong[contains(text(),'Featured products')]");
   String expectedTextFromeHomePage = "Featured products";




//      // ********* assert to verifying that user on homepage
//     public void VerifyTextFromeHomepage(){
//       String expectedTitle =  "Featured products";
//       String actualText1 = getTextFromElement(_registerPageConformText);
//       Assert.assertEquals(actualText1,expectedTextFromeHomePage);
//}

    public void clickOnRegisterButton() {
        // user click on registerpage

        clickOnElement(_registerButton, 30);
       // getTextFromElement(_registerPageConformText);



    }}
