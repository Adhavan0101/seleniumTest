package seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserRefreshExample {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// method 1 -> Refresh Command

		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sun");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();

		// Method 2 -> Get Current URL

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sun");
		Thread.sleep(3000);
		driver.get(driver.getCurrentUrl());
		driver.close();

		// Method 3 -> Java script executor

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sun");
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("Location.reload()");
		driver.close();

		// Method 4 -> Robot Class

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sun");
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

	}

}
