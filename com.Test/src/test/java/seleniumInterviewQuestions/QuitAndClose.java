package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Adhavan\\\\Softwares\\\\Chrome Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml");

		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();

		Thread.sleep(5000);

		//driver.close();
		driver.quit();

	}

}
