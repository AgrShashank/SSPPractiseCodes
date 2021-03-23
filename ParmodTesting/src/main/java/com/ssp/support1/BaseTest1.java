package com.ssp.support1;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.NetworkMode;

import br.com.softplan.security.zap.api.authentication.WebDriverFactory;
import net.sourceforge.htmlunit.corejs.javascript.Context;

public class BaseTest1 {
	
	/*
	 * This class will contain the methods that will run BeforeSuite, BeforeMethod, AfterSuite and AfterMethod.
	 * It also has the Method to load the properties files and read the URLs and login credentials.
	 * It also has the initialization of the variables and methods to add Test Info in all the test cases.
	 *  **************Base Test1 is inherited (extended) by all the Test Case Classes********************
	 */
	
	protected static ExtentReports extent;
	protected String website = null;
	protected String browser = null;
	protected WebDriver driver = null;
	protected ExtentTest extentReport = null;
	protected HashMap<String, String> testData = new HashMap<String, String>();
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	@BeforeSuite (alwaysRun = true)
	public static void Reportlaunch(){
		extent = new ExtentReports("target/surefire-reports/TestReport1.html", true,
		        DisplayOrder.OLDEST_FIRST, NetworkMode.ONLINE);
		Reporter.getCurrentTestResult().getTestContext().getSuite().setAttribute("policy_number","");
	}
	
	@BeforeMethod (alwaysRun=true)
	public static void init(ITestContext context){
		browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
		website = context.getCurrentXmlTest().getParameter("website");
		driver = WebDriverFactory.get(browser);	
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeAll() {
	    driver.manage().deleteAllCookies();
	    //driver.quit();
	}
	
	@AfterSuite (alwaysRun = true)
	public static void afterSuite(){
		extent.flush();
		String env = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("env"); 
		File reportFolder = new File("test-reports/TestReports");
	    File reportSourceFile = new File("target/surefire-reports/TestReport.html");
	    File reportScreenshotFile = new File("target/surefire-reports/ScreenShot");
	    File reportScreenshotSourceFile = new File("test-output/ScreenShot");
	    
	 
	 try{
		 reportFolder = F
		 
	 }
	    
	}
	
	
}	
	
