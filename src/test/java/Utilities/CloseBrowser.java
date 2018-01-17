/**
 * 
 */
package Utilities;

import org.openqa.selenium.WebDriver;

/**
 * @author vamsiravi
 *
 */
public class CloseBrowser {

	public static void quit(WebDriver webDriver){
		webDriver.quit();
	}
	
	public static void close(WebDriver webDriver){
		webDriver.close();
	}
}
