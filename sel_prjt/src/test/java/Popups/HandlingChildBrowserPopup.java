package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {

        //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobiles"+ Keys.ENTER);
		
		//Fetch the parent window id
		String parentwindowid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
		Thread.sleep(3000);
		
		//Fetching all the window id's
		Set<String> allwindowids = driver.getWindowHandles();
		
		//iterating all the window id's
		for (String s : allwindowids) {
			
			driver.switchTo().window(s);
			//Switching the driver control
			if(driver.getTitle().contains("MOTOROLA g05 ( 64 GB Storage,4 GB RAM)")) {
				
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				Thread.sleep(5000);
		}
		//Switching back to the parent window
			driver.switchTo().window(parentwindowid);
		
		
		
	}
		driver.quit();

	}
}
