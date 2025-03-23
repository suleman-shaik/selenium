package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsuingOperators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Identify username
		driver.findElement(By.xpath("//input[@type='text' and @name='email']\r\n"
				+ "")).sendKeys("selenium");
		//Identify PWd
		driver.findElement(By.xpath("//input[@type='password' or @name='pass']\r\n"
				+ "")).sendKeys("abc123");
		//Identify Login BItton
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
