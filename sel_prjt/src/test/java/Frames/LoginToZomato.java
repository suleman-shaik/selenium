package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToZomato {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an Application
		driver.get("https://www.zomato.com/");
		
		//Click on Login Link
		driver.findElement(By.linkText("Log in")).click();
		
		//Switch the driver control to the Frame
		driver.switchTo().frame("auth-login-ui");
		
		Thread.sleep(3000);
		
		//Enter the Mobile number
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7674915912");
		
		
		Thread.sleep(3000);
		
		//Close the LOGIN frame
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//Switch the driver control to the main web page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		
		//Pass the text in  search TF
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("chicken"+ Keys.ENTER);
		
		//Close the browser
		driver.quit();
		
	}

}
