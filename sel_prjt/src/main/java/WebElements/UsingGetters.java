package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
	
	WebElement	Register=driver.findElement(By.linkText("Register"));
		
		
	//fetch the gettext
	System.out.println(Register.getText());
	
	//fetch the the attribute value
	
	System.out.println(Register.getAttribute("class"));
		
		//fetch the tagname
	System.out.println(Register.getTagName());
		
		//fetch the size
	System.out.println(Register.getSize());
		//fetch the location
	System.out.println(Register.getLocation());
		//fetch the react
	System.out.println(Register.getRect());
	//fetch the cssvalue
	System.out.println(Register.getCssValue("vertical-align: baseline"));
	//close the browser
	
	driver.quit();
	}
}