package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Method 1 -> Get Method

		driver.get("https://www.google.com/");

		// Method 2 -> Navigate Method

		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Sun" + Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
