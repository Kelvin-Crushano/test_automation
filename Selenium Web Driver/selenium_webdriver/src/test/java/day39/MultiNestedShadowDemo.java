package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiNestedShadowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		driver.manage().window().maximize();
		
		// Capture first shadow root from first shadow Host  
		SearchContext shadow_0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		// Capture Inner shadow root from Inner Shadow Host
		SearchContext shadow_1 = driver.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		// Capture multi-nested Shadow root from multi-nested Shadow Host
		SearchContext shadow_2 = driver.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();

		//locating multi-nested shadow element
		shadow_2.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
		
		
	}

}
