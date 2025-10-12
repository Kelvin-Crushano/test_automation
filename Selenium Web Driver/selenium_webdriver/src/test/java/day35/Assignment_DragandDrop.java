package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        driver.manage().window().maximize();
        
        WebElement bank =driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement lis = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
      
        Actions act = new Actions(driver);
        
        act.dragAndDrop(bank, lis).perform();
        
        

	}

}
