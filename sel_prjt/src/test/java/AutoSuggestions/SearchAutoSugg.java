package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAutoSugg {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an application
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//Identify search TF
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("comp");
		Thread.sleep(3000);
		
		//Fetch all the suggestions
		List<WebElement> sugg = driver.findElements(By.xpath("//div[contains(text(),'comp')]"));
		
		for(WebElement ele:sugg) {
			System.out.println(ele.getText());
		}
		
		//click on anyone of the auto suggestion
		driver.findElement(By.xpath("(//div[contains(text(),'comp')])[5]")).click();
		
		//close the browser
		driver.quit();
		
		
}
}
