package com.calculator.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "com/calculator/stepdef" }, plugin = { "pretty",
		"json:target/JSONReports/report.json" }, monochrome = true, strict = true)
public class TestRunner {

}
