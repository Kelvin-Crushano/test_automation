package pageObjects;

//import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver){
		   super(driver);
	}
	
	// locator
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_fname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_pw;
	@FindBy(xpath="//input[@name='agree']") WebElement btn_toggle;
	
	@FindBy(xpath="//div[@id='content']/child::h1") WebElement message;
//	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement message1;
//	@FindBy(xpath="//div[@id='content']/child::p[1]") WebElement message2;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement btn_cont;
	

   // Action Method
	public void SetFname(String fname) {
		txt_fname.sendKeys(fname);
	}
	
	public void SetLname(String lname) {
		txt_lname.sendKeys(lname);
	}
	
	public void SetEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void SetPassword(String pw) {
		txt_pw.sendKeys(pw);
	}
	
	public void ChkToggle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",btn_toggle);
		 js.executeScript("arguments[0].click()",btn_toggle);
//		btn_toggle.click();;
	}
	
	public void ButtonCont() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",btn_cont);
//		btn_cont.click();
		
//		Sol 1
//		btn_cont.submit();
	
//		Sol 2
//		Actions act = new Actions(driver);
//		act.moveToElement(btn_cont).click().perform();
	
//		Sol 3
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",btn_cont);
		
//		Sol 4
//		btn_cont.sendKeys(Keys.RETURN);
		
//		Sol 5
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
//		mywait.until(ExpectedConditions.elementToBeClickable(btn_cont)).click();
		
		}
	
	    public String confirm_message() {
	    	 try {
	    		 return (message.getText()); // if the confirm message not displayed or incorrect exception is thrown.
	    	 } catch (Exception e) {      // catch the exception
	    		 return (e.getMessage()); // exception message is returned
	    	 }
	    }
	
	
	
	
	
}
