package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	// Without using 'Page Factory' approach   
		//Creating Page Object Class

public class LoginPage {
	
	
	WebDriver driver;
	
	// Constructor
	LoginPage (WebDriver driver){
		 this.driver=driver;
		 
	}
	// Locator
	
	By txt_user_name = By.xpath("//input[@placeholder='username']");
	By txt_pasword = By.xpath("//input[@placeholder='password']");
	By btn_login = By.xpath("//button[normalize-space()='Login']");
	
	// Action method
	public void setUserName(String user) {
		driver.findElement(txt_pasword).sendKeys(user);
	}
	
	public void setPassword(String password) {
		driver.findElement(txt_pasword).sendKeys(password);
	}
    
	public void click_login() {
		driver.findElement(btn_login).click();
	}
	
	
}
