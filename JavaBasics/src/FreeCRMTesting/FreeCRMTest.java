package FreeCRMTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMTest {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chromer.driver", "C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
		String adminCredentials = Data.getUserLoginInfo().get("admin");
		String adminInfo[] = adminCredentials.split("_");
		driver.findElement(By.name("username")).sendKeys(adminInfo[0]);
		driver.findElement(By.name("password")).sendKeys(adminInfo[1]);
		
		
		
	
	}

}
