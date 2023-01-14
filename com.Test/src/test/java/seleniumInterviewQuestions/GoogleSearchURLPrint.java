package seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchURLPrint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium \n");
		Thread.sleep(5000);

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

		for (WebElement links : totalLinks) {
			System.out.println(links.getAttribute("href"));
		}

		List<WebElement> mainLinks = driver
				.findElements(By.xpath("//*[@id=\"search\"]//following::h3/following::div/cite"));
		for (WebElement links : mainLinks) {
			System.out.println(links.getText());
		}

	}

}
