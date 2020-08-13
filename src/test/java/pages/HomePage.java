
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

/**
 * The Home Page for Dice.com
 * 
 * @author Aysel Gadimov
 */
public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this); // without this @Findby will not work
	}

	@FindBy(css = "[type='search']")
	public WebElement searchJobTitleInput;

	@FindBy(id = "google-location-search")
	public WebElement searchLocationInput;

	@FindBy(id = "submitSearch-button")
	public WebElement submitSearchButton;

	@FindBy(id = "jobAlertText_1")
	public WebElement actualText;

	String title = Driver.getDriver().getTitle();

//		public void login() {
	//
//			 loginPage.usernameField.sendKeys(ConfigReader.getProperty("username"));
//			 loginPage.passwordField.sendKeys(ConfigReader.getProperty("password"));
//			 loginPage.loginButton.click();
//		}
	/**
	 * Given the job title and location as 2 String input parameters, the method
	 * will pass these parameters to the search inputs at the home page and click
	 * the Search button.
	 * 
	 * @param jobTitle as a String
	 * @param location as a String
	 */
	public static void searchForValues1(String jobTitle, String location) {
		HomePage homePage = new HomePage();
		homePage.searchJobTitleInput.sendKeys(jobTitle);
		homePage.searchLocationInput.sendKeys(location);
		homePage.submitSearchButton.click();
	}

	public static void searchForValues() {
		HomePage homePage = new HomePage();
		homePage.searchJobTitleInput.sendKeys(ConfigReader.getProperty("jobtitle"));
		homePage.searchLocationInput.sendKeys(ConfigReader.getProperty("location"));
		homePage.submitSearchButton.click();
	}
}
