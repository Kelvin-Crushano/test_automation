package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select depart = new Select(departure);
		depart.selectByVisibleText("Boston");
		
		WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select dest = new Select(destination);
		dest.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		List <WebElement> price = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
 	    
		 List<Double> prices = new ArrayList<>();   // creating an arraylist
		 
		 for (WebElement pri : price) {
			String price_text = pri.getText().replace("$", "").trim(); 
			
			double price_double = Double.parseDouble(price_text);
			prices.add(price_double);   // adding into arraylist
		 }
		 
		 Collections.sort(prices);
		 System.out.println(prices); // sorted in ascending order
		 
		 
		 
		 
		 // click on corresponding button of the lowest price
		 
		 List <WebElement> row = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
				 
		 for (int r=1;r<=row.size();r++)  {
			 
			String price_s = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
//			double price_double = Double.parseDouble(price_s);
			WebElement button = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[1]"));
			
			if (price_s.equals("$200.98")) {
				  button.click();
				  break;
			}
		 }
		
		 
		 
		 
	}

}
