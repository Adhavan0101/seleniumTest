package seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckBoxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//input[@id=\"j_idt87:j_idt89_input\"]"));

		List<WebElement> allBoxes = driver.findElements(By.xpath("//input[@type=\'checkbox\']"));

		for (WebElement webElement : allBoxes) {
			webElement.click();
		}

	}

}
