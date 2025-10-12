package day27;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver) // 'FluentWait' class implemented wait interface 
			       .withTimeout(Duration.ofSeconds(10))    // Maximum duration for waiting.
			       .pollingEvery(Duration.ofSeconds(2))    // Script checks for the element every 2seconds.
			       .ignoring(NoSuchElementException.class);   /* script checks for element in every(ex: 2sec) interval, 
			                                                      Unless the element is found exception will be ignored 
			                                                      until it reaches the maximum time limit (ex: 10seconds) */  
		 
		driver.manage().window().maximize();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		 
//	     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("kelvin");
		 
			   WebElement username_input = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			     }
			   });
			   
			   username_input.sendKeys("kelvin-fluent wait");
			   
			   
			   
			   
			    }
         }
