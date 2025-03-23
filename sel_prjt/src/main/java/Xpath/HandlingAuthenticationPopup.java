package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
		Thread.sleep(3000);
		
		
		driver.quit();
		

		
		
	}

}
