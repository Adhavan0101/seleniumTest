package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple 1 Testing");
	}

	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple 2 Testing");
	}

	@Test(groups = {"Samsung"})
	public void samsung1() {
		System.out.println("Samsung 1 Testing");
	}

	@Test(groups = {"Samsung"})
	public void samsung2() {
		System.out.println("Samsung  2 Testing");
	}

	@Test(groups = {"Oneplus"})
	public void oneplus1() {
		System.out.println("Oneplus 1 Testing");
	}

	@Test(groups = {"Oneplus"})
	public void oneplus2() {
		System.out.println("Oneplus 2 Testing");
	}

	@Test(groups = {"pixcel"})
	public void pixcel1() {
		System.out.println("pixcel 1 Testing");
	}

	@Test(groups = {"pixcel"})
	public void pixcel2() {
		System.out.println("Pixcel 2 Testing");
	}
}
