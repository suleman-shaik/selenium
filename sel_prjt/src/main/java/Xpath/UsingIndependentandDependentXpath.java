package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIndependentandDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement dynamicvalue=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]/ancestor::div[@class='tUxRFH']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		Thread.sleep(3000);

				System.out.println(dynamicvalue.getText());
				driver.quit();
	}

}