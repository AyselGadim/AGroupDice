
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class JobListingsPage {

	public JobListingsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "betaURL")
	public WebElement url;

	@FindBy(css = "button.d-lg-none.btn.btn-outline-primary.ng-star-inserted")
	public WebElement saveButton;

	@FindBy(id = "jobAlertSaveButton")
	public WebElement emailJobs;

	@FindBy(css = ".dropdown-label.ng-tns-c84-3")
	public WebElement filterResultsDropdown;

	@FindBy(id = "signBtnId")
	public WebElement singInButton;

	@FindBy(className = "modal-title")
	public WebElement singInToUseThisFeature;

	@FindBy(css = ".facet-group-header-text.ng-tns-c73-12")
	public WebElement remoteOptionsText;

	@FindBy(css = ".fa.fa-li.fa-square-o")
	public WebElement remoteOnly;

	@FindBy(css = ".ng-tns-c76-26.ng-star-inserted")
	public WebElement fullTime;

	public static void clickFilterResultsDropdown() {
		JobListingsPage jp = new JobListingsPage();
		jp.filterResultsDropdown.click();
	}

	public static void clickEmailJobs() {
		JobListingsPage jp = new JobListingsPage();
		jp.emailJobs.click();
	}

	public static void clickRemoteOnly() {
		JobListingsPage jp = new JobListingsPage();
		jp.remoteOnly.click();
	}

	public static void clickFullTime() {
		JobListingsPage jp = new JobListingsPage();
		jp.fullTime.click();
	}

}
