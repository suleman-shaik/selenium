package Listeners_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on success");
	}
	
	

}
