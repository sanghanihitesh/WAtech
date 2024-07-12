package com.jackpotjoy.steps;

import com.jackpotjoy.pages.SportsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SportsSteps {
    @When("I click on Sports New Link")
    public void iClickOnSportsNewLink() {
        new SportsPage().clickOnSportsTab();
    }

    @And("I click on Explore tab")
    public void iClickOnExploreTab() {
        new SportsPage().clickOnExplorerTab();
    }

    @And("I click on Tennis button")
    public void iClickOnTennisButton() {
        new SportsPage().clickOnTennisTab();
    }

    @Then("I verify Tennis Text on page")
    public void iVerifyTennisTextOnPage() {
        new SportsPage().verifyTennisText();
    }
}
