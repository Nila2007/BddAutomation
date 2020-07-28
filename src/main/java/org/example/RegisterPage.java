package org.example;

import org.openqa.selenium.By;
  // User register detail
public class RegisterPage extends Util1{
    // Loadprop object to input details
    LoadProp loadProp =new LoadProp();
    // Locatores for register details
    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _dateOfBirthday = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthyear = By.name("DateOfBirthYear");
    private By _emailField = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _registerSubmitButton = By.id("register-button");


    public void userEntersRegistrationDetails() {
          // user details ...first name
        TypeText(_firstName,loadProp.getProperty("FirstName"),30);
        // Last name
        TypeText(_lastName, loadProp.getProperty("lastName"),30);
         // Birthday
        selectFromDropDownByVisibleText(_dateOfBirthday,loadProp.getProperty("DateOfBirthDay"));
        selectFromDropDownByVisibleText(_dateOfBirthMonth,loadProp.getProperty("DateOfMonth"));
        selectFromDropDownByVisibleText(_dateOfBirthyear,loadProp.getProperty("BirthYear"));
        // Email Address , using timestamp
        TypeText(_emailField,loadProp.getProperty("EmailId")+timestamp()+loadProp.getProperty("Email"),30);
        // company name
        TypeText(_CompanyName,loadProp.getProperty("CompanyName"),20);
        //password
        TypeText(_password,loadProp.getProperty("password"),20);
        // coforme password
        TypeText(_confirmpassword,loadProp.getProperty("confirmPassword"),20);
    }
    public void userClickOnRegisterSubmitButton() {
        // User enter register submitbutton
        clickOnElement(_registerSubmitButton,30);
}}
