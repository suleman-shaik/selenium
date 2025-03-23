package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinggetTitleMethod {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to an application
		driver.get("https://www.zomato.com/");
		
		//Fetch the title of the Webpage
		String title = driver.getTitle();
		
		System.out.println(" Title of the Webpage: "+title);
	}

}
