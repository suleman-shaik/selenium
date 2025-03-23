package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAxesSiblings {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//a[text()='J K INTERNATIONAL Play Gym & Mat for Babies Infant New ...']/ancestor::div[@class='slAVV4']/descendant::div[@class='UkUFwK']/preceding-sibling::div"));
		System.out.println(price.getText());
		
		driver.quit();
		
	}

}
