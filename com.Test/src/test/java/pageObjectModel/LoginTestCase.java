package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, LoginAdvanced.class);
		LoginAdvanced.userName.sendKeys("student");
		LoginAdvanced.password.sendKeys("Password123");
		LoginAdvanced.submit.click();
		driver.quit();

		/*
		 * LoginPOM.userName(driver).sendKeys("student");
		 * LoginPOM.password(driver).sendKeys("Password123");
		 * LoginPOM.submit(driver).click(); driver.quit();
		 */

		/*
		 * WebElement userName =
		 * driver.findElement(By.xpath("//input[@id=\'username\']"));
		 * userName.sendKeys("student"); WebElement passWord =
		 * driver.findElement(By.xpath("//input[@id=\'password\']"));
		 * passWord.sendKeys("Password123"); WebElement submit =
		 * driver.findElement(By.xpath("//button[@id=\'submit\']")); submit.click();
		 */

	}

}
