package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlineOrNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		String beforeHovering = tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering : " + beforeHovering);

		Actions actions = new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();

		String aftereHovering = tamil.getCssValue("text-decoration");
		System.out.println("After Hovering : " + aftereHovering);

	}

}
