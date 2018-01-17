/**
 * 
 */
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author vamsiravi
 *
 */
public class DropDownSelector {
	
	/*
	 * This function can click on the drop down and select the value 
	 */
	public static void populateAndSelectDropDownByValue(WebDriver driver, WebElement webElement, String value) {
		Select select = new Select(webElement);
		select.selectByValue(value);
	}
	
	public static void populateAndSelectDropDownByIndexValue(WebDriver driver, WebElement webElement, int indexValue) {
		Select select = new Select(webElement);
		select.selectByIndex(indexValue);
	}
	
	public static void populateAndSelectDropDownByVisibleText(WebDriver driver, WebElement webElement, String visibleText) {
		Select select = new Select(webElement);
		select.selectByVisibleText(visibleText);
	}

	public static void deselectDropDownByValue(WebDriver driver, WebElement webElement, String value) {
		Select select = new Select(webElement);
		select.deselectByValue(value);
	}
	
	public static void deselectDropDownByIndexValue(WebDriver driver, WebElement webElement, int indexValue) {
		Select select = new Select(webElement);
		select.deselectByIndex(indexValue);
	}
	
	public static void deselectDropDownByVisibleText(WebDriver driver, WebElement webElement, String visibleText) {
		Select select = new Select(webElement);
		select.deselectByVisibleText(visibleText);
	}
	
	public static void deselectAll(WebDriver driver, WebElement webElement){
		Select select = new Select(webElement);
		select.deselectAll();
	}
}
