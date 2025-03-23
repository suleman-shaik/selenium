package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobile"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
