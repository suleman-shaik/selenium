package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Navigate to an url
		driver.get("https://www.shoppersstack.com/");
		//Thread.sleep(3000);
		
		//identify login button
		driver.findElement(By.id("loginBtn")).click();
		
		driver.quit();
		}

}
