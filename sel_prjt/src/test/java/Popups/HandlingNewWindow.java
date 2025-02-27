package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewWindow {
	public static void main(String[] args) throws InterruptedException {
		
		        //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				
				//Create a new window
				driver.switchTo().newWindow(WindowType.WINDOW);
				Thread.sleep(3000);
				
				//Create a new empty tab
				driver.switchTo().newWindow(WindowType.TAB);
				Thread.sleep(3000);
				
				driver.quit();
	}

}
