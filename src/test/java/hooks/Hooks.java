package hooks;

import org.openqa.selenium.WebDriver;

import configs.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver webDriver;

	@Before
	public void setUp() {
		webDriver = DriverFactory.initBrowser("chrome");
		webDriver.manage().window().maximize();
		webDriver.get("https://automationexercise.com/");
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();

	}
}
