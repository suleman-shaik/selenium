package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Using_Soft_Assert {
	
	
	@Test
	public void SoftAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		//SoftAssert
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(title, "Facebook – log in or sign up");
		boolean condition = driver.getTitle().contains("Facebook – log ");
		soft.assertFalse(condition);
		
		System.out.println("Verification passed");
		driver.quit();
		
		soft.assertAll();
		
		
	}

}
