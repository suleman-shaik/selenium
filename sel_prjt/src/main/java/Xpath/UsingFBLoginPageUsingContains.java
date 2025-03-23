package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFBLoginPageUsingContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder='Email address or phone number']")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'password']")).sendKeys("abc123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'login']")).click();
		Thread.sleep(3000);
		

	}

}
