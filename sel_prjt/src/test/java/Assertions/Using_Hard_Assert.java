package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_Hard_Assert {
	
	
	@Test
	public void HardAssert() 
	{
		//changes done in github
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		//Hard Assert
		Assert.assertEquals(title,"Facebook – log in or sign up");
		
		boolean condition = driver.getTitle().contains("Facebook – log in or sign up");
		Assert.assertTrue(condition);
		
//	    Assert.fail();
		System.out.println("Verification passed");
		
		driver.quit();
		
		
	}

}
