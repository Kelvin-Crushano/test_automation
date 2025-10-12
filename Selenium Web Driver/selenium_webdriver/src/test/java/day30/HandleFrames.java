package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		// frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys(" frame 1");
		
		driver.switchTo().defaultContent();
		
		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame 2 Kelvin");
		
		driver.switchTo().defaultContent();
		
		// frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame 3 Kelvin");
		
		      // Switch to iframe (use index if the frame contains only one inner-frame(iframe)
		driver.switchTo().frame(0);
		
		     //open iframe on seperate page, inspect and locate the element
		driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
		
        driver.switchTo().defaultContent(); 
        
      /*  // perform action using javascript executor
        
   WebElement rd_button =
      driver.findElement(By.xpath("//span[normalize-space()='I am a human']"));
           
	 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0]", rd_button.click());
        
        */
        
        //frame 5
        
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
             driver.switchTo().frame(frame5);
             
             driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
             
           Boolean logo = driver.findElement(By.xpath("//a[@id='logo']/child::img")).isDisplayed();
             System.out.println("Is logo displayed: " + logo);
             
             driver.switchTo().defaultContent();
             
             
	}

}
