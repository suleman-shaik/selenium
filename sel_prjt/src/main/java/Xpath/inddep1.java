package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inddep1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("phones"+Keys.ENTER);
		
		WebElement rating = driver.findElement(By.xpath("//div[@class='KzDlHZ']/ancestor::div[@class='_75nlfW']/descendant::div[@class='XQDdHH']"));
		Thread.sleep(3000);
		System.out.println(rating.getText());
		
		Thread.sleep(3000);
		driver.quit();
		
	
	}

}
