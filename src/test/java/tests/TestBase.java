
	package tests;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Parameters;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	import utilities.ConfigReader;
	import utilities.Driver;

	public abstract class TestBase {

		protected WebDriver driver;
		protected Actions action;

		protected static ExtentReports reporter;
		protected static ExtentSparkReporter htmlReporter;
		protected static ExtentTest logger;

		@BeforeMethod(alwaysRun = true)
		// @Parameters ("browser")
		public void setUpMethod() {

			driver = Driver.getDriver();
			action = new Actions(driver);
			
			driver.get(ConfigReader.getProperty("url"));

		}

		@AfterMethod(alwaysRun = true)
		public void tearDownMethod() {
			Driver.quit();
		}


	}

