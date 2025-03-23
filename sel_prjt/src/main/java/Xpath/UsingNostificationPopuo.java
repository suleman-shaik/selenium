package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingNostificationPopuo {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
     	opt.addArguments("--disable-geolocation");

        //Launch the browser
		WebDriver driver=new ChromeDriver(opt);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/geolocation");
		driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
