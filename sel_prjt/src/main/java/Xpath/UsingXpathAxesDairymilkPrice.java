package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAxesDairymilkPrice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("dairy milk"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]/ancestor::div[@class='slAVV4']/descendant::div[@class='UkUFwK']/preceding-sibling::div"));
		
		System.out.println(price.getText());
		driver.quit();
	}

}
