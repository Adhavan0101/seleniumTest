package seleniumInterviewQuestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");

		// Method 1

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// Method 2
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// method 3

		driver.get("https://www.google.com/");
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);

	}

}
