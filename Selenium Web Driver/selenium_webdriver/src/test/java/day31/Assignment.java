package day31;

import java.time.Duration;
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
		
	    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
	    driver.manage().window().maximize();
	    
	    
	    WebElement select = driver.findElement(By.xpath("//select[@id='country-list']"));
	    
	    Select select_1 = new Select(select);
	    
	    List <WebElement> select_2 = select_1.getOptions();
	    
	    System.out.println("total options: " + select_2.size());
	    
	    for (WebElement Sel : select_2) {
	    	 System.out.println(Sel.getText());
	    	 
	    	}
	    
//	    driver.findElement(By.xpath("//option[@value='3']")).click();
	    
	    select_1.selectByVisibleText("France");
	    

	}

}
