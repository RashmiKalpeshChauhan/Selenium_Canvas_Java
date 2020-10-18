package com.calculator.pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	static WebDriver driver = null;

	@Before
	public static void initialize() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online-calculator.com/html5/online-calculator/index.php?v=10");
	}

	@After
	public static void quit() {
		driver.quit();
	}
}
