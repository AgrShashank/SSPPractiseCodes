import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup(){
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeTest
	public void login(){
		System.out.println("Before Test Annotation");
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Before Class Annotation");
	}

	@BeforeMethod
	public void enterURL(){
		System.out.println("Before Method Annotation");
	}
	
	@Test
	public void googleTitle(){
		System.out.println("Test Anotation, this is my 1st TestCase");
	}
	
	@Test
	public void navigateTo(){
		System.out.println("Test Annotation, this is my 2nd TC");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("After Method Annotation");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("After Class Annotation");
	}
	
	@AfterTest
	public void clearCookies(){
		System.out.println("After Test Annotation");
	}
	
	@AfterSuite
	public void generateReport(){
		System.out.println("After Suite Annotation");
	}
	
}
