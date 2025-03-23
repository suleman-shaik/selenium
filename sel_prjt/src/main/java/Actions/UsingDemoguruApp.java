//using RightClick and DoubleClick
package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDemoguruApp {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement DCbtn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(DCbtn).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
