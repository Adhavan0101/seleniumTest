package seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class GoogleSuggestionPrint {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chorme.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("game of thrones");
		Thread.sleep(5000);
		List<WebElement> googleSuggestions = driver.findElements(By.xpath("//ul[@role=\'listbox\']//following::li"));

		// For Position
//		for (WebElement webElement : googleSuggestions) {
//			System.out.println(webElement.getText());
//			position++;
//
//			if (position == 3) {
//				webElement.click();
//				break;
//			}
//		}

		
		for (WebElement webElement : googleSuggestions) {
			String text = webElement.getText();
			System.out.println(text);

			if (text.contains("cast")) {
				webElement.click();
				break;
			}
		}
	}

}
