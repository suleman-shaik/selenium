package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an application
		driver.get("https://www.ajio.com/");
		
		//Scroll the web page using Hard-coded co-ordinates
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,2700)");
		Thread.sleep(3000);
		
		//Scroll the web page using element reference
		WebElement ele = driver.findElement(By.xpath("//strong[text()='100% HANDPICKED']"));
		//js.executeScript("arguments[0].scrollIntoView(true)", ele); 
		Thread.sleep(3000);
		
		
		//Scroll the web page using element co-ordinates
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		//js.executeScript("window.scrollBy("+x+","+y+")");
		//System.out.println(x+","+y);
		Thread.sleep(3000);
		
		//Scroll till bottom of the web page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//Scroll till top of the web page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		
		//close the browser
		driver.quit();
		
		
	}

}
