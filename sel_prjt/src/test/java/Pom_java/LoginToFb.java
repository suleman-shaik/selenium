package Pom_java;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Utility.LoginPomPage;

public class LoginToFb {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis= new FileInputStream("./src/test/resources/PomLoginToFb.properties");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String URL=p.getProperty("url");
		String UN=p.getProperty("un");
		String PWD=p.getProperty("pwd");
		
		
		LoginPomPage l=new LoginPomPage(driver);
		
		driver.get(URL);
		
		//Verification
		if(l.getHeader().contains("Facebook helps you")) {
			l.getUn().sendKeys(UN);
			l.getPwd(PWD);
			l.getLogin_btn();
			
			WebElement user=driver.findElement(By.id("email"));
			user.sendKeys("sele");
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			user.sendKeys("abc123");
			
			driver.quit();
			
		}
		

		
		
		
	}

}
