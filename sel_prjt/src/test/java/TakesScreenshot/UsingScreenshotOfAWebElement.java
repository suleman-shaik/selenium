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

public class UsingScreenshotOfAWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.swiggy.com/");
		
		WebElement icon = driver.findElement(By.xpath("//img[@loading='lazy']"));
		//Scrennshot of  a WebElement
		
		File temp=icon.getScreenshotAs(OutputType.FILE);
		
		File newfile=new File("./ss/element.png");
		
		FileUtils.copyFile(temp, newfile);
		
		//Close the browser
		driver.quit();
	}

}
