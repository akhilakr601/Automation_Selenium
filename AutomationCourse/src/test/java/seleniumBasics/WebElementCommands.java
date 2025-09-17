package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Hello..");
		WebElement showBtn = driver.findElement(By.id("button-one"));
		showBtn.click();
		WebElement msgTxt = driver.findElement(By.id("message-one"));
		System.out.println(msgTxt.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands cmd = new WebElementCommands();
		cmd.initializeBrowser();
		cmd.verifyCommands();
	}

}
