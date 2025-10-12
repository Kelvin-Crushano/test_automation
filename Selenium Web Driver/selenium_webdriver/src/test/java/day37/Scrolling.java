package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/*
		// scroll vertically based on pixel number
		  
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));    
		
		*/
		
		
		  
		// scroll to  the element we need vertically
		WebElement word = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();",word);
		System.out.println(js.executeScript("return window.pageYOffset;")); //print the current location in pixels
		
		
		
		/* 
			// scroll to the bottom of page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Bottom
				System.out.println(js.executeScript("return window.pageYOffset;")); //print the current location in pixels
         Thread.sleep(10000);
      	// scroll to the top of page 
                js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); //Top
                System.out.println(js.executeScript("return window.pageYOffset;")); //print the current location in pixels
       */
		
		
		 
			
		/*
			// scroll to  the element we need horizontally
				WebElement element = driver.findElement(By.xpath(""));
				js.executeScript("arguments[0].scrollIntoView();",element);
				System.out.println(js.executeScript("return window.pageXOffset;")); //print the current location in pixels
		*/
		 
		 

		
		

	}

}
