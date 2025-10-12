package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	// Using Page Factory Approach
	// Creating Page Object Class
	
	WebDriver driver;
	
	// constructor
	LoginPage2 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);    // mandatory
	}
	
	// Locators
	
	//@FindBy(how=How.XPATH,using="//input[@placeholder='Username']") WebElement txt_user_name;
	
	@FindBy(xpath="//input[@placeholder='username']") WebElement txt_user_name;
	@FindBy(xpath="//input[@placeholder='password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;

	
	// Actions
	
	public void setUsername(String userName){
		txt_user_name.sendKeys(userName);
	}
	
	public void setPassword(String password){
		txt_password.sendKeys(password);
	}
	
	public void btn_login() {
		btn_login.click();
	}
	
	
	

}
