package day38;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// 1. Take a screenshot of entire page
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source_file = ts.getScreenshotAs(OutputType.FILE);
		   File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\full_page.png");
		   source_file.renameTo(targetFile);    // copy the source file to target location 
		
		// 2. Take screen shot of particular section or area
		   
		 WebElement featured_products = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		   
		   File featured_products1 = featured_products.getScreenshotAs(OutputType.FILE);
		   File targetFile1 = new File(System.getProperty("user.dir")+"\\Screenshots\\featured_products.png");
		   featured_products1.renameTo(targetFile1);
		   
		// 3. capture the screen shot of specific element
		   
		    WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
	
		    File button_1 = button.getScreenshotAs(OutputType.FILE);
		    File targetFile2 = new File(System.getProperty("user.dir")+"\\Screenshots\\button.png");
			   button_1.renameTo(targetFile2);
			   
			   driver.quit();

		    
		    
	}

}


