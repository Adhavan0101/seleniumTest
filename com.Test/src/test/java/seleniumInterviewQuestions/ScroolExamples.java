package seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();

		// 1. Scroll To particular Position (X,Y)

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.scroll(0,600)", "");
		Thread.sleep(4000);
		executor.executeScript("window.scroll(0,-650)", "");

		// 2. Go To The Bottom Page

		executor.executeScript("window.scrollTo(0,document.body.scroll-Height)", "");
		Thread.sleep(4000);
		executor.executeScript("window.scrollTo(0,0)", "");

		// 3. Go To A Specific Element Position

		WebElement link = driver.findElement(By.partialLinkText("online tool"));
		executor.executeScript("arguments[0].scrollIntoView(true)", link);

		// 4. Robot Class

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
