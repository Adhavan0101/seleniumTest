package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPointSearch {

	public static void main(String[] args) throws InterruptedException {
	
		// Driver Creation
		// Mention Chromedriver.exe in File path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium\\driver\\chromedriver.exe");

		// Create Chrome Driver Object
		
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Javatpoint");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='btnK']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Javatpoint")).click();
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		Boolean logoDisplay = driver.findElement(By.xpath("//*[@id='headerpage']/table/tbody/tr/td/div[1]/a/img")).isDisplayed();
		
		if(url.equals("https://www.javatpoint.com/") && (logoDisplay)) {
			System.out.println("TC Passed");
		}
		else {
			System.out.println("TC Failed");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		finally {
		driver.close();
		System.out.println("Driver Closed");
		}
	}
}
