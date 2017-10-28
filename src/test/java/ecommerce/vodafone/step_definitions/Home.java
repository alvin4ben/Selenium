package ecommerce.vodafone.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import ecommerce.vodafone.helpers.configProperty;
import ecommerce.vodafone.helpers.genericFunctions;
import ecommerce.vodafone.pageobjects.*;

public class Home extends genericFunctions{
	public static WebDriver driver;
	public configProperty config;
	public HomePage HomePage;
	
	public Home() {
		super(driver);
		driver = CucumberHooks.driver;
		HomePage = new HomePage(driver);
		config = new configProperty();
	}	


}