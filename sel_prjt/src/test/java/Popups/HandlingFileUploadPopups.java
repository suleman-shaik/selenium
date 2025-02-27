package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopups {
	public static void main(String[] args) throws InterruptedException {
		

		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an application
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//File Upload using Sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\sample file.html");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
