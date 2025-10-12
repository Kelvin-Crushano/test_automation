package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        
        driver.manage().window().maximize();
        
        
           /*
        Min_slider.getLocation().getX(); // to get x axis value 
        Min_slider.getLocation().getY(); // to get y axis value
        Min_slider.getLocation();  // to get x and y    */
        
        // Minimum slider
        WebElement Min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        
        System.out.println("location of Minimum slider before moving: " + Min_slider.getLocation());  
        
        Actions act = new Actions(driver);
          
        act.dragAndDropBy(Min_slider, 100, 288).perform(); // 109,288  
        
        System.out.println("current position of mininum Slider: "+ Min_slider.getLocation());  // 158, 250  
        
        // Maximum Slider
        WebElement Max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        
        System.out.println("location of maximum slider: " + Max_slider.getLocation());
        
        act.dragAndDropBy(Max_slider, -200, 288).perform();

        System.out.println("Current location of maximum slder: " + Max_slider.getLocation());
	
	
	}

}
