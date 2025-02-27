package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Beng");
		
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'February')]/../../descendant::p[text()='14']")).click();
		
		driver.quit();
	}

}
