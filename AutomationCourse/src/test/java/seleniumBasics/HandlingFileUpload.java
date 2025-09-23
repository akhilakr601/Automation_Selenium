package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileBtn = driver.findElement(By.id("uploadfile_0"));
		chooseFileBtn.sendKeys("C:\\Users\\USER\\git\\Automation_Selenium\\AutomationCourse\\src\\test\\resources\\OD329412897252743100.pdf");
		
		WebElement checkboxTerms = driver.findElement(By.id("terms"));
		checkboxTerms.click();
		
		WebElement submitBtn = driver.findElement(By.id("submitbutton"));
		submitBtn.click();
	}
	public void verifyFileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileUploadBtn = driver.findElement(By.id("pickfiles"));
		fileUploadBtn.click();
		
		StringSelection stringselect = new StringSelection("C:\\Users\\USER\\git\\Automation_Selenium\\AutomationCourse\\src\\test\\resources\\OD329412897252743100.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		
		
		Robot r=new Robot();
		r.delay(2500);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		HandlingFileUpload handlingFileUpload = new HandlingFileUpload();
		handlingFileUpload.initializeBrowser();
//		handlingFileUpload.verifyFileUploadUsingSendKeys();
		try {
			handlingFileUpload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
