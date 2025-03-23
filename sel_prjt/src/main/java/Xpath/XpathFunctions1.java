//by using starts-with and normalize-space
package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_email')]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//button[normalize-space(@name='login')]"));
		Thread.sleep(3000);
		
		driver.close();
	}

}
