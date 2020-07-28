package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterSuccessfulyPage extends Util1{
    private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");
    String expectedRegisterSuccessMessage = "Your registration completed";

      // assert for register success message
    public void verifyUserRegisterSuccessfully() {
        Assert.assertEquals(getTextFromElement(this._registerSuccessMessage), this.expectedRegisterSuccessMessage);
    }
}


