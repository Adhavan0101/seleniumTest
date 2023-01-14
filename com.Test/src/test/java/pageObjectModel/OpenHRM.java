package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenHRM {

	WebDriver driver;

	@Test
	public void openHRM() {

		try {
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			List<WebElement> count = driver.findElements(By.tagName("iframe"));
			int iframeCount = count.size();
			System.out.println("The Iframe Count Is : " + iframeCount);

			/*
			 * WebElement userName = driver.findElement(By.name("username"));
			 * userName.sendKeys("Admin");
			 */
			driver.switchTo().activeElement().sendKeys("Admin");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("Password123");
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			
		} finally {
			//driver.close();
		}
	}
}
