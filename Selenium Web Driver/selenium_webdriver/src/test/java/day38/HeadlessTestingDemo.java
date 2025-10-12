package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new","user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demo.nopcommerce.com/");
		
		String title = driver.getTitle();
		
		if (title.equals("nopCommerce demo store")) {
			System.out.println("Test passed");
		} else {
			 System.out.println("test failed");
		}
		
		
		
		
		
		
		
		
	}

}
