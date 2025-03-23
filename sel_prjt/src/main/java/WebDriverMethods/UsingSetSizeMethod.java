package WebDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingSetSizeMethod {

	public static void main(String[] args) {
		
//		launch the browser
		WebDriver driver=new ChromeDriver();
		
//      Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an application
		driver.get("https://www.myntra.com/");
		
		//Set size of the webpage
		Dimension dim=new Dimension(500,200);
		driver.manage().window().setSize(dim);
		System.out.println(driver.manage().window().getSize());
		
		driver.quit();
	}

}
