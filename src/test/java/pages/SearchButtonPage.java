
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

public class SearchButtonPage {

	public SearchButtonPage() {
		PageFactory.initElements(Driver.getDriver(), this); // without this @Findby will not work
	}

	@FindBy(css = "[type='search']")
	public WebElement searchJobTitleInput;

	@FindBy(id = "google-location-search")
	public WebElement searchLocationInput;

	@FindBy(id = "searchResultLocation")
	public WebElement searchResultLocation;

	@FindBy(id = "submitSearch-button")
	public WebElement submitSearchButton;

	@FindBy(id = "jobAlertText_1")
	public WebElement actualText;

	@FindBy(id = "jobAlertText_1")
	public WebElement emailRequestText;

	public static void searchForValues() {
		SearchButtonPage page = new SearchButtonPage();
		page.searchJobTitleInput.sendKeys(ConfigReader.getProperty("jobtitle"));
		page.searchLocationInput.sendKeys(ConfigReader.getProperty("location"));
		page.submitSearchButton.click();
	}

}
