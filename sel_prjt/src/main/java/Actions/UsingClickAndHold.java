package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement ele=driver.findElement(By.name("A"));
		WebElement ele1=driver.findElement(By.name("B"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.clickAndHold(ele1).clickAndHold().perform();
		WebElement share=driver.findElement(By.xpath("//button[@aria-controls='sharing-popup-Blog1-byline-2873846720740225467']"));
		act.moveToElement(share).perform();
		Thread.sleep(10000);
		
		act.release(ele1).perform();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
