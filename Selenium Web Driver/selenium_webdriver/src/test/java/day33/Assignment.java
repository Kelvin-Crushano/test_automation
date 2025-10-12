package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.manage().window().maximize();
		
//		int columns = driver.findElements(By.xpath("//table[@id='productTable']//tr//th")).size();
		
		List<WebElement> total_pages = driver.findElements(By.xpath("//ul[@id='pagination']/child::li"));
		
		for (int p=1; p<=total_pages.size(); p++) {
			
			if (p>1) {
				
			WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']/child::li["+p+"]"));
			active_page.click();
//			Thread.sleep(5000);
			  }
			// reading data from the page (table data) 
			int rows =  driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for (int r=1; r<=rows; r++) { 
				
				String id =	driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]")).getText();
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				WebElement check_box = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input"));
				
				System.out.println(id+" "+name+" "+price);
				Thread.sleep(3000);
				check_box.click();  // performing click action on each check box
			}
		}
		
		
		
		
		
		
		
	
	}

}
