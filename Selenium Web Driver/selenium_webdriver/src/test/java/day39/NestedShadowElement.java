package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		driver.manage().window().maximize();
		
		
		
		SearchContext shadow_0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		
		SearchContext shadow_1 = driver.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		
		// nested shadow element
		shadow_1.findElement(By.cssSelector("#nested-shadow-element"));
		
		
		
		
		
		
		
	}

}
