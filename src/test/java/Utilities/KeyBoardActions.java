/**
 * 
 */
package Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * @author vamsiravi
 *
 */
public class KeyBoardActions {

	public static void pressKey(WebDriver webDriver, Keys key){
		Actions actionsBuilder = new Actions(webDriver);
		Action keyBoardAction = actionsBuilder.keyDown(key).build();
		keyBoardAction.perform();
	}
	
	public static void releaseKey(WebDriver webDriver, Keys key){
		Actions actionsBuilder = new Actions(webDriver);
		Action keyBoardAction = actionsBuilder.keyUp(key).build();
		keyBoardAction.perform();
	}
}
