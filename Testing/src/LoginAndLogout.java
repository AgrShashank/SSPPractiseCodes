import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndLogout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ssppureportal-devt.ssp-development.com/Pure.Portal/LoginPlatform.aspx");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@redinsurance.com");
		driver.findElement(By.id("signupPassword")).sendKeys("Password@2018");		
		driver.findElement(By.id("login_button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='nav-link']")).click();
		clickOn(driver, driver.findElement(By.xpath("//a[contains(text(),'Logout')]")), 30 );
		
		//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Code worked till here..");
		driver.quit();
	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
}
