package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefs {
    @Given("This is given step")
    public void thisIsGivenStep() {
        System.out.println("This is Given Step!!!!");
    }

    @When("This is when step")
    public void thisIsWhenStep() {
        System.out.println("This is When step!!!");

    }

    @Then("This is then step")
    public void thisIsThenStep() {
        System.out.println("This is then step!!");

    }

    @When("I click something")
    public void iClickSomething() {

    }

    @Then("I can see something")
    public void iCanSeeSomething() {

    }
}
