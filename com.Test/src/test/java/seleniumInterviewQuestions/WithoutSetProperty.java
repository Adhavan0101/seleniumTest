package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class WithoutSetProperty {

	public static void main(String[] args) {

		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://www.google.com/");
		 */
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest test = extentReports.createTest("Tiruppur");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Tiruppur");
		driver.findElement(By.name("q")).submit();
		test.pass("Test Case Passed");
		driver.quit();
		extentReports.flush();

	}

}
