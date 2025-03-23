package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGoogleSearchSugg {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an application
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//Identify search TF
		driver.findElement(By.id("APjFqb")).sendKeys("sele");
		Thread.sleep(3000);
		
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'sele')]"));
		
		for(WebElement ele:autosugg) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
