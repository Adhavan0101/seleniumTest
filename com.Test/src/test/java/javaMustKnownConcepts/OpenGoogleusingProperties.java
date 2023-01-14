package javaMustKnownConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleusingProperties {

	public static void main(String[] args) {

		WebDriver driver = null;

		try {
			FileInputStream inputStream = new FileInputStream("config.properties");
			Properties properties = new Properties();
			properties.load(inputStream);

			String browser = properties.getProperty("Browser");
			String driverLocation = properties.getProperty("DriverLocation");

			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", driverLocation);
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver", driverLocation);
				driver = new ChromeDriver();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
