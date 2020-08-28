package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1, dependsOnMethods="deleteUser")
	public void createUser() {
		Reporter.log("createUser..", true);
		//How do you fail a test method explicitly or forcebly ?
		Assert.fail("intentionally failing create user method..");
	}
	@Test(priority = 3, dependsOnMethods="createUser")
	public void deleteUser() {
		Reporter.log("deleteUser..", true);
	}

}
