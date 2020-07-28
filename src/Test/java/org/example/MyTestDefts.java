package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyTestDefts extends Util1 {
    // objects for clling all method
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessfulyPage registerSuccessfulyPage = new RegisterSuccessfulyPage();

      // all steps according test case
    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        homePage.clickOnRegisterButton();
    }
      // user click on register button
    @When("^user click on register button$")
    public void user_click_on_register_button() {
        homePage.clickOnRegisterButton();

    }
    @When("^user enter all required registration details$")
    public void user_enter_all_required_registration_details() {
        registerPage.userEntersRegistrationDetails();

    }
    @When("^user clicks on register-submit button$")
    public void user_clicks_on_register_submit_button() {
        registerPage.userClickOnRegisterSubmitButton();

    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully() {
        registerSuccessfulyPage.verifyUserRegisterSuccessfully();

    }







}
