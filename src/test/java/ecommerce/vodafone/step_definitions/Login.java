package ecommerce.vodafone.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import ecommerce.vodafone.helpers.BusinessFunctions;
import ecommerce.vodafone.helpers.configProperty;
import ecommerce.vodafone.helpers.genericFunctions;
import ecommerce.vodafone.pageobjects.*;

public class Login extends genericFunctions{
	public static WebDriver driver;
	public configProperty config;
	public LoginPage LoginPage;
	public static long k;
	
	public Login() {
		super(driver);
		driver = CucumberHooks.driver;
		LoginPage = new LoginPage(driver);
		config = new configProperty();
	}	
	
	@When("^I login the page$")
	public void login() throws InterruptedException {
		sendKeys(LoginPage.USERNAME, config.getValue("username"));
		sendKeys(LoginPage.PASSWORD, config.getValue("password"));
		k = BusinessFunctions.starttime();
		clickElement(LoginPage.SUBMIT);
	}

}