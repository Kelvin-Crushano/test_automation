package day42;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1. Open Application
 * 2. test logo presence
 * 3. login
 * 4. close
 */



public class OrangHRM {
	 WebDriver driver;
	 
  @Test(priority=1)
  public void open_app() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
     }
  
  @Test(priority=2)
  public void test_logo() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  Boolean logo_present = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(); 
	  System.out.println("Logo is present: "+ logo_present);
  }
  
  @Test(priority=3)
  public void login() {
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @Test(priority=4)
  public void logout() {
	  
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

	  List <WebElement> drop = driver.findElements(By.xpath("//ul[@role='menu']/descendant::a"));
	  System.out.println(drop.size());
	  
	  for (WebElement dr : drop) {
		 
		  if(dr.getText().equals("Logout")) {
        	 dr.click();
          }
		  
		  
	     
	  }
	    
  }
  
  
  
  
}
