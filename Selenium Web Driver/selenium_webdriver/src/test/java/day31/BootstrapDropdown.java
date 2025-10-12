package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		     //or
//		driver.findElement(By.xpath("//span[contains(@class,'multiselect-selected-text')]")).click();
		
	  // 	select a single option
	//		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
	//	select all options

	List <WebElement> chk_box_lab = driver.findElements(By.xpath("//input[@type='checkbox']/parent::label"));
	 	 System.out.println(chk_box_lab.size());
	 	 
//	  driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));   // all labels (including headings - 14)
//	  driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li/a/label"));   // all labels (including headings - 14)	 
//	  driver.findElements(By.xpath("//ul//label")); // all labels (including headings - 14)
	 	 
	 	
	 	 
	 	 for (WebElement checkBoxLabel : chk_box_lab) {
	 		 System.out.println(checkBoxLabel.getText());
	 		
	 		 if (checkBoxLabel.getText().equals("MySQL") || checkBoxLabel.getText().equals("C#") || checkBoxLabel.getText().equals("Python")) {
	 			    checkBoxLabel.click();
	 		 }
	 		 
	 			 		 
	 	 }
	 	 
	   
	 	 
	 	 
	}

}
