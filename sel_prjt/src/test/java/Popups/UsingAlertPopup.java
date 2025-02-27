package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//p[text()='Click the button to see line-breaks in a confirm box.']"));
		//Thread.sleep(3000);
		
		WebElement tryit = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(tryit).click().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		WebElement res = driver.findElement(By.id("demo"));
		System.out.println(res.getText());
		//al.accept();
		Thread.sleep(3000);
		//System.out.println(al.getText());
		
		driver.quit();
	}

}
