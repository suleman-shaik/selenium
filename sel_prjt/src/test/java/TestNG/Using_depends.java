package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_depends {
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("login",true);
	}
	@Test
	public void register() {
		Reporter.log("register",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "login")
	public void create() {
		Reporter.log("create",true);
	}
	

}
