package testFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1_WikipediaTest {

	public static void main(String[] args) throws InterruptedException {
		//Opening Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\edoslui\\Documents\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		 
		//Thread.sleep(10000);
		
		//Closing the browser at the end of the TC
		driver.quit();

	}

}
