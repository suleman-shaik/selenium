package Relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(3000);
		driver.findElement(By.id("registerClick")).click();
		Thread.sleep(3000);
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("123");
		
		driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(last)).sendKeys("abc");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		
		driver.findElement(RelativeLocator.with(By.name("password")).toRightOf(email)).sendKeys("abcdef");
		
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Confirm Password']")).below(email)).sendKeys("abcdef");
	
		email.sendKeys("m@gmail.com");
		//driver.findElement(by.)
		Thread.sleep(3000);
		
	
		driver.quit();

	}

}
