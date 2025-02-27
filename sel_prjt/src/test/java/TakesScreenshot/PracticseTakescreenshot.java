package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticseTakescreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//store in temporary file
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//Create empty file
		File dest=new File("./sshot/zomato.png");
		
		//Copy the ss of the file
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
		
		
	}

}
