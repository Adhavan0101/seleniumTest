package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
        driver.manage().window().maximize();
        
        WebElement favorateBrowser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
        favorateBrowser.click();
        
        WebElement unSelectableChennai = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/label"));
        boolean chennai = unSelectableChennai.isSelected();
        System.out.println(chennai);
        
        WebElement unSelectabaleBengaluru = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]"));
        boolean bengaluru = unSelectabaleBengaluru.isSelected();
        System.out.println(bengaluru);
        
        WebElement unSelectableHyderabad = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[3]"));
        boolean Hyderabad = unSelectableHyderabad.isSelected();
        System.out.println(Hyderabad);
        
        WebElement defaultSelectbuttonChrome = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/label"));
        boolean Chrome = defaultSelectbuttonChrome.isSelected();
        System.out.println(Chrome);
        
        WebElement defaultSelectButtonFirefox = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/label"));
        boolean Firefox =  defaultSelectButtonFirefox.isSelected();
        System.out.println(Firefox);
        
        WebElement defaultSelectButtonSafari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label"));
        boolean Safari = defaultSelectButtonSafari.isSelected();
        System.out.println(Safari);
        
        WebElement defaultSelectButtonEdge = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/label"));
        boolean Edge = defaultSelectButtonEdge.isSelected();
        System.out.println(Edge);
        
        WebElement ageGroup1to20 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/label"));
        ageGroup1to20.click();
        
        System.out.println("Completed");
	}

}
