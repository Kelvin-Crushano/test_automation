package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dummy-tickets.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Both']")).click();
		
		WebElement form1 = driver.findElement(By.xpath("//form[@id='both_oneway']"));
//		Thread.sleep(5000);
		driver.switchTo().frame(form1);
		
		
		driver.findElement(By.xpath("//label[text()='From']/child::input")).sendKeys("chen");
	
	}

}
