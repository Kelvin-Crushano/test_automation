package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     // Disable message "Chrome is being controlled by automation"
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
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
