package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBoxExamples {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml#");
	driver.manage().window().maximize();
	
	WebElement name = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
    name.sendKeys("Adhavan");
    Thread.sleep(3000);
    
    WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
    city.sendKeys(" India");
    Thread.sleep(3000);
    
    WebElement textBox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
    boolean disabled = textBox.isEnabled();
    Thread.sleep(3000);
    System.out.println(disabled);
    
    WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
    clearText.clear();
    Thread.sleep(3000);
    
    WebElement retriveText = driver.findElement(By.id("j_idt88:j_idt97"));
    String value = retriveText.getAttribute("value");
    System.out.println(value);
    Thread.sleep(3000);
    
    WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
    email.sendKeys("adhavan@gmail.com"+Keys.TAB);
    Thread.sleep(3000);
    
    WebElement aboutYourself = driver.findElement(By.id("j_idt88:j_idt101"));
    aboutYourself.sendKeys("I am a strong person");
    Thread.sleep(3000);
    
    WebElement errorMessege = driver.findElement(By.id("j_idt106:thisform:age"));
    errorMessege.sendKeys(""+Keys.ENTER);
    Thread.sleep(3000);
    
    WebElement labelPosition = driver.findElement(By.id("j_idt106:float-input"));
    labelPosition.click();
    Thread.sleep(3000);
    
    WebElement nameThirdOption = driver.findElement(By.id("j_idt106:auto-complete_input"));
    nameThirdOption.sendKeys("Adhavan2"+Keys.ENTER);
    Thread.sleep(3000);
    //Select select = new Select(nameThirdOption);
    //select.selectByIndex(2);
    
    WebElement dateOfBirth = driver.findElement(By.id("j_idt106:j_idt116_input"));
    dateOfBirth.sendKeys("01/01/1992"+Keys.ENTER);
    Thread.sleep(3000);
    
    WebElement numberSpinValue = driver.findElement(By.id("j_idt106:j_idt118_input"));
    numberSpinValue.sendKeys("1992");
    Thread.sleep(3000);
    
    WebElement randomNumberSlider = driver.findElement(By.id("j_idt106:slider"));
    randomNumberSlider.sendKeys("75");
    Thread.sleep(3000);
    
    WebElement keyboardAppers = driver.findElement(By.id("j_idt106:j_idt122"));
    keyboardAppers.click();
    Thread.sleep(3000);
    
    //WebElement customToolBar = driver.findElement(By.partialLinkText("//*[@id=\"j_idt106:j_idt124_toolbar\"]/span[1]/button[1]/svg/path[1]"));
    //customToolBar.click();
    
    WebElement enterBox = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt124_editor\"]/div[1]"));
    enterBox.sendKeys("Hi,How Are You");
    System.out.println("Completed");
    
    Thread.sleep(3000);
    
	}

}
