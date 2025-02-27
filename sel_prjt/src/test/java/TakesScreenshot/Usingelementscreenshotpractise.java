package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingelementscreenshotpractise {
	public static void main(String[] args) throws InterruptedException, IOException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement title = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		File src=title.getScreenshotAs(OutputType.FILE);
		
		File temp=new File("./shots/element2.png");
		
		FileUtils.copyFile(src, temp);
		
		driver.quit();
		
		
		
	}

}
