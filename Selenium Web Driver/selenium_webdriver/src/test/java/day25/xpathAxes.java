package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.samuelgnanam.com/communication");
		driver.manage().window().maximize();
		
		// Locating descendants through Ancestor
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']/descendant::input[1]")).sendKeys("Kelvin1");
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']/descendant::input[2]")).sendKeys("Kelvin2");
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']/descendant::textarea")).sendKeys("Message");
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']/descendant::input[last()]")).sendKeys("Kelvin2");
             
		    /* can use '//' instead of 'descendant::' keyword to locate descendant     */
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']//input[1]")).sendKeys("Kelvin1");
//		driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']//input[2]")).sendKeys("Kelvin2");

		
//		String xpathAxes = driver.findElement(By.xpath("//div[@class='col-lg-offset-2 col-lg-8 col-md-12 col-sm-12 col-xs-12']/descendant::label[2]")).getText();
//	     System.out.println(xpathAxes);
		
              // Locating child through parent
		
//		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@name='name']")).sendKeys("child-kelvin");            incorrect method 
//		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@name='email']")).sendKeys("kelvinmmx@gmail.com");      incorrect method
	
//		driver.findElement(By.xpath("//div[@class='form-group']/child::input")).sendKeys("child-kelvin");          correct method
	
//		Boolean name = driver.findElement(By.xpath("//*[@for='name']")).isDisplayed();
//		    System.out.println(name);
		    
	    
		       //   locating through following sibling
//		  driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("kelvinmmx@gmail.com");
				
		      //   locating through preceding sibling
//	      String label = driver.findElement(By.xpath("//input[@id='txtname']/preceding-sibling::label")).getText();
//		               System.out.println(label);
		
		      //   locating through self axis       
//		  driver.findElement(By.xpath("//input[@id='txtemail']/self::input")).sendKeys("email");
		  
		     // locating 'following' element (may or may not be siblings)    
//		  driver.findElement(By.xpath("//label[text()='Name']/following::input[2]")).sendKeys("Kelvinmmx@gmail.com");
		        
		        // locating 'preceding' element (may or may not be siblings)        
//		  driver.findElement(By.xpath("//label[text()='Message']/preceding::input[2]")).sendKeys("preceding input");
		  
		
		  
	}

}
