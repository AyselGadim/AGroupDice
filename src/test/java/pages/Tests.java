
	package pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Tests {
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				driver.get("https://www.dice.com");
				
				driver.findElement(By.cssSelector("[type='search']")).sendKeys("SDET");
				driver.findElement(By.id("google-location-search")).sendKeys("Austin");
				driver.findElement(By.id("submitSearch-button")).click();
		
		

	}
	}

