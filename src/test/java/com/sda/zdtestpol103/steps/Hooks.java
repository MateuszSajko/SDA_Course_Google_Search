package com.sda.zdtestpol103.steps;

import com.sda.zdtestpol103.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("This is scenario name " + scenario.getName());

        // This is place to start browser
        WebDriverManager.startDriver();

    }
    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Is scenario Failed " + scenario.isFailed());

        // This is place to kill browser

        WebDriverManager.destroyDriver();



    }


}
