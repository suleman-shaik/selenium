package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinggetPageSource {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Fetch the page source code
		System.out.println(driver.getPageSource());
		
		//only one window closed by using close
//       driver.close();
		
		//close all windows present in the driver control by using quit
		driver.quit();
		}

}
