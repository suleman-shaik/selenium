package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledTextField {
	public static void main(String[] args) throws InterruptedException {
		
		        //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to an application
				driver.get("https://demoapp.skillrary.com/");
				
				//Handle Disabled TextField
				WebElement dis_ele=driver.findElement(By.xpath("//input[@class='form-control']"));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].value=arguments[1]", dis_ele,"selenium");
				Thread.sleep(3000);
				
				//Handle Enable TextField
				WebElement ena_ele=driver.findElement(By.xpath("//input[@class='form-control ui-autocomplete-input']"));
				js.executeScript("arguments[0].value=arguments[1]", ena_ele,"selenium");
				Thread.sleep(3000);
				
				
				//Close the browser
				driver.quit();
				
				
	}

}
