package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		//identfy sigin element
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		
		//wait until sign in element is visible on the webpage
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(signin));
		
		//identify search button
		WebElement search = driver.findElement(By.xpath("//div[contains(text(),'Search for restaurant')]"));
		
		//wait until the element is clickable
		wait.until(ExpectedConditions.elementToBeClickable(search));
		
		search.click();
		
		String title="Order Food & Groceries. Discover the best restaurants. Swiggy it!";
		//wait untill title is visible on the webpage
		wait.until(ExpectedConditions.titleContains(title));
		
		System.out.println("Title is visible on the webpage");
		
		driver.quit();
	}
		
}
