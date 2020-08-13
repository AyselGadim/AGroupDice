
	package tests;

	import static org.testng.Assert.assertEquals;
	import static org.testng.Assert.assertTrue;

	import org.testng.annotations.Test;

	import pages.JobListingsPage;
	import pages.SearchButtonPage;
	import utilities.BrowserUtilities;
	import utilities.ConfigReader;

	public class JobListingsPageTest extends TestBase {
		
		//TODO Test for Save Button
		@Test
		public void saveButtonTest() {
			SearchButtonPage.searchForValues();
			BrowserUtilities.waitForPageToLoad(15);

			JobListingsPage page = new JobListingsPage();
			
			page.saveButton.click();		
			
			BrowserUtilities.waitForVisibility(page.singInButton, 15);
			String actualText = new JobListingsPage().singInButton.getText();
			String expectedText = "Sign In";
			
			assertEquals(actualText, expectedText,
					"ASSERTION: saveButtonTest");
		}
		
		//TODO Test for Email Jobs button

		@Test
		public void emailJobsButtonTest() {
			SearchButtonPage.searchForValues();
			
			JobListingsPage.clickEmailJobs();
			
			String actualText = new JobListingsPage().singInToUseThisFeature.getText();
			String expectedText = "Sign In To Use This Feature";
			assertEquals(actualText, expectedText,
					"ASSERTION: emailJobsButtonTest");
		}

		// TODO Test for page url to contain searched values

		@Test
		public void urlSearchValuesTest() {
			SearchButtonPage.searchForValues();
			
			String actualText = driver.getCurrentUrl();
			String expectedQueryText = ConfigReader.getProperty("jobtitle");
			String expectedlocationText = ConfigReader.getProperty("location");
			
			assertTrue(actualText.contains(expectedQueryText) 
					&& actualText.contains(expectedlocationText),
					"ASSERTION: urlSearchValuesTest");
		}
		
		// TODO Test for all search result properties to contain 'Full-time' value
		// CONTINGENCY: Need to check 'Remote-only' check-box first.

//		@Test
		public void remoteOnlyTest() {
			SearchButtonPage.searchForValues();
			JobListingsPage.clickRemoteOnly();
			
			SearchButtonPage sbp = new SearchButtonPage();
			
			String actualText = sbp.searchLocationInput.getAttribute("placeholder");
			String expectedText = "Remote Only";
			
			assertTrue( actualText.contains(expectedText),
					"ASSERTION: remoteOnlyTest");
		}

		// TODO Test for all search result properties to contain 'Full-time' value
		// CONTINGENCY: Need to check 'Full-time' check-box first.

		@Test
		public void fullTimeTest() {
			SearchButtonPage.searchForValues();
			
			JobListingsPage.clickFullTime();
			
			JobListingsPage jlp = new JobListingsPage();
			
			String actualTextFT = jlp.fullTime.getText();
			String expectedTextFT = "Full time";
			
			assertTrue(actualTextFT.contains(expectedTextFT),
					"ASSERTION: fullTimeTest");

		}


		// TODO -> TC-1: Test for page title

		// @Test

		// public void verifyPageTitleTest() {

		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://www.dice.com/");
		 * 
		 * String title = driver.getTitle(); System.out.println("Page title:" + title);
		 * Assert.assertEquals(title,
		 * "Find Jobs in Tech | Dice.com | Find Jobs in Tech"); }
		 * 
		 */

	}

