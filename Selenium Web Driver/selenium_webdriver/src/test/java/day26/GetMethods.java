package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		
		//getTitle();
		String title = driver.getTitle();
		   System.out.println("page title is: " + title);
		   
		   
		   // getCurrenturl();
//		   System.out.println("current URL is: " + driver.getCurrentUrl());
		   
		   // getPageSource();		   
//		   System.out.println(driver.getPageSource());
		   
		     // getWindowHandle();     returns a dynamic window id 
		  String id = driver.getWindowHandle(); 
		   System.out.println("window id is: "+ id);
		   
		      // getWindowHandles();
		    
   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  
   
            Set <String> windowid = driver.getWindowHandles();
              System.out.println(windowid);
              
              
	}

}
