package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://demo.nopcommerce.com/");
        
        driver.manage().window().maximize();
        
        // capture the element 
        WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        
        Actions act = new Actions(driver);
        
        // perform ctrl + click 
        act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
        
        
        Set <String> windowIds = driver.getWindowHandles();
        
        List<String> windowId = new ArrayList<>(windowIds);
        
//           String Parent = windowId.get(0);
          String child = windowId.get(1);
          
          driver.switchTo().window(child);
          
          driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kelvin");
          

	}

}
