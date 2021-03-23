import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {

		// System.setProperty("webdriver.geko.driver",
		// "D:\\Automation-Selenium\\Softwares\\geckodriver.exe");
		// System.setProperty("webdriver.geko.driver",
		// "D:\\Automation-Selenium\\Softwares\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssppureportal-devt.ssp-development.com/Pure.Portal/LoginPlatform.aspx");

		String t = driver.getTitle();

		System.out.println("Title of the page that you had opened in Chrome Browser is: " +t);

		if (t.equals("Authentication Interface")) {
			System.out.println("Testing Passed as the Title name is displaying as per expected result.");
		}

		else {
			System.out.println("Testing failed as the Title name is not displaying as per expected result.");
		}
		
		//System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		System.out.println("Chrome Browser closed successfully.");

	}

}
