package seleniumInterviewQuestions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.net/login");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("adhavaneswaran01@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Adhav@1992");

		WebElement login = driver
				.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		login.click();

		WebElement myProfile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a"));
		myProfile.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement profile = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")));
		profile.click();
	}

}
