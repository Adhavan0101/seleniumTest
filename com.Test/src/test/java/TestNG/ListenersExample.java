package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test case going to execute");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test case is passed");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test case is failed");
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test case is skipped");
	}

	public void onTestFailedWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestResult context) {

		System.out.println("Before everthing");
	}

	public void onFinish(ITestResult context) {

		System.out.println("After everthing");
	}
}
