package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTablewithPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
				
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		driver.manage().window().maximize();
		
		WebElement Admin_sec = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://demo.opencart.com/admin/']")));
		Admin_sec.click();
//		driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/admin/']")).click();
	
		WebElement user_name = driver.findElement(By.xpath("//input[@id='input-username']"));
		user_name.clear();
		user_name.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		driver.findElement(By.xpath("//li[@id='menu-customer']/child::a")).click();
//		driver.findElement(By.xpath("//ul[@id='collapse-5']//li//a[contains(text(),'Customers')]")).click();
		WebElement customers_sub = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='collapse-5']//li//a[contains(text(),'Customers')]")));
		  customers_sub.click();
		  
//		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
//		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
//		Thread.sleep(10000);
//		int p = 1;
		for (int p=1; p<=7; p++) {
			 if (p>1) { // perform below action only if page number is greater than one because page one is already displayed by the time you open the web page.
//			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']/child::li["+p+"]"));
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			active_page.click();
			
			 }
		}
		
		
		
		
	}

}
