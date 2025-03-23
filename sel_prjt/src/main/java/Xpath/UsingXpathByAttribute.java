package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAttribute {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to an url
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/sample%20file.html");
		
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("selenium");//xpath by Attribute=//tagname[@Attributename='Attribute Value']
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc123");//xpath by TEXT=//tagname[@text()='text']
		
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
