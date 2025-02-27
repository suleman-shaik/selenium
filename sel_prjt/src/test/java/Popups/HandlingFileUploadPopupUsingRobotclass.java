package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFileUploadPopupUsingRobotclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		        //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Copy the file path
				StringSelection s=new StringSelection("C:\\Users\\HP\\OneDrive\\Desktop\\sample file.html");
				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
				
				//Navigate to an application
				driver.get("https://the-internet.herokuapp.com/upload");
				
				WebElement upload = driver.findElement(By.id("file-upload"));
				Actions a=new Actions(driver);
				
				a.moveToElement(upload).click().perform();
				
				Thread.sleep(5000);
				
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
				Thread.sleep(3000);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(5000);
				
				driver.quit();
				
	}

}
