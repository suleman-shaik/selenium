package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByUsingMouseHovering {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		WebElement beauty=driver.findElement(By.xpath("//a[text()='Beauty']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(beauty).perform();
		Thread.sleep(3000);
		
		//driver.quit();
	}

}

