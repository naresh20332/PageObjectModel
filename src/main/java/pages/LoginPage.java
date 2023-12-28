package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PropertyFileReader;

public class LoginPage {
	
	WebDriver driver;
	PropertyFileReader fileReader;
	
	By login = By.xpath("//a[text()='Log in']");		
	By userName = By.id("loginusername");
	By password =By.id("loginpassword");	
	By loginButton = By.xpath("//button[text()='Log in']");
	
	public LoginPage(WebDriver driver) throws IOException {
		this.driver=driver;
		fileReader = new PropertyFileReader();
	}
	
	public void clickLoginOption() {
		driver.findElement(login).click();
	}
	
	public void enterUserName() {
		driver.findElement(userName).sendKeys(fileReader.getUserName());
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys(fileReader.getPassword());;
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}


}


