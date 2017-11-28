package testFramework;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1_WikipediaTest_v2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\edoslui\\Documents\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Step 1: Load page and verify page title
		driver.get("https://www.wikipedia.org/");
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Wikipedia") ) {
			System.out.println("Step 1 passed - page title matches the expected.");
		} else {
			System.out.println("Step 1 failed - page title doesn't match the expected.");
		}
		
		// Step 1: search and verify suggestion
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='searchInput']"));
		searchBox.sendKeys("furry rabbits");
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/button"));
		searchButton.click();
		
		WebElement searchSuggestion = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[1]"));
		if (searchSuggestion.isDisplayed()) {
			if (searchSuggestion.getText().contains("Did you mean")) {
				System.out.println("Step 2 passed - search suggestion displayed.");
			} else {
				System.out.println("Step 2 failed - search suggestion wasn't displayed.");
			}
		} else {
			System.out.println("Step 2 failed - search suggestion wasn't displayed.");
		}
		
		driver.quit();
	}
}
