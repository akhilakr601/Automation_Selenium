package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropLang = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropLang);
//		select.selectByIndex(1);
//		select.selectByValue("python");
		select.selectByVisibleText("SQL");
	}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBoxDrop = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkBoxDrop.click();
		
	}
	public void verifyRadioBtn() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='blue']"));
		radiobtn.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDown handlingDropdown = new HandlingDropDown();
		handlingDropdown.initializeBrowser();
//		handlingDropdown.verifyDropdown();
//		handlingDropdown.verifyCheckBox();
		handlingDropdown.verifyRadioBtn();
	}

}
