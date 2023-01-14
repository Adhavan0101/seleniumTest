package com.Test;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.ChannelDuplexHandler;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
		boolean disabled = confirmButton.isEnabled();
		System.out.println(disabled);
		
		WebElement getPositionSubmitButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xyPoint = getPositionSubmitButton.getLocation();
		int xPoint = xyPoint.getX();
		int yPoint = xyPoint.getY();
		System.out.println("Submit Button X :" + xPoint);
		System.out.println("Submit Button Y :" + yPoint);
		
		WebElement saveButtonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = saveButtonColor.getCssValue("background");
		System.out.println("Save Button Color :"+color);
		
		WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height = sizeButton.getSize().getHeight();
		int width  = sizeButton.getSize().getWidth();
		System.out.println("Button Height :"+height );
		System.out.println("Button Width :"+width );
		
		WebElement successColorChange = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));
		Thread.sleep(8000);
		successColorChange.click();
		
		WebElement imageButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imageButton.click();
		Thread.sleep(3000);
		imageButton.click();
		
		//WebElement roundButton = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]"));
		//roundButton.
		
		WebElement title = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		title.click();
		
		System.out.println("Completed");
      }
}
