package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingGetMethod {

	public static void main(String[] args) {
		
		//Launch Empty browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to an application
		driver.get("https://www.zomato.com/");
	}

}
