package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an url
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/sample%20file.html");
		
		
		//Identify UserName TF
		driver.findElement(By.xpath("./html/body/input")).sendKeys("selenium");
		
		
		//identify PWD TF
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("abc123");
		
		//Identify Login Button and Click
		driver.findElement(By.xpath("./html/body/button[1]")).click();
		}

}
