package seleniumInterviewQuestions;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.friver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/alert.xhtml");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

		File fileLocation = new File("E:\\Adhavan\\ScreenShot01"); 
	
		// FileUtils.copyFile(SrcFile, DestFile);


		WebElement simpleDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		simpleDialog.click();

	}

}
