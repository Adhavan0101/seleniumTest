package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		// Driver Creation
		// 1. Mention chromedriver.exe file path
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");

		// 2. Create chrome driver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
			try {
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
			Thread.sleep(2000);
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			String name= driver.findElement(By.id("hdtb-tls")).getText();
			System.out.println(name);
			driver.findElement(By.partialLinkText("Selenium")).click();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			
			Boolean logoDispaly = driver.findElement(By.id("selenium_logo")).isDisplayed();
			
			if(url.equals("https://www.selenium.dev/") && logoDispaly) {
				System.out.println("TC Passed");
			}else {
				System.out.println("TC Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
			System.out.println("Completed");
	}

}
