package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		/* This 'wait' is applicable for every statement in automation script   
		 * Wherever the synchronization problem occur 'implicit wait' will handle it.  
		 * We need to specify implicit wait only once after creating instance for the webdriver.  
		 * 'Implicit wait' is active until you close the instance.           
		 *  Advantage = Even though synchronization problem occur if the web element is immediately available , 
		    the 'implicit wait' do not wait until the time elapses to execute scripts in succession  
		 *	Disadvantage - In case if the element take more time than the set time on 'implicit wait'
		    still execution will throw an exception.
		      */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("kelvin");
		
         
	}

}
