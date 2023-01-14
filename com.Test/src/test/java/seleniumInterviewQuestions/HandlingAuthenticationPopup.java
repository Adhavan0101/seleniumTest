package seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Adhavan\\\\Softwares\\\\Chrome Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
