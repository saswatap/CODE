package override;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

public class Final_Demo {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Automation\\Chromedriver\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		 EyesRunner runner = new ClassicRunner();

			
			Eyes eyes = new Eyes(runner);
			eyes.setApiKey("AHNzXf1032YpHTZJ2lgd4IZB3mbXOupqFFbzBeMGLLePw110");
			eyes.open(driver, "ABP App", "Smoke Test8", new RectangleSize(800, 600));
			driver.manage().window().maximize();
			driver.get("https://www.abpweddings.com");
			//driver.get("https://testeem.abpweddings.com");
			eyes.checkWindow("Select mother tongue");
			//driver.findElement(By.xpath("//a[text()='Login']"));
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
			    //robot.keyPress(KeyEvent.VK_PAGE_UP);
			    driver.findElement(By.xpath("//a[text()='Login']")).click();
			     
				 //driver.findElement(By.xpath("//input[@class='input login-email']")).sendKeys("AW29627030");
				 //eyes.checkWindow("login-ID");
				 //driver.findElement(By.xpath("//input[@class='input password login-password']")).sendKeys("paasword");
				//driver.findElement(By.xpath("//button[text()='Login']")).click();
			    
			// End the test.
			eyes.closeAsync();
			driver.quit();

			// Close the browser.
			
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
