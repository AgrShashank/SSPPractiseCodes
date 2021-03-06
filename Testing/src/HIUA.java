import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HIUA {

	public static void main(String[] args) throws InterruptedException {

		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shashank.agrawal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssppureportal-devt.ssp-development.com/Pure.Portal/LoginPlatform.aspx");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("signupEmail")).sendKeys("admin@redinsurance.com");
		driver.findElement(By.id("signupPassword")).sendKeys("Password@2018");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("ctl00_cntMainBody_txtClientCode")).sendKeys("TESTINGDQJ");
		driver.findElement(By.xpath("//a[@id='ctl00_cntMainBody_btnSearch']")).click();
		driver.findElement(By.xpath("//a[@id='ctl00_cntMainBody_grdvSearchResults_ctl02_lnkDetails']")).click();
		WebElement prod = driver.findElement(By.id("ctl00_cntMainBody_ctrlNewQuoteImproved_ddlProductlst"));
		Select sel = new Select(prod);
		sel.selectByVisibleText("HIUA Phase 1 GLU");
		driver.findElement(By.xpath("//a[@id='ctl00_cntMainBody_ctrlNewQuoteImproved_btnNewQuote']")).click();
		Actions action = new Actions(driver);
		/*action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);*/
//		WebElement bSource =  driver.findElement(By.cssSelector("#ctl00_cntMainBody_POLICYHEADER__ANALYSISCODE"));
//		bSource.click();
//		Select bs = new Select(bSource);
//		bs.selectByVisibleText("Newspaper Advertising");
		Thread.sleep(1000);
		
//		  WebElement TParty =
//		  driver.findElement(By.cssSelector("#ctl00_cntMainBody_ddlThirdParty"));
//		  TParty.click(); Select TP = new Select(TParty); TP.selectByIndex(1);
		 
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Compliance']")).click();

		// Compliance screen

		WebElement TOS = driver.findElement(By.id("ctl00_cntMainBody_TYPE_OF_SALE"));
		Select s1 = new Select(TOS);
		s1.selectByVisibleText("Advised");
		WebElement MOS = driver.findElement(By.id("ctl00_cntMainBody_METHOD_OF_SALE"));
		Select s2 = new Select(MOS);
		s2.selectByVisibleText("Non Distance");
		driver.findElement(By.id("ctl00_cntMainBody_txtUnderwriter")).sendKeys("UnderWriter");
		WebElement TA = driver.findElement(By.id("ctl00_cntMainBody_ddlTermsAgreed"));
		Select s3 = new Select(TA);
		s3.selectByVisibleText("No");
		driver.findElement(By.id("ctl00_cntMainBody_btnNext")).click();
		

		// DATA CAPTURE SCREEN

		driver.switchTo().frame("dqjIframe");
		driver.switchTo().frame("QMIframe");
		
		// 1st tab
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_INSURED"))
				.sendKeys("Sandeep");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_TRADING_NAME"))
				.sendKeys("Sandeep");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_TELEPHONE_NUM"))
				.sendKeys("1234567890");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_CONTACT_NAME"))
				.sendKeys("Sandeep Sharma");
		WebElement CS = driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_COMPANY_STATUS"));
		Select s0 = new Select(CS);
		s0.selectByVisibleText("Limited Company (LTD)");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE1"))
				.sendKeys("Line1");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE2"))
				.sendKeys("Line2");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE3"))
				.sendKeys("Line3");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE4"))
				.sendKeys("Line4");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_POSTCODE"))
				.sendKeys("LA1 1LA");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_0_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_Component_ADDRESS_CNT_COUNTRYCODE"))
				.sendKeys("gbr");
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_0_T")).click();

		// 2nd tab

		Thread.sleep(2000);
		WebElement cType = driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_COVER_TYPE"));
		Select coverType = new Select(cType);
		coverType.selectByVisibleText("Guest House");
		Thread.sleep(1000);
		// action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_AT_THIS_PREMISES"))
				.sendKeys("5");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_GENERAL_DETAILS_ELSEWHERE"))
				.sendKeys("5");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE1"))
				.sendKeys("Line1");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE2"))
				.sendKeys("Line2");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE3"))
				.sendKeys("Line3");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_ADDRESS_LINE4"))
				.sendKeys("Line4");
		
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_POSTCODE"))
				.sendKeys("LA1 1LA");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_1_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_rISK_DETAILS_Component_ADDRESS_CNT_COUNTRYCODE"))
				.sendKeys("gbr");
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_1_T")).click();
		// 3rd tab
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_2_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_GOOD_STATE_OF_rEPAIR_0"))
				.click();
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_2_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_AGE_OF_BUILDING"))
				.sendKeys("2010");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_2_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_ARE_ALL_THE_WALLS_0"))
				.click();
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_2_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_ARE_ALL_rOOFS_0"))
				.click();
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_2_T")).click();
		// 4th tab
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_3_T")).click();
		// 5th tab
		Thread.sleep(2000);
		WebElement SOS = driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_4_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUBSIDENCE_ASSESSMENT_STATE_OF_SITE"));
		Select s4 = new Select(SOS);
		s4.selectByVisibleText("Gently sloping");

		WebElement foundation = driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_4_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUBSIDENCE_ASSESSMENT_FOUNDATIONS"));
		Select s5 = new Select(foundation);
		s5.selectByVisibleText("Piled foundations");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_4_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUBSIDENCE_ASSESSMENT_WATERCOURSES_0"))
				.click();
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_4_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUBSIDENCE_ASSESSMENT_CLIFFS_0"))
				.click();
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_4_T")).click();
		// 6th tab
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_5_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_6_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_7_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_TURNOVER"))
				.sendKeys("2000");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_7_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_BUILDING_CONSTRUCTION_LETTING_BEDROOMS"))
				.sendKeys("2");

		// 6A tab
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_7_T")).click();

		// 7th Tab

		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_8_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_TOTAL_WINE"))
				.sendKeys("2000");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_8_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_TOTAL_COMPUTER"))
				.sendKeys("2000");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_8_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_FROZEN_FOOD"))
				.sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_8_T")).click();
		// 8th tab
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_9_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_INCCIT"))
				.sendKeys("2000");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_9_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_INCCIS"))
				.sendKeys("2000");
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_9_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_GH_MAKE_MODEL_SAFE"))
				.sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_9_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#C1__Screen_SSd_90_10_T__DATA_SET_rISK_OBJECTS_Component_HIUAGH_POLICY_BINDER_Component_SUMS_INSURED_HH_BUILDINGS"))
				.sendKeys("10000");
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_10_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_11_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_12_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_13_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_14_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_15_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_16_T")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#C1__Continue-Screen_SSd_90_17_T")).click();

	}

}
