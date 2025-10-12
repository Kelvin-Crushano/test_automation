package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//input[@id='name']"));
		
		WebElement male_rb = driver.findElement(By.xpath("//input[@id='male']"));
		
		// Alternative of sendKeys()
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('Value','Kelvin')", input); // method will set value attribute of input box as "Kelvin" 
		
		// Alternative of click() 
		js.executeScript("arguments[0].click()", male_rb); // method will perform click
		 
		
		
		
		
		
		

	}

}
