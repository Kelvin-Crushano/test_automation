package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		
		List <WebElement> link = driver.findElements(By.tagName("a"));
		
		int broken_Link=0;
		
		for (WebElement lin : link) {
			  
			String href = lin.getAttribute("href");
			
			if (href==null || href.isEmpty()) {
				  System.out.println("href attribute value is null or empty. so impossible to check if it's a broken link");
				  continue; 
				  }
			
			try { 
				URL link_url = new URL(href);  // converted 'href' value from string to URL format
				HttpURLConnection connlinkURL = (HttpURLConnection) link_url.openConnection(); // open/establish connection to the server
				connlinkURL.connect(); // connect to server, send request to server
				
				if(connlinkURL.getResponseCode()>=400) 
				{ 
					System.out.println(href + "===>its a broken link"); 
					broken_Link++;
					
				} else {
					System.out.println(href + "===>its not a broken link");
				}
			}  
			catch(Exception e) {
				
			}
			
		
		}
			
		System.out.println("Total number of broken links: " + broken_Link);
		
			
		
		 
		
	}

}  
