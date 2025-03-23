package WebDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingManageMethod {
	
	private static final String Width =null;

	public static void main(String[] args) throws InterruptedException {
//		launch the browser
		WebDriver driver=new ChromeDriver();
		
//      Maximize the window
    	driver.manage().window().maximize();
		Thread.sleep(3000);
		
//      Minimize the window
//      driver.manage().window().minimize();
		Thread.sleep(3000);
		
		//Navigate to an application
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		//Dimension dim=driver.manage().window().getSize();
		//System.out.println("Width,Height: "+ Width);
		//int Width1=dim.getWidth();
		//System.out.println("Width of the webpage : " + Width);
		
//		Point p=driver.manage().window().getPosition();
//		System.out.println(p);
//		System.out.println("on x-aixs: "+p.getX());
//		System.out.println("on y-axis: "+p.getY());
		
		//FullScreen the window
		//driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		
		//driver.manage().window().getPosition();
		//Thread.sleep(3000);
		//driver.manage().window().setSize(null);
		//Thread.sleep(3000);
		
		//close the browser
//		driver.close();
		driver.quit();
	}

	private static Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
