package TestNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("SSLC Completed");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary Completed");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("Engieering Completed");
	}

}
