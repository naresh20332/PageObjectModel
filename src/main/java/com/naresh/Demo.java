
package com.naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void verifySearchButton() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.demoblaze.com/index.html");
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		
		WebElement userName = driver.findElement(By.id("loginusername"));
		userName.sendKeys("TestUserNaresh");
		
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("TestUser");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.click();

		String wecome_text = "Welcome TestUserNaresh";
		WebElement welcomeText = driver.findElement(By.xpath("//a[text()='Welcome TestUserNaresh']"));

		String text = welcomeText.getText();

		Assert.assertEquals(text, wecome_text, "Text not found!");
	}
}
