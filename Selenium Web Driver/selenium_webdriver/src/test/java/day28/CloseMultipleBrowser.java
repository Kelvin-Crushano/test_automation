package day28;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gettyimages.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Trends & Insights']")).click();
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		
		Set <String> windowids = driver.getWindowHandles();
		
		
		for (String window_id : windowids) {
			
		String title = driver.switchTo().window(window_id).getTitle();	
		
		   if (title.equals("VisualGPS | Getty Images") || title.equals("About Us | Getty Images"))  {
			   driver.close();
		   }
		
		}
		
		
	}

}
