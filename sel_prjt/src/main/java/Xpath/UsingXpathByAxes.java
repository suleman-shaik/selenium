package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		
		//Identify Search bar
		driver.findElement(By.name("q")).sendKeys("mobile" + Keys.ENTER);
		
		//Identify Dynamic element and fetch text
		WebElement price = driver.findElement(By.xpath("//div[text()='OPPO Reno13 5G (Luminous Blue, 128 GB)']/ancestor::div[@class='tUxRFH']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		
		System.out.println(price.getText());
		
		driver.quit();
	}
	

}
