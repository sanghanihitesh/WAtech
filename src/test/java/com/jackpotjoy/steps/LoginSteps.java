package com.jackpotjoy.steps;

import com.jackpotjoy.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @When("I click on Login Link")
    public void iClickOnLoginLink() throws InterruptedException {
        new LoginPage().acceptCookies();
        Thread.sleep(2000);
        new LoginPage().clickOnLoginLink();
    }

    @And("I enter {string}")
    public void iEnter(String email, String pswd) {
        new LoginPage().clickOnEmailField(email);
        new LoginPage().clickOnPasswordField(pswd);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should Login successfully")
    public void iShouldLoginSuccessfully() {
    }
}
