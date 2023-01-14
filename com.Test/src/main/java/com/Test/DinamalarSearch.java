package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DinamalarSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Driver Creation
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium\\driver\\chromedriver.exe");
		// Object Creation
	    WebDriver driver = new ChromeDriver();
	    
	    try{
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	  
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Dinamalar");
	    Thread.sleep(3000);
	    driver.findElement(By.name("btnK")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.className("iUh30 tjvcx")).click();
	    Thread.sleep(5000);
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	driver.close();
	    	System.out.println(" Driver Closed ");
	    }
	}
}
