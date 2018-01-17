/**
 * 
 */
package TestSuites;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Configuration.PathConfiguration;
//import ObjectRepository.ICJApplicationLoginLogout;
//import TestData.ICJTestDataCredentials;
import Utilities.Anesthesia;
import Utilities.DateStringConverter;
import Utilities.GetScreenShot;
import resources.base;

/**
 * @author vamsiravi
 *
 */
public class SeleniumGrid extends base{
//	ICJTestDataCredentials testData = new ICJTestDataCredentials();
//	ICJApplicationLoginLogout icjApplicationRepository = new ICJApplicationLoginLogout();
	PathConfiguration pathConfig = new PathConfiguration();
	
	ExtentReports extentReports;
	
	ExtentTest test;
	
	String reportDirectoryPath = pathConfig.getReportsDirectory()+this.getClass().getName()+File.separator+DateStringConverter.dateStringConverter()+File.separator;
	
	public static WebDriver webDriver;
	
	@BeforeTest
	public void init() throws IOException{
		System.out.print("The output directory of the report is "+ reportDirectoryPath);
	}
	
	@Test(enabled=false)
	public void icjApplicationLoginAndVerifyQuickSearch() throws AWTException, IOException, InterruptedException{
		
		extentReports = new ExtentReports(reportDirectoryPath+"QuickSearchReport.html");

		webDriver =initializeDriver();

		webDriver.manage().window().maximize();
		
		test = extentReports.startTest("ICJ Quick Search");

		//Get URL 
//		webDriver.get(testData.getIcjstageurl());
		
		Anesthesia.sleep(2);
		

//		icjApplicationRepository.lobbyLoginActions(webDriver, test);
		
		
		// Screenshot of the Lobby Login
		String lobbyLoginPageScreenshotPath = GetScreenShot.capture(webDriver, "lobbyLoginPageScreenshotPath", reportDirectoryPath);
		test.log(LogStatus.PASS, "The Lobby Login has ID and Password"+test.addScreenCapture(lobbyLoginPageScreenshotPath));
		
		// Sign In Button Click
//		icjApplicationRepository.lobbyLoginButtonClick(webDriver, test);
	
		
		// Screenshot of the Location Next
		String loginNextPageScreenshotPath = GetScreenShot.capture(webDriver, "loginNextPageScreenshotPath", reportDirectoryPath);
		test.log(LogStatus.PASS, "The Lobby Login is successful"+test.addScreenCapture(loginNextPageScreenshotPath));
		
		
		// Location Next Button 
//		icjApplicationRepository.locationSelection(webDriver, test);
		
		
		String quickSearchVerifyPopupScreenShotPath = GetScreenShot.capture(webDriver, "quickSearchVerifyPopupScreenShotPath", reportDirectoryPath);
		test.log(LogStatus.PASS, "The QuickSearch is verified"+test.addScreenCapture(quickSearchVerifyPopupScreenShotPath));
		
		// Logout of the Application
//		icjApplicationRepository.logoutOfICJApplication(webDriver, test);
		
		String icjLogoutVerificationScreenshot = GetScreenShot.capture(webDriver, "icjLogoutVerificationScreenshot", reportDirectoryPath);
		test.log(LogStatus.PASS, "The Logout is verified"+test.addScreenCapture(icjLogoutVerificationScreenshot));
		
		Utilities.CloseBrowser.quit(webDriver);
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			String screenshotPath = GetScreenShot.capture(webDriver, "screenshotForExtentReport");
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Screenshot below"+test.addScreenCapture(screenshotPath));
			
		}
		extentReports.endTest(test);

		extentReports.flush();
		extentReports.close();
	}
	
	@AfterTest
	public void endReport(){
//			
//			extentReports.flush();
//			extentReports.close();
	}
	
}
