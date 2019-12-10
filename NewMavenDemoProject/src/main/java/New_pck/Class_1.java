package New_pck;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.*;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;


public class Class_1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Automation\\Chromedriver\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		// Initialize the Runner for your test.
		 EyesRunner runner = new ClassicRunner();

		 // Initialize the eyes SDK
		 Eyes eyes = new Eyes(runner);

		 // Change the APPLITOOLS_API_KEY API key with yours
		 eyes.setApiKey("APPLITOOLS_API_KEY");
		 eyes.open(driver,"ABP App","Smoke Test8", new RectangleSize(800, 600));
		 driver.manage().window().maximize();

		// Navigate the browser to the "ACME" demo app.
		driver.get("https://www.abpweddings.com");
		eyes.checkWindow("elect mother tongue");
		eyes.checkWindow("Your trusted matchmaker");
		Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Happy stories that started with us");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Let's start your journey with us");
		    eyes.checkWindow("Sonali Das (AW43189591) & Santanu Goswami (AW59993536)");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Quick search across our members");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		eyes.closeAsync();

		// Close the browser.
		driver.quit();
Thread.sleep(1000);
		// If the test was aborted before eyes.close was called, ends the test as
		// aborted.
		eyes.abortIfNotClosed();
		// Wait and collect all test results
		TestResultsSummary allTestResults = runner.getAllTestResults();

		// Print results
		System.out.println(allTestResults);
		driver.close();



		
	}

}
