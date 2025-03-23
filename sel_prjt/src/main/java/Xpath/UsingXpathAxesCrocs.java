package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAxesCrocs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.name("q")).sendKeys("crocs for men"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("(//a[@class='WKTcLC BwBZTg'])[1]/ancestor::div[@class='_1sdMkc LFEi7Z Cd8ZYz']/descendant::div[@class='Nx9bqj']"));
		System.out.println(price.getText());
		driver.quit();
	}

}
