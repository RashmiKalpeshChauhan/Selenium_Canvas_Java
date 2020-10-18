//package com.calculator.stepdef;
//
//import java.awt.image.BufferedImage;
//import java.io.File;
//
//import javax.imageio.ImageIO;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WrapsDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Canvas {
//
//	static WebDriver driver;
//
//	public static void main(String[] args) {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.online-calculator.com/html5/online-calculator/index.php?v=10");
//		
//		// new WebDriverWait(driver,
//		// 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
////		WebElement canvas = new WebDriverWait(driver, 10)
////				.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
//////		System.out.println(canvas.getLocation());
////		Actions builder = new Actions(driver);
//		// 7
//		// new Actions(driver).moveByOffset(476, 223).click().build().perform();
//		// new Actions(driver).moveByOffset(-476, -223).click().build().perform();
//		// 8
////		new Actions(driver).moveByOffset(548, 248).new Actions(driver).moveByOffset(-548, -248).click().build()
////				.perform();
//		// divide
//		// new Actions(driver).moveByOffset(720, 250).click().build().perform();
//		// new Actions(driver).moveByOffset(-720, -250).click().build().perform();
//		// Minius
//		// new Actions(driver).moveByOffset(723, 416).click().build().perform();
//		// new Actions(driver).moveByOffset(-723, -416).click().build().perform();
//
//		// 2
////		new Actions(driver).moveByOffset(548, 412).click().build().perform();
////		new Actions(driver).moveByOffset(-548, -412).click().build().perform();
////		// =
////		new Actions(driver).moveByOffset(800, 490).click().build().perform();
////		new Actions(driver).moveByOffset(-800, -490).click().build().perform();
//		//
//
////		JavascriptExecutor executor = (JavascriptExecutor) driver;
////		executor.executeScript(
////				"(document.getElementById(\"canvas\").dispatchEvent(new KeyboardEvent(\"keypress\",{which: 53,keyCode:53}))).click();");
////		// JavascriptExecutor js = (JavascriptExecutor) driver;
//		// js.executeScript(
//		// "document.getElementById(\"canvas\").dispatchEvent(new
//		// KeyboardEvent(\"keypress\",{which: 53,keyCode:53})).click();");
//
//		// clicking on 3
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0, (174 / 6) * 3).click().build().perform();
////////6
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0, (174 / 5) * 3).click().build().perform();
//////		// 6
//////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0, (174 / 4) * 2).click().build().perform();
//		// new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0, (255 / 3) *
//		// 3).click().build().perform();
////		// new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174 / 5) * 2,
////		// (255 / 6) * 3).click().build()
////		// .perform();
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174 / 5) * 3, (255 / 6) * 3).click().build()
////				.perform();
////		// clicking on 3
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0, (255 / 6) * 3).click().build().perform();
////		// clicking on the substract sign (-)
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174 / 5) * 2, (255 / 6) * 3).click().build()
////				.perform();
////		// clicking on 1
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174 / 5) * 4, (255 / 6) * 3).click().build()
////				.perform();
////		// clicking on equals to sign (=)
////		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174 / 5) * 4, (255 / 6) * 4).click().build()
////				.perform();
//		// Actions action = new Actions(driver);
//
//		// new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,
//		// 2).click().build().perform(); // moves cursor
//		// to point
//		// (5,5)
//
//		// new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(68,
//		// 65).click().build().perform(); // moves cursor
//		// to point
//		// (10,15)
//
//	}
//
//}