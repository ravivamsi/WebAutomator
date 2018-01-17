/**
 * 
 */
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * @author vamsiravi
 *
 */
public class MouseActions {
	
	public static void focusElement(WebDriver webDriver, WebElement webElement){
		Actions actionsBuilder = new Actions(webDriver);
		Action mouseOver = actionsBuilder.moveToElement(webElement).build();
		mouseOver.perform();
	}
	
	public static void doubleClickElement(WebDriver webDriver, WebElement webElement){
		Actions actionsBuilder = new Actions(webDriver);
		Action mouseOver = actionsBuilder.doubleClick(webElement).build();
		mouseOver.perform();
	}
	
	public static void clickHoldElement(WebDriver webDriver, WebElement webElement){
		Actions actionsBuilder = new Actions(webDriver);
		Action mouseOver = actionsBuilder.clickAndHold(webElement).build();
		mouseOver.perform();
	}
	
	public static void mouseReleaseElement(WebDriver webDriver, WebElement webElement){
		Actions actionsBuilder = new Actions(webDriver);
		Action mouseOver = actionsBuilder.release(webElement).build();
		mouseOver.perform();
	}
	
	public static void dragAndDrop(WebDriver webDriver, WebElement source, WebElement target){
		Actions actionsBuilder = new Actions(webDriver);
		Action mouseOver = actionsBuilder.dragAndDrop(source, target).build();
		mouseOver.perform();
	}
	
}
