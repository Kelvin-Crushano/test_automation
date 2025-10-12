package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
	/*	// Basic or Normal Alert (contains 'Ok')
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
//		Use this approach if u want to perform multiple actions
		Alert NormalAlert = driver.switchTo().alert();
		System.out.println(NormalAlert.getText());    // retrieve message displayed in alert message
	    NormalAlert.accept();
	    
//	    driver.switchTo().alert().accept();         // Use this way if you want to perform single action
	     */
	    
	/*	// Confirmation Alert (contains 'ok','cancel' button)
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    
		driver.switchTo().alert().accept(); // use 'accept' to close alert window
		driver.switchTo().alert().dismiss(); // use 'dismiss' to cancel alert window
		*/
		
		// Prompt Alert (Contains 'input' fields, 'Ok' button, 'Cancel' button)
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert MyPromptAlert = driver.switchTo().alert();
		 MyPromptAlert.sendKeys("welcome - Kelvin");
		 MyPromptAlert.accept();
	    
	    
	    
		  
	    
		
	}

}
