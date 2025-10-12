package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
					
		driver.manage().window().maximize();
		
		// switch to the frame
		driver.switchTo().frame("iframeResult"); //if 'id' or 'name' is present we can specify in double quotes else we can specify as webelement
		                                                                                        
		
		// capture the element
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		
		Actions act = new Actions(driver);
		
		// double click action
		act.doubleClick(button).perform();
		
		
		
		
		

	}

}
