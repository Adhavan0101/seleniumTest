package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		try {
		
		WebElement alertSimpleDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alertSimpleDialog.click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		simpleAlert.accept();
		
		WebElement alertConfirmDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		alertConfirmDialog.click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.accept();
		
		//WebElement sweetAlertSimpleDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]"));
		//sweetAlertSimpleDialog.click();
	    //Alert sweetAlertSimple = driver.switchTo().alert();
	    //Thread.sleep(3000);
		//sweetAlertSimple.dismiss();
		
		//WebElement sweetModalDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]"));
	    //sweetModalDialog.click();
		//Alert sweetModal = driver.switchTo().alert();
		//sweetModal.dismiss();
		
		WebElement alertPromtDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		alertPromtDialog.click();
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.sendKeys("Adhavan");
		Thread.sleep(3000);
		promtAlert.accept();
		
		WebElement sweetAlertConfirm = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]"));
		sweetAlertConfirm.click();
		Alert confirmAlert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert1.accept();
		
		//WebElement minimizeMaximize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]"));
		//minimizeMaximize.click();
		//Alert miniMaxi = driver.switchTo().alert();
		//miniMaxi.
		
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
	
		}
		System.out.println("Completed");
	}

}
