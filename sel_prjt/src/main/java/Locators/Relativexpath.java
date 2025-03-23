package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the the window
		driver.manage().window().maximize();
		
		
		//Navigate to an url
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/sample%20file.html");
		
		
		//identify USERNAME TF
		driver.findElement(By.xpath("//input[1]")).sendKeys("selenium");
		
		//identify PWd TF
		driver.findElement(By.xpath("//input[2]")).sendKeys("abc123");
		
		
		//identify cancel button and click
		driver.findElement(By.xpath("//button[2]")).click();
	}

}
