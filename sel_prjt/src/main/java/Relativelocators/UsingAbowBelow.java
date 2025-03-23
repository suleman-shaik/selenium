package Relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAbowBelow {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.get("https://www.facebook.com/");
		
		//Identify PWD Element
		WebElement pswd = driver.findElement(By.id("pass"));
		
		//Identify UN TF
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
			un.sendKeys("selenium");
			pswd.sendKeys("abc123");
			
			//Identify login button
			WebElement login = driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd));
			login.click();
			Thread.sleep(3000);
			driver.quit();
	}

}
