package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drp_country_element = driver.findElement(By.xpath("//select[@id='country']"));
		
		// captured webelement should be passed as "SELECT" class object
		Select drp_down = new Select(drp_country_element);
		
		// select option from the dropdown
		
		drp_down.selectByVisibleText("Canada");
//		drp_down.selectByValue("uk");
//		drp_down.selectByIndex(2);
		
		// capture the options
				// total number of options on dropdown 
		
		  List <WebElement> drop = drp_down.getOptions();  // returns
		     System.out.println(drop.size());
		
		     // list all the options in the dropdown.
		   for (WebElement dropdown : drop) {
			     System.out.println(dropdown.getText());
			       }
		   
		   				// or
		   
		   for (int i=0; i<drop.size(); i++) {
			   System.out.println(drop.get(i).getText());  
		   		}
		   
		   
			   
		   
		   
		   
	}

}
