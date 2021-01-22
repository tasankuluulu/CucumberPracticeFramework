package com.syntax.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features/",
glue = "com/syntax/stepDefinitions",
dryRun = false,
monochrome = true,
tags="@smoke",
strict = true,
		plugin = {"pretty", // will print the steps inside the console
				"html:target/cucumber-default-reports", // generates default html report
				"rerun:target/FailedTests.txt", // generates a txt file only with failed tests
				"json:target/cucumber.json"}) // generates json reports
public class TestRunner {

}
