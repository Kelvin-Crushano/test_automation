package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();
		
        Actions act = new Actions(driver); 
        
        WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));   // source element
        WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));   // target element
        
        
		act.dragAndDrop(oslo, norway).perform();
		
		
	}

}
