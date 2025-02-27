package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebpageScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to an application
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		
		//Screenshot of web page
		//Step:1 Typecast takescreenshot Interface with driver reference variable
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//Step:2 Take the Screenshot and Store in temporary file
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//Step:3 Create an Empty file
		File dest=new File("./sel_prjt/screenshot/swiggy.png");
		
		//Step:4 Copy the Screenshot in an Empty file
		FileUtils.copyFile(src, dest);
		
		//Close the browser
		driver.quit();
	}

}
