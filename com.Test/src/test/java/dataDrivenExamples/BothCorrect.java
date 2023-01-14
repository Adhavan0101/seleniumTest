package dataDrivenExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect {

	@Test
	@Parameters({"userName","passWord"})
	public void BothCorrectUserNamePassword(String user1, String pass1) {

		System.setProperty("webdeiver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		userName.sendKeys(user1);
		WebElement passWord = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passWord.sendKeys(pass1);
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		submit.click();

		driver.quit();
	}

}
