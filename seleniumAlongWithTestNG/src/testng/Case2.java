package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Case2 {
	@Test
	public void printB() {
		Reporter.log("BBB...", true);
}
}
