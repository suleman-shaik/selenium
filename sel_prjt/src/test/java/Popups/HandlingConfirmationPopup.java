package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an Application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Click on Confirmation Pop up
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		WebElement result=driver.findElement(By.id("result"));
		
		System.out.println(result.getText());
		
		
		
		
		driver.quit();
	}

}
