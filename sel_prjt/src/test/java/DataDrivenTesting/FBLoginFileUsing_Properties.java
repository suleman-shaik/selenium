package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginFileUsing_Properties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/CommomData.properties");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PWD = p.getProperty("password");
		String TIME = p.getProperty("timeouts");
		
		long time=Long.parseLong(TIME);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		
		driver.findElement(By.id("pass")).sendKeys(PWD);
	}

}
