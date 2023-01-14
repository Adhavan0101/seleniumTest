package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
		"E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.quit();
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver",
		"E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		//driver.quit();
	}
}
