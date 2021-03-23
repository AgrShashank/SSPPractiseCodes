
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) {

		// System.setProperty("webdriver.geko.driver",
		// "D:\\Automation-Selenium\\Softwares\\geckodriver.exe");
		// System.setProperty("webdriver.geko.driver",
		// "D:\\Automation-Selenium\\Softwares\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ssppureportal-devt.ssp-development.com/Pure.Portal/LoginPlatform.aspx");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@redinsurance.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("signupPassword")).sendKeys("Password@2018");
		
		driver.findElement(By.id("login_button")).click();
		// driver.findElement(By.className("username")).sendKeys("admin@redinsurance.com");
		// System.out.println(driver.getCurrentUrl());
		// driver.quit();
		
		//driver.findElement(By.id("nav-link")).click();                                           // Did not work
		//driver.findElement(By.xpath("//*[@title='Application Setting']")).click();             // Did not work
		//driver.findElement(By.xpath("//*[@id='nav-link']")).click();                           // Did not work
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);                        // Did not work
		//driver.findElement(By.xpath("//*[@class='d-flex align-items-center']")).click();       // Did not work
		//driver.findElement(By.xpath("//*[@id='ctl00_cntMainBody_btnSearch']"));                // Did not work
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_cntMainBody_btnSearch")).click();
				

	}

}