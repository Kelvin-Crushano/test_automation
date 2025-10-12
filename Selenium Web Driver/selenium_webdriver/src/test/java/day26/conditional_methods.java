package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		// isDisplayed();
		 
		Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		      System.out.println("Is logo displayed: " + logo);
		
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		     System.out.println("Logo Webelement displayed: " + logo.isDisplayed());
		      
		    
		      // isEnabled();
		      		     
//		Boolean male = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
//		  System.out.println("Is radio Button enabled: " + male);
	         	  
//		  WebElement radio_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
//                  System.out.println("Is radio button enabled: " + radio_button.isEnabled());
        
		  
		 Boolean input = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
                   System.out.println("Input box is enabled: " + input);
                    
//         WebElement input = driver.findElement(By.xpath("//input[@id='FirstName']"));
//            System.out.println("Input box is enabled: " + input.isEnabled());
                   
                   
              // isSelected();
                   
             WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
             WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
             
             System.out.println("male radio button selected: " + male_rb.isSelected());
             System.out.println("female radio button selected: " + female_rb.isSelected());
            
             
             female_rb.click();
             
             System.out.println("Male radio button selected: "+ male_rb.isSelected());
             System.out.println("Female radio button selected: " + female_rb.isSelected());
             
             
             
             
            
                  
	}

}
