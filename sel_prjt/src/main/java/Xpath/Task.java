package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		WebElement ratingElement=driver.findElement(By.xpath("//div[@class='cxnlBh']//div/span"));
		
		String rating=ratingElement.getText();
		
		System.out.println("Product Rating: "+ rating);
		
		driver.quit();
		
		
		}

}
