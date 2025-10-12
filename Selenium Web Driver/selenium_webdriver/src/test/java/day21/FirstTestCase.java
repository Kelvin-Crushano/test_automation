package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.out.println("Kelvin...");
	   
	   // Lauch chrome browser
	  // ChromeDriver driver = new ChromeDriver(); 
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.youtube.com/"); 
	   
	   
	   String act_title = driver.getTitle();
	      if(act_title.equals("YouTube"))
	      		{
	    	  System.out.println("Test Pass"); 
	      		}
	      		else {
	    		  System.out.println("Test Fail");
	    	  	} 
	      
	      driver.quit();
	   
	}

}
