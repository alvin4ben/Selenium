//package ecommerce.vodafone.pageobjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import ecommerce.vodafone.helpers.configProperty;
//import ecommerce.vodafone.helpers.genericFunctions;
//
//public class IncidentsPage extends genericFunctions {
//
//	/* Used uniform css locators for efficiency*/
//	private final By USERNAME = By.id("#username");
//	private final By PASSWORD = By.cssSelector("#password");
//
//	public configProperty config;
//
//	public IncidentsPage(WebDriver driver) {
//		super();
//		config = new configProperty();
//	}
//
//	/* Enter values in a Text Field */
//	public void insert_value(String value, String Field) throws InterruptedException {
////		if (Field.equals("Computer name")) {
////			sendKeys(COMPUTER_NAME, config.getComputerName("computer-name"));
////		} else if (Field.equals("Introduced date")) {
////			sendKeys(INTRODUCED_DATE, value);
////		} else if (Field.equals("Discontinued date")) {
////			sendKeys(DISCONTINUED_DATE, value);
////		} else if (Field.equals("Computer update name")) {
////			sendKeys(COMPUTER_NAME, config.getComputerName("updated-computer-name"));
////		}
//	}
//
//	/* Click on a Element*/
//	public void click_element(String value) throws InterruptedException {
////		By objLocator = null;
////
////		if (value.equals("create this computer")) {
////			objLocator = CREATE_COMPUTER;
////		} else if (value.equals("save this computer")) {
////			objLocator = UPDATE_COMPUTER;
////		} else if (value.equals("delete this computer")) {
////			objLocator = DELETE_COMPUTER;
////		}
////		clickElement(objLocator);
//	}
//
//	/* Select value from a drop-down box*/
//	public void select_value(String value, String Field) throws InterruptedException {
////		if (Field.equals("company")) {
////			SelectByText(value, COMPANY);
////		} else if (Field.equals("")) {
////
////		}
//	}
//
//}