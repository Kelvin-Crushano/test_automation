package day32_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticTable {
	
	WebDriver driver;
	
	
  @Test (priority=1)
  public void openapp() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
  }
  
   
  	@Test(priority=2)
    public void print_table () {
  		
  		int total_rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
  		int total_columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
  		
    	  for (int r=2; r<=total_rows; r++) {
			  
			  for (int c=1; c<=total_columns; c++) {
				  
				  String Value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  // passed parameter on xpath
				  System.out.print(Value + "\t");
				}
			  	  System.out.println();
		  }
      }
  
  	@Test (priority=3)
	public void closeapp() {
	  	  
	  	  driver.close();
	    }
  
  
  
}
