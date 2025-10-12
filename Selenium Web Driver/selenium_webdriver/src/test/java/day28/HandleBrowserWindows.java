package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://www.gettyimages.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//a[text()='Trends & Insights']")).click();
	    
	      Set <String> windowids = driver.getWindowHandles();
//	      System.out.println("Window Ids are: " + windowids);
	  /*  
	     	// Approach 1 used only when handling 2 or 3 window handles (browser tabs)
	      // converting 'Set' collection to 'List' Collection 
	      List <String> windowlist = new ArrayList<>(windowids);
	      
	      String parentwindowid = windowlist.get(0);
	      String childwindowid = windowlist.get(1);
	    
   	      // Switch to specific windowhandle Id
		    driver.switchTo().window(childwindowid);
		    System.out.println(driver.getTitle());
		    
//    String heading_present = driver.findElement(By.xpath("//h1[text()='VisualGPS: The latest creative trends']")).getText();
//  	      System.out.println(heading_present);
	    
//  	 Boolean heading_present = driver.findElement(By.xpath("//h1[text()='VisualGPS: The latest creative trends']")).isDisplayed();
//	      System.out.println(heading_present);
	   */
	      
	      // Approach 2   (foreach / enhanced for loop)
	      	      
	      for (String winlist:windowids) {
	    	   	  
   	  String title = driver.switchTo().window(winlist).getTitle();
    		
	    	  if (title.equals("Royalty-Free Stock Photos, Creative Images & Vectors | News, Fashion, and Entertainment imagery - Getty Images"))
    	  	    	    {
    		  System.out.println(driver.getCurrentUrl());    
      		     		      	  }   
	    	  
	    	  if (title.equals("VisualGPS | Getty Images"))
	    	       {
	    		  System.out.println(driver.getCurrentUrl());
	    	              }
	    	  
//	    	  else {
//	    		  System.out.println("incorrect title");
//	    	  }
	    	  
	        }
	     
	     
	    
	    
	        
	    
	      
	  }
    }
