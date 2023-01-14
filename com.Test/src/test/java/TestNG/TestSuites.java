package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuites {

	WebDriver driver;
	long startBrowser;
	long endBrowser;

	@BeforeSuite
	public void openBrowser() {

		startBrowser = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void chromeBrowswer() {

		driver.get("https://www.google.com/");

	}

	@Test
	public void bingBrowser() {

		driver.get("https://www.bing.com/");

	}

	@Test
	public void yahooBrowser() {

		driver.get("https://in.search.yahoo.com/");

	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

		endBrowser = System.currentTimeMillis();
		long exactBrowserTime = endBrowser - startBrowser;
		System.out.println("Total Browser Time : " + exactBrowserTime);
	}

}
