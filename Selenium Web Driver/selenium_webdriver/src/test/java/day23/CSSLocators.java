package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
              WebDriver driver = new ChromeDriver();
              
              driver.get("http://www.samuelgnanam.com/register");
	         
              // maximise browser window
              driver.manage().window().maximize(); 
              
         /* locate element using Id. Tag name is optional */  
              
        // driver.findElement(By.cssSelector("input#firstname")).sendKeys("Kelvin");
        // driver.findElement(By.cssSelector("#firstname")).sendKeys("Kelvin");
              
       /* locate element using class name (enter a part of class name) 
                 Tag name is optional
             */   
	//  driver.findElement(By.cssSelector("input.form-control")).sendKeys("Varatharaj");
	  //driver.findElement(By.cssSelector(".form-control")).sendKeys("Varatharaj");

          /* locate element using tag attribute (eg: placeholder, name, etc) must be unique   */    
       // driver.findElement(By.cssSelector("input[placeholder='yyyy/mm/dd']")).sendKeys("1992 1115");
      // driver.findElement(By.cssSelector("input[name='dob']")).sendKeys("19921115");
     //driver.findElement(By.cssSelector("input[placeholder=\"1992\"]"));   
      
    /* locate element using tag, class, [attribute=''] (eg: placeholder, name, etc) attribute must be unique  */     
   //findElement(By.cssSelector("input.form-control[name='firstname']")).sendKeys("kelvin");    //with tag name
    driver.findElement(By.cssSelector(".form-control[name='firstname']")).sendKeys("kelvin");   // without tag name
     
	  
	  
	}

}
