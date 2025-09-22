package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		WebElement element = driver.findElement(By.id("others"));
		Actions action =  new Actions(driver);
		action.contextClick(element).build().perform();
	}
	public void verifyMouseOver() {
		WebElement element = driver.findElement(By.id("others"));
		Actions action =  new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragElem = driver.findElement(By.id("draggable"));
		WebElement dropElem = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragElem, dropElem).build().perform();
		
	}
 
	public void verifyKeyboardAction() throws AWTException {
		Robot robort = new Robot();
		robort.keyPress(KeyEvent.VK_CONTROL);
		robort.keyPress(KeyEvent.VK_T);
		robort.keyRelease(KeyEvent.VK_CONTROL);
		robort.keyRelease(KeyEvent.VK_T);
			
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions handlingActions = new HandlingActions();
		handlingActions.initializeBrowser();
//		handlingActions.verifyRightClick();
		handlingActions.verifyDragAndDrop();
		handlingActions.verifyMouseOver();
		try {
			handlingActions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
