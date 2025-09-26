package testScripts;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;


public class LoginTest extends TestNGBase{
	@Test
	public void verifyLoginWithValidCredentials() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyLoginWithValidUsernameInvalidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
	}
	@Test
	public void verifyLoginWithInvalidUsernameValidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invaliduser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sasae");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyLoginWithInValidCredentials() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("user1");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_Key");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
	}

}
