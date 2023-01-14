package dataDrivenExamples;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginDataWithExcel {

	String[][] data = null;
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdeiver.chrome.driver", "E:\\Adhavan\\Softwares\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

	public String[][] getExcelData() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("E:\\Adhavan\\Notes\\4. Data Driven\\TestData.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String[][] testData = new String[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {

				testData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}

	@DataProvider(name = "logInData")
	public String[][] loginDataProvider() throws BiffException, IOException {

		data = getExcelData();
		return data;
	}

	@Test(dataProvider = "logInData")
	public void loginUserNameAndPassword(String user1, String pass1) {

		WebElement userName = driver.findElement(By.xpath("//input[@id=\'username\']"));
		userName.sendKeys(user1);
		WebElement passWord = driver.findElement(By.xpath("//input[@id=\'password\']"));
		passWord.sendKeys(pass1);
		WebElement submit = driver.findElement(By.xpath("//button[@id=\'submit\']"));
		submit.click();

	}

}
