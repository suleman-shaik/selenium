package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multisdd = driver.findElement(By.id("cars"));
		
		Select s=new Select(multisdd);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByValue("90");
		Thread.sleep(3000);
		
     	s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
       Thread.sleep(3000);
		
    	s.deselectByIndex(1);
     	Thread.sleep(3000);
		
        s.deselectByValue("90");
		Thread.sleep(3000);
		
     	s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
   		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
