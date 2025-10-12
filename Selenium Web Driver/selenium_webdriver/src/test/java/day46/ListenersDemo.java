package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenersDemo {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	void Setup() throws InterruptedException {
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=1)
	void test_logo() {
		Boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=2)
	void test_url() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
	}
	
	@Test (priority=3, dependsOnMethods={"test_url"}) 
	void test_title() {
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	@AfterClass
	void TearDown() {
		driver.close();
	}
	
	
}
