package Base_Class_Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Class {

	@BeforeSuite
	public void BS()
	{
		System.out.println("Connect With The DataBase");
	}
	@AfterSuite
	public void AS() 
	{
		System.out.println("DisConnect With The DataBase");
		
	}
	@BeforeTest
	public void BT() 
	{
		System.out.println("Open Parllel Excecution");
		
	}
	@AfterTest
	public void AT()
	{
		System.out.println("Close Parllel Excecution");
		
	}
	@BeforeClass
	public void BC() 
	{
		System.out.println("Open Browser");
		
	}
	@AfterClass
	public void AC() 
	{
		System.out.println("Close Browser");
		
	}
	@BeforeMethod
	public void BM() 
	{
		System.out.println("Login");
		
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("LogOut");
		
	}
}

