package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v129.debugger.model.SearchMatch;

public class Actions {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//identify search TF
		
WebElement	searchTF=driver.findElement(By.id("small-searchterms"));


		Thread.sleep(2500);
		
		searchTF.sendKeys("mobile");
		Thread.sleep(2500);
		
//clear the text
		searchTF.clear();
		Thread.sleep(2500);
		
		searchTF.sendKeys("books");
		Thread.sleep(2500);
		
		//identify search button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(2500);
		
		
		//close the browser
		
		driver.quit();
		
		
	}

}