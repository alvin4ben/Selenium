package ecommerce.vodafone.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ecommerce.vodafone.helpers.configProperty;
import ecommerce.vodafone.helpers.genericFunctions;

public class HomePage extends genericFunctions{
	/* Used uniform css locators for efficiency*/
	public final By WELCOME_MSG = By.cssSelector(".talktext");

	public configProperty config;

	public HomePage(WebDriver driver) {
		super(driver);
		config = new configProperty();
	}

}