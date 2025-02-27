package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {
	public static void main(String[] args) throws InterruptedException {
		

	       //Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.zeptonow.com/");
			
			Actions a=new Actions(driver);
			
			a.scrollByAmount(100, 2500).perform();
			Thread.sleep(5000);
			
			WebElement toy = driver.findElement(By.xpath("(//img[@loading='lazy'])[153]"));
			
			a.scrollToElement(toy).moveToElement(toy).click().build().perform();
			Thread.sleep(5000);
			
			
			driver.quit();
	}

}
