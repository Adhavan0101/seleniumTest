package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();

		WebElement basicCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		basicCheckBox.click();
		Thread.sleep(3000);
		basicCheckBox.click();

		WebElement notification = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/span"));
		notification.click();

		WebElement favoratelanguageJava = driver
				.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/label"));
		favoratelanguageJava.click();

		WebElement triStateBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		triStateBox.click();
		Thread.sleep(3000);
		triStateBox.click();

		WebElement toggleSwitch = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		toggleSwitch.click();

		WebElement verifyCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		boolean disabled = verifyCheckBox.isEnabled();
		System.out.println(disabled);

		WebElement selectMultiple = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul"));
		Select select = new Select(selectMultiple);
		select.selectByIndex(2);

		System.out.println("Completed");
	}

}
