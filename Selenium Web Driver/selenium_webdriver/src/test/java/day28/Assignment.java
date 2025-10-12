package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("kelvin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List <WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/descendant::a"));
            System.out.println("Total links: " + links.size());
            
           
            for (WebElement link : links) {
            	 link.click();   }
        
     /* driver.findElement(By.xpath("//a[text()='Kelvin']")).click();
        driver.findElement(By.xpath("//a[text()='Kelvin Kiptum']")).click();
        driver.findElement(By.xpath("//a[text()='Kelvin Benjamin']")).click();
        driver.findElement(By.xpath("//a[text()='Kelvin MacKenzie']")).click();
        driver.findElement(By.xpath("//a[text()='Kelvin Gastelum']")).click();  */
        
        // Store windowHandles in 'set' collection
        Set <String> windowids = driver.getWindowHandles();
        
           // 'window_id' holds one id at a time in each iteration
         for (String window_id : windowids) {
        	
        String title = driver.switchTo().window(window_id).getTitle();
        
        if (title.equals("Kelvin - Wikipedia") || title.equals("Kelvin MacKenzie - Wikipedia")){
        	    driver.close();
        }
        
       
        }
        
        
	}

}
