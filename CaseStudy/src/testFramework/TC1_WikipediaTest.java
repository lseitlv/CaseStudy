package testFramework;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1_WikipediaTest {
	
	private static FirefoxDriver driver;

	 @BeforeClass
     public static void openBrowser(){
         //Opening Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\edoslui\\Documents\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		} 
 
	 // Step 1 - load page and verify title
	 @Test
     public void loadPage()
     {
		 System.out.println("Starting TC1 Step 1 ");
	     driver.get("https://www.wikipedia.org/");	
	     String pageTitle = driver.getTitle();
	     Assert.assertEquals(pageTitle,"Wikipedia");
	     System.out.println("Ending TC1 step 1");
     }
 
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }

}
