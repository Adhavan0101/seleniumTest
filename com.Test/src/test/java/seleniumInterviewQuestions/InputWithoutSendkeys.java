package seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendkeys {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Method 1 - With Send keys

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");

		// Method 2 - java Script Executor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementsByName('q')[0].value='selenium'", "");

		// Method 3 - java Script Executor with web element
		executor.executeScript("arguments[0].value='Tiruppur'", searchBox);

		// method 4 - Robot Class
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

	}

}
