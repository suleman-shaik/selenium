package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXapthByText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/sample%20file.html");
		
		driver.findElement(By.id("user")).sendKeys("selenium");
		
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		driver.findElement(By.id("//button[text()='Login']"));
	}

}
