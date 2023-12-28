package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	By welcomeText = By.xpath("//a[text()='Welcome TestUserNaresh']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}


	public void validateWelcomeText() {
		String wecome_text = "Welcome TestUserNaresh";
		String text = driver.findElement(welcomeText).getText();
		Assert.assertEquals(wecome_text,text);
	}

}
