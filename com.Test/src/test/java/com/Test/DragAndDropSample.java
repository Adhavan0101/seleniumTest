package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();

		WebElement drag = driver.findElement(By.id("form:conpnl_content"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(drag, to).build().perform();

		WebElement dragFrom = driver.findElement(By.id("form:drag_content"));
		WebElement dropTo = driver.findElement(By.id("form:drop_header"));
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(dragFrom, dropTo).build().perform();

	}

}
