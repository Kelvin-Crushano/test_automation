package day28;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");    // accepts url in string format, and url object format
		
		URL link = new URL("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.navigate().to(link);  // Passing URL as object
		
		
		driver.manage().window().maximize();
		
		
		

	 }

  }
