package com.calculator.stepdef;

import java.io.IOException;

import com.calculator.pages.CalculatorPage;
import com.calculator.utils.PropertyManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {
	// WebDriver driver = null;
	CalculatorPage cc;

	@Given("User is on online calculator page")
	public void user_is_on_online_calculator_page() throws Exception {
		cc = new CalculatorPage();
		cc.navigateToUrl();
	}

	@When("User click on first number")
	public void user_click_on_first_number() throws Exception {
		PropertyManager property = new PropertyManager();
		cc = new CalculatorPage();
		System.out.println(property.readPropertyData("num1"));
		cc.clickNumber(Integer.parseInt(property.readPropertyData("num1")));
	}

	@And("User click on minus sign")
	public void user_click_on_minus_sign() {
		cc = new CalculatorPage();
		cc.clickMinusSign();
	}

	@And("User click on second number")
	public void user_click_on_second_number() throws IOException {
		PropertyManager property = new PropertyManager();
		cc = new CalculatorPage();
		System.out.println(property.readPropertyData("num2"));
		cc.clickNumber(Integer.parseInt(property.readPropertyData("num2")));
	}

	@And("User click on equal Sign")
	public void user_click_on_equal_Sign() {
		cc = new CalculatorPage();
		cc.clickEqualSign();
	}

	@Then("Answer should appear in answer box")
	public void answer_should_appear_in_answer_box() {
		System.out.println("6");
	}

	@And("User click on division sign")
	public void user_click_on_division_sign() {
		cc = new CalculatorPage();
		cc.clickDivisionSign();
	}

	@And("User click on Clear button")
	public void user_click_on_Clear_button() {
		cc = new CalculatorPage();
		cc.clickClearBtn();
	}
}
