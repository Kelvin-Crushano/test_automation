package day22;
  
   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
public class locatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
	   driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		    
	//	driver.findElement(By.name("search_query")).sendKeys("Maven");
		
	   Boolean logo_is_displayed = driver.findElement(By.id("logo-icon")).isDisplayed();
		 System.out.println(logo_is_displayed);
		  
					
	}

}
