package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
        driver.manage().window().maximize();
        
//        WebElement field_1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement field_2 = driver.findElement(By.xpath("//input[@id='field2']"));
        
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        Actions act = new Actions(driver);  // defining Actions class and passing 'driver' object
        
        // performing double click action
        act.doubleClick(button).perform();
        
        String expected = "Hello World!";
        
        //validating the expected result
        if(field_2.getAttribute("value").equals(expected)) {
        	
        	System.out.println("Copied correctly");
        	
        } else {
        	
        	System.out.println("Copied incorrectly");
        }
        
     
	}

}
