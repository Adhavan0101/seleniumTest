package com.Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();

		// 1. Locating A Parent Element

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Adhav");

		// Parent X-path - //input[@id='email']/parent::div

		// 2. Locating A Child Element

		WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signin.click();
		// child X-path - //button[@id='SubmitLogin']/child::span

		// 3. Locating A Amcestor Element

		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
		email1.sendKeys("Adhav");

		// Parent X-path - //input[@id='email']/ancestor::form

		// 4. Locating Following Elements

		WebElement email2 = driver.findElement(By.xpath("//input[@id='email']"));
		email2.sendKeys("Adhav");

		// Following X-path - //input[@id="email"]/following::script

		// 5. Locating preceding Elements

		WebElement email3 = driver.findElement(By.xpath("//input[@id='email']"));
		email3.sendKeys("Adhav");

		// Preceding X-path - //input[@id="email"]/preceding::link

		// 6. Locating following Sibling

		WebElement securityProject1 = driver.findElement(By.xpath("//a[text()='Security Project']"));
		securityProject1.click();

		// Following Sibling X-path - //li[@class="dropdown"]/following-sibling::li[5]

		// 7. Locating preceding Sibling

		WebElement securityProject2 = driver.findElement(By.xpath("//a[text()='Security Project']"));
		securityProject2.click();

		// Preceding X-path - //li[@class="dropdown"]/preceding-sibling::li[5]

	}

}
