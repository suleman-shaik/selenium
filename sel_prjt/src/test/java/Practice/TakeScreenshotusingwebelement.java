package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotusingwebelement {
	public static void main(String[] args) throws IOException {
		
		       //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.zeptonow.com/");
				
				WebElement ts = driver.findElement(By.xpath("//img[@loading='lazy']"));
				
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				File dest=new File("./ss2.png");
				
				FileUtils.copyFile(src, dest);
				
				driver.quit();
				
	}

}
