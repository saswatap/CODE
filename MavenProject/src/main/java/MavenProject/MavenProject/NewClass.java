package MavenProject.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

public class NewClass {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Automation\\Chromedriver\\chromedriver.exe"); 
		 WebDriver driver=new ChromeDriver();
		 System.out.println("xhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		 EyesRunner runner = new ClassicRunner();
		 Eyes eyes = new Eyes(runner);
		 eyes.setApiKey("Ui3tsdTgV3nxoBhLzVB1aY9e1064Bqcab0v6YWuzjiQrw110");
		 eyes.open(driver,"ABP App","Smoke Test13", new RectangleSize(800, 600));
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.abpweddings.com");
		 Thread.sleep(2000);
		 eyes.checkWindow("elect mother tongue");
		 eyes.checkWindow("Your trusted matchmaker");
		/* Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Happy stories that started with us");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Let's start your journey with us");
		    eyes.checkWindow("Sonali Das (AW43189591) & Santanu Goswami (AW59993536)");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		    eyes.checkWindow("Quick search across our members");
		    robot.keyPress(KeyEvent.VK_PAGE_DOWN);*/
		  driver.findElement(By.xpath("//a[text()='Login']")).click(); 
		  
		  driver.findElement(By.xpath("//input[@class='input login-email']")).sendKeys("AW29627030");
		 //eyes.checkWindow("login-ID");
		 driver.findElement(By.cssSelector("input.input.password.login-password")).sendKeys("paasword");
		 //input.input.password.login-password ////input[@id='new-pass1']
		 Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement element1=driver.findElement(By.xpath("//a[@class='nav-link home']"));
		eyes.checkElement(element1);
		    eyes.closeAsync();
		    //driver.quit();
		    eyes.abortIfNotClosed();
			
			TestResultsSummary allTestResults = runner.getAllTestResults();

			
			System.out.println(allTestResults);
			driver.close();

		    
		    
		

		 

	}

}
