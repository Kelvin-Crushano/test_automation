package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		driver.manage().window().maximize();
		
		// Capture 'Shadow Host' by it's ID and its corresponding 'shadow root'
		SearchContext Shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		
		// Locating 'Shadow Element'
		Shadow.findElement(By.cssSelector("#shadow-element"));  
		
		
		
		
		
		
		
		
		
		
	}

}
