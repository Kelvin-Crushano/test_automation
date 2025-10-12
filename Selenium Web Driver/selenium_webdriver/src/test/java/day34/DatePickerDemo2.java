package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
		// converting string type month to object
	static Month convert_month(String month) {    // predefined enum class
		
		HashMap<String,Month> monthMap = new HashMap<String, Month>(); // hashmap is a collection
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);  // string converted to object
		
		if (vmonth == null) {
			System.out.println("invalid month...");
		}
		
		return vmonth;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/"); // date picker is invalid
		
		driver.manage().window().maximize();
		
		
		  String required_year = "2021";
		  String required_month = "June";
		  String required_day = "22";
		 
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		// select year
		WebElement year_dropdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yr_select = new Select(year_dropdown);		
		yr_select.selectByVisibleText(required_year);
		
		
		while (true) {
		 // capture current month
//		String current_month = driver.findElement(By.xpath("")).getText();
		
		// convert expected month, and current month to object
		Month expected = convert_month(required_month);
//		Month current = convert_month(current_month);
		
		// perform comparison
		int result = expected.compareTo(current);
		/*
		 * if result is 0 - expected and current month equal
		 * if result >0  - expected month is in future
		 * if result is <0 - expected month is in past
		 */
		 
		if (result<0) {
			// select past month
		}
		else if(result>0) {
			// select future month
		}
		else {
			 break;
		} 
		
		}
		
		
		
		
		
		
	}

}
