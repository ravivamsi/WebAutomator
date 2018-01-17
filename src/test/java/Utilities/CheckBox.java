/**
 * 
 */
package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author vamsiravi
 *
 */
public class CheckBox {

	public void selectCheckbox(WebElement webElement){
		try{
			if(!webElement.isSelected()){
				webElement.click();
			}else{
				System.out.println("Checkbox "+ webElement + "is already selected");
			}
		}catch(Exception exception){
			System.out.println("Unable to select the checkbox: "+webElement);
			System.out.println(exception);
		}
	}
	
	
	
	public void deselectCheckbox(WebElement webElement){
		try{
			if(webElement.isSelected()){
				webElement.click();
			}else{
				System.out.println("Checkbox "+ webElement + "is already deselected");
			}
		}catch(Exception exception){
			System.out.println("Unable to select the checkbox: "+webElement);
			System.out.println(exception);
		}
	}
	
	
	public void selectCheckboxFromList(WebElement webElement, String valueToSelect){
		
		List<WebElement> allCheckBoxes = webElement.findElements(By.tagName("input"));
		
		for(WebElement checkBox :allCheckBoxes){
			if(valueToSelect.equalsIgnoreCase(checkBox.getText())){
				checkBox.click();
				break;
			}
		}
	}
}
