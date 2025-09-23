package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert al = driver.switchTo().alert();
//		al.dismiss();
		al.accept();

		
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("helloo");
		al.accept();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertHandling = new AlertHandling();
		alertHandling.initializeBrowser();
		alertHandling.verifySimpleAlert();
		alertHandling.verifyConfirmAlert();
		alertHandling.verifyPromptAlert();
		

	}

}
