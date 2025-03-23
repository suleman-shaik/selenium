package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinXpathAxesIphone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 15"+ Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='tUxRFH']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText());
		
		driver.quit();
	}

}
