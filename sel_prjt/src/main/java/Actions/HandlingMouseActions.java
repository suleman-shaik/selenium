package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an application
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		
		//Identify search TF
		//driver.findElement(By.name("q")).sendKeys("mobile"+ Keys.ENTER);
		
		System.out.println(driver.manage().window().getPosition());
		
		//Scroll the web page based on coordinates
		Actions act=new Actions(driver);
		act.scrollByAmount(100, 500).perform();
		Thread.sleep(3000);
		
		
		//Scroll the webpage based on WebElement
		WebElement ele=driver.findElement(By.xpath("//a[text()='Cleartrip']"));
		
		act.scrollToElement(ele).moveToElement(ele).click().build().perform();
		
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
		
		
		
	}

}
