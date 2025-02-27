package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		
	         	//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Navigate to an Application
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				
				//Click on Alert Pop up Button
				driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
				Thread.sleep(3000);
				
				//Switch the control to the Alert Pop up
				Alert al = driver.switchTo().alert();
				System.out.println(al.getText());
				//driver.switchTo().alert().accept();
				al.accept();
				
				System.out.println(driver.findElement(By.id("result")).getText());
			
				Thread.sleep(3000);
				
				//close the Browser
				driver.quit();
	}

}
