package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		 WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//ul[@id='checkout-products']/descendant::label[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		Select mon = new Select(month);
		
		mon.selectByVisibleText("Nov");
		
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1992");
		
	 List <WebElement> days =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
	 	 String st_day = "15";
		for (WebElement day : days) {
			
			if(day.getText().equals(st_day)) {
				day.click();
				break;	
			}
		}
		
		// gender
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		
		// trip type
		driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();
		
//		Thread.sleep(10000);
		
//		WebElement chkbox = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='checkbox']/child::input")));
//		chkbox.click();

//		WebElement chkbox = driver.findElement(By.xpath("//label[@class='checkbox']/child::input"));
		WebElement chkbox = driver.findElement(By.xpath("//label[@class='checkbox']"));

		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].click();", chkbox);
//		Js.executeScript("arguments"[0].click();", chkbox);
		
		/*
		WebElement additional_passengers = driver.findElement(By.xpath("//select[@id='addpaxno']"));
		
		Select addi_pass = new Select (additional_passengers);
		addi_pass.selectByValue("1");  */
		
		
		
}
}