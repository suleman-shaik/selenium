package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	WebElement	searchTF=driver.findElement(By.id("small-searchterms"));
		
    if(searchTF.isDisplayed()) {
    	searchTF.sendKeys("pens");
    } 	 	
    	WebElement searchTF1 = driver.findElement(By.xpath("//input[@type='submit']"));
    	
    	if(searchTF.isEnabled()) {
  
    	searchTF1.sendKeys("books");
		searchTF1.click();
    	Thread.sleep(3000);
    	
    	}
    
    Thread.sleep(3000);
    
     WebElement checkbox=driver.findElement(By.id("As"));
     
     checkbox.click();
     Thread.sleep(3000);
     
     
     if(checkbox.isSelected()) {
    	 
    	 System.out.println("check box is selected");
    	 
    	 driver.quit();
    	 
    	 
    	 
     }
	}
	

}