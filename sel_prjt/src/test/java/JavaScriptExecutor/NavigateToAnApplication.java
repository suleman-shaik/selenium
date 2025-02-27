package JavaScriptExecutor;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnApplication {
	public static void main(String[] args) throws InterruptedException {
		
		       //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.location=arguments[0]", "https://www.facebook.com/");
				
				//Fetch the title of the WebPage
				System.out.println("Title:"+js.executeScript("return document.title"));
				
				//Fetch the url of the web page
				System.out.println("URL:"+js.executeScript("return document.URL"));
				Thread.sleep(3000);
				
				//Refresh the Web page
				js.executeScript("history.go(0)");
				Thread.sleep(3000);
				//Close the browser
				driver.quit();
	}

}
