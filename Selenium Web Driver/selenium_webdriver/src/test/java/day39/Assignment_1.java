package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		driver.manage().window().maximize();
		
		// Capture main Shadow DOM
		SearchContext shadow_0 = driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		
		// locating multi-nested shadow element directly from main 'Shadow DOM'
		shadow_0.findElement(By.cssSelector("#input")).sendKeys("Kelvin");
		
		
	}

}
