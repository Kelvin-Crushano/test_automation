package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	
	static void select_future_date(WebDriver driver,String year,String month,String day) {
		
		while (true) {
			String curr_dp_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_dp_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if (curr_dp_month.equals(month) && curr_dp_year.equals(year)) {
				 break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // future 
		  	}
		
		  List <WebElement> dp_days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a")); 
			
		  for (WebElement dp_day: dp_days) {
			  
			  if(dp_day.getText().equals(day)) {
				  dp_day.click();
				  break;
			  	}
		  	}
		}
	
	static void select_past_date(WebDriver driver,String year,String month,String day) {
		
		while (true) {
			String curr_dp_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_dp_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if (curr_dp_month.equals(month) && curr_dp_year.equals(year)) {
				 break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  // past
		  	}
		
		  List <WebElement> dp_days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a")); 
			
		  for (WebElement dp_day: dp_days) {
			  
			  if(dp_day.getText().equals(day)) {
				  dp_day.click();
				  break;
			  	}
		  	}
		}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame(0);
		//method 1
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/18/2025"); //mm-dd-yyyy
		
		// method 2  leveraging user-defined method to pick date
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
		select_future_date(driver,"2028","December","18");
		
//		select_past_date(driver,"2020","June","28");
		 
		
		
	}

}
