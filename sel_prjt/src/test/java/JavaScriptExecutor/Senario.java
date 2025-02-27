package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Senario {

	public static void main(String[] args) throws InterruptedException {
		
		       //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
				//Navigate to an application
				driver.get("https://www.ajio.com/");
				
				WebElement kids = driver.findElement(By.xpath("//span[text()='KIDS']"));
				
				WebElement ele = driver.findElement(By.xpath("//a[@title='T-Shirts Under 399']"));
				
				Actions act=new Actions(driver);
				act.moveToElement(kids).perform();
				Thread.sleep(3000);
				act.moveToElement(ele).click().perform();
				Thread.sleep(3000);
				WebElement sortby = driver.findElement(By.id("sortBy"));

				Select s=new Select(sortby);
				s.selectByIndex(3);
				Thread.sleep(3000);
				WebElement price = driver.findElement(By.xpath("(//div[@class='nameCls'])[1]/ancestor::div[@class='preview']/descendant::strong[text()='₹399']"));
				
				System.out.println("Price: "+price.getText());	
				
				driver.quit();
				
	}

}
