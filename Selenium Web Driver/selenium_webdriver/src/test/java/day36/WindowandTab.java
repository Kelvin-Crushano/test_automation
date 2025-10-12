package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowandTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		// opening new tab and focusing on new tab
//		driver.switchTo().newWindow(WindowType.TAB);

		// opening new browser window seperately, focusing on it.
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://blog.payoneer.com/e-sellers/industry-tips-sellers/shipping-lead-time-reduction/");
		
		
		
		
		
		
	}

}
