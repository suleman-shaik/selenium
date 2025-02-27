package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Enabled {
	@Test(enabled = false)
	public void cat() {
		Reporter.log("cat",true);
	}
	@Test
	public void orange() {
		Reporter.log("orange",true);
	}

}
