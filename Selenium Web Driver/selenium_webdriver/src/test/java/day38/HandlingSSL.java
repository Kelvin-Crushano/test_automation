package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(true);   // accept ssl certificate
		
		WebDriver driver = new ChromeDriver(ssl); 
		driver.get("https://expired.badssl.com/");
		
		System.out.println("title of the page: "+driver.getTitle());  
		
		
		
		  
		
		
		
		

	}

}
