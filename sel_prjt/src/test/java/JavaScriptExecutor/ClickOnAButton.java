package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAButton {
	public static void main(String[] args) throws InterruptedException {
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an application
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.name("login"));
		
		//Click on Login Button using JavaScriptExcecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login);
		
		//Disabled button
		//js.executeScript("arguments[0].checked=true", login);
		
		Thread.sleep(3000);
		
		
		//Close the browser
		driver.quit();
	}

}
