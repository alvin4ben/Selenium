package ecommerce.vodafone.step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import ecommerce.vodafone.helpers.configProperty;
import ecommerce.vodafone.helpers.genericFunctions;
import ecommerce.vodafone.pageobjects.*;

public class Common extends genericFunctions{
	public static WebDriver driver;
	public configProperty config;
	public LoginPage LoginPage;
	public HomePage HomePage;

	public Common() {
		super(driver);
		driver = CucumberHooks.driver;
		LoginPage = new LoginPage(driver);
		HomePage = new HomePage(driver);
		config = new configProperty();
	}

	@Given("^I open the \"([^\"]*)\" url$")
	public void open_url(String url) throws Throwable {
		System.out.println(url);
		driver.get(config.getPageURL(url));
	}

	@Then("^I validate the \"([^\"]*)\" in \"([^\"]*)\" page$")
	public void validate(String val, String page) throws Throwable {
		switch (val) {
		case "page title":
			if(page.equals("login")) {
				assertEquals(config.getPageTitle("LoginpageTitle"), driver.getTitle());
			}else if (page.equals("home")) {
				assertEquals(config.getPageTitle("LoginpageTitle"), driver.getTitle());
			}
			break;
			
		case "welcome message":
			String welcome_text = getElementText(HomePage.WELCOME_MSG);
			assertTrue(isContain(welcome_text,"allwin"));
			break;
		default:
			throw new IllegalArgumentException("case not matching");
		}
	}


}