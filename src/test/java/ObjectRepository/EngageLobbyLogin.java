/**
 * 
 */
package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import TestData.EngageCredentails;
import Utilities.Anesthesia;
import Utilities.Highlighter;

/**
 * @author vamsiravi
 *
 */
public class EngageLobbyLogin {
	
	
	
	public WebElement getUserId(WebDriver webDriver){
		return webDriver.findElement(By.id("txtUserID"));
	}
	 
	public WebElement getPasswordElement(WebDriver webDriver){
		return webDriver.findElement(By.id("txtPassword"));
	}
	
	public WebElement getSignInElement(WebDriver webDriver){
		return webDriver.findElement(By.id("btnLogin"));
	}

	public WebElement getSignInElementTest(WebDriver webDriver){
		return webDriver.findElement(By.xpath("/html/body/div[3]/form/button"));
	}
	
	// Actions that can be performed with the Objects
		public void lobbyLoginActions(WebDriver webDriver, ExtentTest test){
			Highlighter.verifyElement(this.getUserId(webDriver), webDriver);
			this.getUserId(webDriver).click();
			Anesthesia.sleep(1);
//			this.getUserId(webDriver).sendKeys(engageTestData.getStageUsername());
			test.log(LogStatus.PASS, "The User ID Element is verified");
			Highlighter.verifyElement(this.getPasswordElement(webDriver), webDriver);
			this.getPasswordElement(webDriver).click();
			Anesthesia.sleep(1);
//			webDriver.findElement(By.id("txtPassword")).sendKeys(engageTestData.getStagePassword());
			test.log(LogStatus.PASS, "The Password Element is verified");
			Anesthesia.sleep(1);
		}
		
		public void lobbyLoginButtonClick(WebDriver webDriver, ExtentTest test){
			Highlighter.verifyElement(this.getSignInElement(webDriver), webDriver);
			this.getSignInElement(webDriver).click();
			test.log(LogStatus.PASS, "The SignIn Element is verified");
		}
		
		
/*
 * 
 * Junk 		
 */
//		txtUserID
//		//*[@id="txtUserID"]
	//	
//		txtPassword
//		//*[@id="txtPassword"]
	//	
//		//*[@id="btnLogin"]

}
