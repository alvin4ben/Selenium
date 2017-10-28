package ecommerce.vodafone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ecommerce.vodafone.helpers.configProperty;
import ecommerce.vodafone.helpers.genericFunctions;

public class LoginPage extends genericFunctions{
	/* Used uniform css locators for efficiency*/
	public final By USERNAME = By.cssSelector("#username");
	public final By PASSWORD = By.cssSelector("#password");
	public final By SUBMIT = By.name("ql-login-submit");
	

	public configProperty config;

	public LoginPage(WebDriver driver) {
		super(driver);
		config = new configProperty();
	}

}