package ankitlearning.Mavanjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReports {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		
		
	}

	
	@Test
	public void FirstTest()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
	}
}
