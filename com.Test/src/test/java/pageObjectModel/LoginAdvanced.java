package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAdvanced {

	@FindBy(xpath = "//input[@id=\'username\']")
	public static WebElement userName;
	
	@FindBy(xpath = "//input[@id=\'password\']")
	public static WebElement password;
	
	@FindBy(xpath = "//button[@id=\'submit\']")
	public static WebElement submit;

	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@id=\'username\']")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@id=\'password\']")); }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//button[@id=\'submit\']")); }
	 */
}
