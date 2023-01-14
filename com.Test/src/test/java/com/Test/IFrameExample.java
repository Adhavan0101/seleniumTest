package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement clickMEInsideframe = driver.findElement(By.id("Click"));
		clickMEInsideframe.click();
		String firstFrameText = driver.findElement(By.id("Click")).getText();
		System.out.println("Click ME Inside frame Text Is " + firstFrameText);

		driver.switchTo().defaultContent();

		List<WebElement> totalIFrame = driver.findElements(By.tagName("iframe"));
		int iFrame = totalIFrame.size();
		System.out.println("Total IFrame is " + iFrame);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");

		WebElement clickMeNestedFrame = driver.findElement(By.id("Click"));
		clickMeNestedFrame.click();
		String nestedFrame = driver.findElement(By.id("Click")).getText();
		System.out.println("Click Me Nested Frame Text is " + nestedFrame);
		System.out.println("Completed");

	}

}
