package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToSnapddeal {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.snapdeal.com/");
		WebElement sign_in = driver.findElement(By.xpath("//div[@class='accountInner']"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(sign_in).click().perform();
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		Thread.sleep(3000);
		
		//Switch to frame using based on Index
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		//Switch to frame using frame element
		WebElement frame_ele=driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(frame_ele);
		
		driver.findElement(By.id("userName")).sendKeys("7674915912");
		Thread.sleep(3000);
		
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Toys"+Keys.ENTER);
		
		driver.quit();
	}

}
