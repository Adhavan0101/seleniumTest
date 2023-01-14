package seleniumInterviewQuestions;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

public class HandlingExceptionExample {

	@Test(timeOut = 2000, expectedExceptions = org.testng.internal.thread.ThreadTimeoutException.class)
	public void test() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("Adhav");
	}

}
