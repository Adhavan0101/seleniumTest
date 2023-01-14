package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\Adhavan\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();

		WebElement takeMeToDashboard = driver.findElement(By.linkText("Go to Dashboard"));
		takeMeToDashboard.click();
		Thread.sleep(3000);

		driver.navigate().back();

		WebElement findMyDestination = driver.findElement(By.partialLinkText("Find the URL"));
		String destination = findMyDestination.getAttribute("href");
		System.out.println("Find the URL without clicking me " + destination);

		WebElement brokenLink = driver.findElement(By.partialLinkText("Broken?"));
		brokenLink.click();
		Thread.sleep(3000);
		String linkTitle = driver.getTitle();
		if (linkTitle.contains("Error 404")) {
			System.out.println("The Link Is Broken");
		}

		driver.navigate().back();

		WebElement takeMeToDashboard1 = driver.findElement(By.linkText("Go to Dashboard"));
		takeMeToDashboard1.click();

		driver.navigate().back();

		List<WebElement> linksInThisPage = driver.findElements(By.tagName("a"));
		int linksCount = linksInThisPage.size();
		System.out.println("Total links in the page " + linksCount);

	}

}
