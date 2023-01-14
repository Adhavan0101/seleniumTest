package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPOM {

	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id=\'username\']"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id=\'password\']"));
	}

	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id=\'submit\']"));
	}

	public static WebElement logOut(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/practice-test-login/\"]"));
	}
}
