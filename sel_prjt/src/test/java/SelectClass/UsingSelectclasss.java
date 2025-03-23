package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectclasss {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//Identify the dropdown
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		//create an instance of select class
		Select s=new Select(dropdown);
		
		//select option based on the index
		s.selectByIndex(7);
		
		//select option based on value
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		
		//select option based on visible text
		s.selectByVisibleText("Car & Motorbike");
		
		//check whether the dropdown is single/multi select dropdown
		System.out.println(s.isMultiple());
		Thread.sleep(3000);
		
		//Fetch all the captions
		List<WebElement> list = s.getOptions();
		for(WebElement w:list)
		{
			System.out.println("Options:"+w.getText());
			
		}
		//search first selected option
		System.out.println("First Slected option:"+s.getFirstSelectedOption().getText());
		
		//Fetch all the selected options
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele:selected){
			{
				System.out.println("Selected option:"+ele.getText());
			}
		}
		
		driver.quit();
		
	}

}
