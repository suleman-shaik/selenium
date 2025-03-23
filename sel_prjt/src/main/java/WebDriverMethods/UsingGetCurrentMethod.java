package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetCurrentMethod {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to an Application
		driver.get("https://www.zomato.com/");
		
		//Fetch the url of the application
		String url=driver.getCurrentUrl();
		
		System.out.println("The url of Web page is: "+url);
	}

}
