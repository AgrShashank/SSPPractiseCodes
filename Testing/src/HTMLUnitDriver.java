import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ssppureportal-devt.ssp-development.com/Pure.Portal/LoginPlatform.aspx");

		System.out.println("Title before Login is "+driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("admin@redinsurance.com");	
		driver.findElement(By.id("signupPassword")).sendKeys("Password@2018");		
		driver.findElement(By.id("login_button")).click();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(15000);
		
		System.out.println("Title after Login is "+driver.getTitle());
		driver.quit();
	}
}
