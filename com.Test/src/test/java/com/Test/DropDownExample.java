package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement favrorateAutomationTool = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(favrorateAutomationTool);
		select.selectByIndex(1);
		
		WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]"));
		Select select1 = new Select(selectCountry);
		select1.selectByIndex(3);
		
		WebElement chooseCourse = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
		Select select2 = new Select(chooseCourse);
		select2.selectByIndex(2);
		
		WebElement chooseLanguage = driver.findElement(By.xpath("//*[@id=\"j_idt87:lang_label\"]"));
		Select select3 = new Select(chooseLanguage);
		select3.selectByIndex(2);
		
		System.out.println("Completed");

	}

}
