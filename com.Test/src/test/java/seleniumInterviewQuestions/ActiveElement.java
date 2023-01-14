package seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement {

	static WebElement q;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Method 1 -> Active Element Method

		driver.switchTo().activeElement().sendKeys("Tiruppur \n");

		// Method 2 -> Page Factory Method

		PageFactory.initElements(driver, ActiveElement.class);
		q.sendKeys("Tiruppur \n");

	}

}
