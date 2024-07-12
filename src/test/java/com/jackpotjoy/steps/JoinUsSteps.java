package com.jackpotjoy.steps;

import com.jackpotjoy.pages.JoinUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinUsSteps {
    @When("I click On JoinUs Button")
    public void iClickOnJoinUsButton() {
        new JoinUsPage().clickOnJoinUsButton();
    }

    @And("I enter Email")
    public void iEnterEmail() {
        new JoinUsPage().setEnterEmail();
    }

    @And("I select Title")
    public void iSelectTitle() {
        new JoinUsPage().selectTitle();
    }

    @And("I enter FirstName")
    public void iEnterFirstName() {
        new JoinUsPage().setfName();
    }

    @And("I enter SurName")
    public void iEnterSurName() {
        new JoinUsPage().setSurName();
    }

    @And("I enter DateOfBirth")
    public void iEnterDateOfBirth() {
        new JoinUsPage().setDateOfBirth();
    }

    @And("I select Gender")
    public void iSelectGender() {
        new JoinUsPage().setGender();
    }

    @Then("I click on nextButton")
    public void iClickOnNextButton() {
        new JoinUsPage().clickOnNextButton();
    }
}
