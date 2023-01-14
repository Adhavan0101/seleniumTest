package com.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();

		String oldWindow = driver.getWindowHandle();

		WebElement newWindowOpen = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		newWindowOpen.click();
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(1));
		String url = driver.getCurrentUrl();
		System.out.println("The Current URL is : " + url);
		if (url.equals("https://www.leafground.com/dashboard.xhtml")) {
			System.out.println("TC Passed");
		} else {
			System.out.println("TC Failed");
		}

		driver.switchTo().window(oldWindow);

		WebElement numberOpenedTabs = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		numberOpenedTabs.click();
		int tabCount = driver.getWindowHandles().size();
		System.out.println("The Number of Opened Windows is " + tabCount);

		driver.switchTo().window(oldWindow);

		WebElement closeAllWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		closeAllWindows.click();
		Set<String> newWindows = driver.getWindowHandles();
		for (String allWindows : newWindows) {
			if (!allWindows.equals(newWindows)) {
				driver.switchTo().window(allWindows);
			}
		}

		driver.switchTo().window(oldWindow);

		WebElement waitForOpenTab = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span"));
		waitForOpenTab.click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Completed");
	}
}
