package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.uk/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
//			 System.out.println(list.size());
			 
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(list.size());
		
		
		for (WebElement li : list) {
			if (li.getText().equals("selenium download")) {
				 li.click(); 
				 break;   // Exits the loop immediately after finding and clicking the desired element.
			}
		}

		
		
	}

}
