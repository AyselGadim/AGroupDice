
	package tests;

	import static org.testng.Assert.assertEquals;

	import org.testng.annotations.Test;

	import pages.SearchButtonPage;
	import utilities.BrowserUtilities;

	public class SearchButtonTest extends TestBase {

		@Test 
		public void searchButtonTest() {
			SearchButtonPage.searchForValues();
			
			SearchButtonPage page = new SearchButtonPage();
			BrowserUtilities.waitForVisibility(page.emailRequestText, 15);
			
			String actualText = page.emailRequestText.getText();
			String expectedText = "Email me jobs for this search";
			
			assertEquals(actualText, expectedText, 
					"ASSERTION: searchButtonTest - complete"); 
		}

	}

