package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class NewTest {

	private WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/index.html");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void loginToApplication() throws IOException {
		LoginPage login = new LoginPage(driver);
		login.clickLoginOption();
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
	}

	@Test
	public void validateHomePage() {
		HomePage hp = new HomePage(driver);
		hp.validateWelcomeText();
	}

}
