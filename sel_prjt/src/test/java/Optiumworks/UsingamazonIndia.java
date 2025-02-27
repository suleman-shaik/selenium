package Optiumworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UsingamazonIndia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in.\r\n");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung"+Keys.ENTER);
		
		Actions a=new Actions(driver);
		WebElement sortby = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		
	
	    
		a.moveToElement(sortby).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Price: Low to High']")).click();
		WebElement color=driver.findElement(By.xpath("//span[text()='Colour']"));
		a.scrollToElement(color).click();
		driver.findElement(By.xpath("//div[@class='colorsprite aok-float-left']")).click();
		
		WebElement newtab = driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy S21 Plus')]"));
		newtab.click();
		
		Thread.sleep(3000);
		if(newtab.isSelected()) {
			System.out.println(newtab.getText());
			
		}
		driver.quit();
		}
		
		
	
		
	
	}


