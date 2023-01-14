package com.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		// 1. Locating Elements with known Attributes

		WebElement userName1 = driver.findElement(By.xpath("//*[@name='email']"));
		userName1.sendKeys("Adhav");

		// 2. Locating Elements with known Elements and Attributes
		WebElement userName2 = driver.findElement(By.xpath("//input[@name='email']"));
		userName2.sendKeys("Adhav");

		// 3. Locating Elements with known Visible Text(Exact Match)

		WebElement agileProject1 = driver.findElement(By.xpath("//a[text()='Agile Project']"));
		agileProject1.click();

		// 4. Locating Elements with known part of Visible Text

		WebElement agileProject2 = driver.findElement(By.xpath("//a[contains(text(),'Agile Project')]"));
		agileProject2.click();

		// 5. Locating Elements with multiple Attributes

		WebElement signin = driver.findElement(By.xpath("//*[@type='submit'][@id='SubmitLogin'][@name='SubmitLogin']"));
		signin.click();

		// 6. Locating Elements when starting Visible Text is known

		WebElement newTours1 = driver.findElement(By.xpath("//a [starts-with(text(),'New Tours')]"));
		newTours1.click();

		// 7. Locating Elements with Dynamic Attributes Value
		WebElement newTours2 = driver.findElement(By.xpath("//a [contains(@href,'newtours')]"));
		newTours2.click();

	}

}
