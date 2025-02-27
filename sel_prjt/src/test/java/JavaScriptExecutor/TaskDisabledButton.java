package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDisabledButton {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/sample%20file.html");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].checked=true;", login);	
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
