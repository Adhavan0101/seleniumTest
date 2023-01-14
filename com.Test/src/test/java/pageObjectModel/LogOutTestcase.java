package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogOutTestcase {

	@Test
	public void logOut() {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		PageFactory.initElements(driver, LoginAdvanced.class);

		LoginAdvanced.userName.sendKeys("student");
		LoginAdvanced.password.sendKeys("Password123");
		LoginAdvanced.submit.click();

		PageFactory.initElements(driver, LogoutAdvanced.class);

		LogoutAdvanced.logOut.click();
		driver.quit();

		/*
		 * LogoutPOM.userName(driver).sendKeys("student");
		 * LogoutPOM.password(driver).sendKeys("Password123");
		 * LogoutPOM.submit(driver).click(); LogoutPOM.logOut(driver).click();
		 * driver.quit();
		 */
		/*
		 * WebElement userName =
		 * driver.findElement(By.xpath("//input[@id=\'username\']"));
		 * userName.sendKeys("student"); WebElement passWord =
		 * driver.findElement(By.xpath("//input[@id=\'password\']"));
		 * passWord.sendKeys("Password123"); WebElement submit =
		 * driver.findElement(By.xpath("//button[@id=\'submit\']")); submit.click();
		 * 
		 * WebElement logOut = driver.findElement(By.xpath(
		 * "//a[@href=\"https://practicetestautomation.com/practice-test-login/\"]"));
		 * logOut.click();
		 */
	}
}
