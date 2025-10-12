package day38;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		
		//  paste the path of CRX file of a specific extension
		File file = new File ("F:\\G\\Testing\\Selenium with Java\\Selenium WIth Java\\38\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		
		option.addExtensions(file);
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();

		
		
		
		
		
		
	}

}
