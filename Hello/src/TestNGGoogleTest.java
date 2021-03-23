import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void getTitle(){
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void getCurrentURL(){
		String url = driver.getCurrentUrl();
		System.out.println("URL is"+url);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
