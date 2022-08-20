/**
 * @author Mawaddah Hanbali
 */
package ass2W10D3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromWhebDriverAss2W10D3 {
	public WebDriver driver;

	/**
	 * Set up browser settings
	 */

	@BeforeSuite
	public void setUp() {
		// open the broswer
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	/**
	 * open the website
	 */

	@BeforeTest
	public void openWebsite() {

		// Navigate to a WebSite
		driver.navigate().to("https://demoqa.com/frames");

		// Maximize current window
		driver.manage().window().maximize();
	}

	/**
	 * Test frame
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void frame() throws InterruptedException {
		
		// total number of iFrames on a web page
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		// total number of iFrames on a web page
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		
		// Switch to Frame using Index
		driver.switchTo().frame(0);

		// Identifying the heading in webelement
		WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));

		// Finding the text of the heading
		String frame1Text = frame1Heading.getText();

		// Print the heading text
		System.out.println("The text of the heading "+frame1Text);

		// Do all the required tasks in the frame 0
		// Switch back to the main window
		driver.switchTo().defaultContent();

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterSuite
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
