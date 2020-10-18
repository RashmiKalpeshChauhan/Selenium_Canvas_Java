package com.calculator.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalculatorPage extends BasePage {
	WebElement canvas;

	public void navigateToUrl() throws Exception {
		initialize();
	}

	public void clickDivisionSign() {
		new Actions(driver).moveByOffset(720, 250).click().build().perform();
		new Actions(driver).moveByOffset(-720, -250).click().build().perform();
	}

	public void clickMinusSign() {
		new Actions(driver).moveByOffset(723, 416).click().build().perform();
		new Actions(driver).moveByOffset(-723, -416).click().build().perform();
	}

	public void clickEqualSign() {
		new Actions(driver).moveByOffset(800, 490).click().build().perform();
		new Actions(driver).moveByOffset(-800, -490).click().build().perform();

	}

	public void clickClearBtn() {
		new Actions(driver).moveByOffset(800, 156).click().build().perform();
		new Actions(driver).moveByOffset(-800, -156).click().build().perform();
	}

	public void btn7() {
		new Actions(driver).moveByOffset(476, 223).click().build().perform();
		new Actions(driver).moveByOffset(-476, -223).click().build().perform();
	}

	public void btn8() {
		new Actions(driver).moveByOffset(548, 248).click().build().perform();
		new Actions(driver).moveByOffset(-548, -248).click().build().perform();
	}

	public void btn9() {
		new Actions(driver).moveByOffset(638, 248).click().build().perform();
		new Actions(driver).moveByOffset(-638, -248).click().build().perform();
	}

	public void btn4() {
		new Actions(driver).moveByOffset(473, 331).click().build().perform();
		new Actions(driver).moveByOffset(-473, -331).click().build().perform();
	}

	public void btn5() {
		new Actions(driver).moveByOffset(556, 329).click().build().perform();
		new Actions(driver).moveByOffset(-556, -329).click().build().perform();
	}

	public void btn6() {
		new Actions(driver).moveByOffset(635, 335).click().build().perform();
		new Actions(driver).moveByOffset(-635, -335).click().build().perform();
	}

	public void btn1() {
		new Actions(driver).moveByOffset(476, 418).click().build().perform();
		new Actions(driver).moveByOffset(-476, -418).click().build().perform();
	}

	public void btn2() {
		new Actions(driver).moveByOffset(556, 420).click().build().perform();
		new Actions(driver).moveByOffset(-556, -420).click().build().perform();
	}

	public void btn3() {
		new Actions(driver).moveByOffset(631, 414).click().build().perform();
		new Actions(driver).moveByOffset(-631, -414).click().build().perform();
	}

	public void clickNumber(int num) {
		switch (num) {
		case 1:
			btn1();
			break;
		case 2:
			btn2();
			break;
		case 3:
			btn3();
			break;
		case 4:
			btn4();
			break;
		case 5:
			btn5();
			break;
		case 6:
			btn6();
			break;
		case 7:
			btn7();
			break;
		case 8:
			btn8();
			break;
		case 9:
			btn9();
			break;
		}
	}

}
