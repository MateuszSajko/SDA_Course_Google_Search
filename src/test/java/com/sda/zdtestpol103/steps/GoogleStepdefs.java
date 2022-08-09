package com.sda.zdtestpol103.steps;

import com.sda.zdtestpol103.pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdefs {

    GooglePage googlePage = new GooglePage();

    @Given("Google page is opened")
    public void googlePageIsOpened() {
        googlePage.openGooglePage();
    }

    @When("I click Accept all button")
    public void iClickAcceptAllButton() {
        googlePage.clickAcceptAllButton();

    }

    @And("I type in the search bar {string}")
    public void iTypeInTheSearchBar(String searchPhrase) {
        googlePage.searchInGoogle(searchPhrase);
    }

    @Then("Results will be desplayed")
    public void googleSearchResultsWillBeDisplayed() {
        googlePage.verifyThatSearchResultsAreVisible();

    }

    @And("I click Enter button on keyboard")
    public void iClickEnterButtonOnKeyboard() {
        googlePage.pushEnterButton();
    }

    @When("I click accept Accept all button")
    public void iClickAcceptAcceptAllButton() {
        googlePage.clickAcceptAllButton();
    }

    @Then("Search results page is not presented")
    public void searchResultsPageIsNotPresented() {
        googlePage.verifyThatSearchResultsAreNotPresented();
    }
}

