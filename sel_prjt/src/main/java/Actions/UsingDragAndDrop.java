package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("box1"));
		WebElement targetloc = driver.findElement(By.id("dropZone1"));
		Thread.sleep(3000);
		
//		WebElement ele2=driver.findElement(By.id("box3"));
//		WebElement targetloc1=driver.findElement(By.id("dropZone3"));
//		Thread.sleep(3000);
//		
		Actions act=new Actions(driver);
		act.dragAndDrop(ele, targetloc).perform();
		Thread.sleep(10000);
		
		WebElement ele2=driver.findElement(By.id("box3"));
		act.scrollToElement(targetloc).perform();
		WebElement targetloc1=driver.findElement(By.id("dropZone3"));
		act.dragAndDrop(ele2, targetloc1);
		Thread.sleep(3000);
		
		driver.quit();
	}

}
