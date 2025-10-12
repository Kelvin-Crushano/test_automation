package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/descendant::a[1]"));
//		WebElement desktops = driver.findElement(By.xpath("//ul[@class='top-menu mobile']//li[1]//ul[1]//a[text()='Desktops ']"));
		WebElement desktops = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"));
		
		
		Actions act = new Actions(driver);
		         //Mouse hover action
		// build().perform() - same 
//		act.moveToElement(computers).moveToElement(desktops).click().build().perform();
		// only perform() - same 
		act.moveToElement(computers).moveToElement(desktops).click().perform();
		
		
	}
	

}
