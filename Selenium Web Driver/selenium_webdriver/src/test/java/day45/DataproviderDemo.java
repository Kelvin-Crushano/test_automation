package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup () {
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
	}

	@Test(dataProvider="dp")
	void testlogin (String Email, String Password) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Boolean header_status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		
		if(header_status==true) {
			driver.findElement(By.xpath("//div[@class='list-group']/child::a[13]")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown () {
		driver.close();
	}
	
	@DataProvider (name="dp")
	Object[][] loginData()
	{
		Object data[][]= 
				{
					{"abc@gmail.com","test123"},
					{"xyz@gmail.com","test012"},
					{"john@gmail.com","test@123"},
					{"kelvinmmx@gmail.com","polo123"},
					{"johncanedy@gmail.com","test"},
				};
		return data;
		
	}
	
	
}
