import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldDefaultName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String text = driver.findElement(By.id("search")).getAttribute("placeholder");
		System.out.println(text);
		driver.quit();
	}

}
