package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsExample {

	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter reporter;
	ExtentTest testCase;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		extentReports = new ExtentReports();
		reporter = new ExtentSparkReporter("ExtentReport.html");
		extentReports.attachReporter(reporter);

		driver = new ChromeDriver();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReports.flush();
	}

	@Test
	public void openGoogle() throws IOException {

		testCase = extentReports.createTest("Verify Google Tile");
		testCase.log(Status.INFO, "Navigating To Google");
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		
		testCase.log(Status.INFO, "Actual Title : " + title);
		testCase.log(Status.INFO, "Expected Title : " + "Google");
		testCase.log(Status.INFO, "Verify Actual & Expected Title"); 
		
		if (title.equals("Google")) {
			testCase.log(Status.PASS, "Actual & Expected Tile Are Equal");
		} else {
			testCase.log(Status.FAIL, "Actual & Expected Tile Are Not Equal");

			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File fileLocation = new File("google.png");
			FileHandler.copy(sourceFile, fileLocation);
			testCase.addScreenCaptureFromPath("google.png");
		}
	}

	@Test
	public void openBing() throws IOException {

		testCase = extentReports.createTest("Verify Bing Tile");
		testCase.log(Status.INFO, "Navigating To Bing");
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		
		testCase.log(Status.INFO, "Actual Title : " + title);
		testCase.log(Status.INFO, "Expected Title : " + "bing");
		testCase.log(Status.INFO, "Verify Actual & Expected Title");
		
		if (title.equals("bing")) {
			testCase.log(Status.PASS, "Actual & Expected Tile Are Equal");
		} else {
			testCase.log(Status.FAIL, "Actual & Expected Tile Are Not Equal");

			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File fileLocation = new File("bing.png");
			FileHandler.copy(sourceFile, fileLocation);
			testCase.addScreenCaptureFromPath("bing.png");
		}
	}
}
