package seleniumInterviewQuestions;

import org.testng.annotations.Test;

public class TimeOutExamples {

	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("Adhav");
	}

}
