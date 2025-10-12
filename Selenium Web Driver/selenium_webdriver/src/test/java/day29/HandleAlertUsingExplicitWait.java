package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

          // Handling 'Alert' Without using switchTo().alert(); command.

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Text is: " + myAlert.getText());
		myAlert.sendKeys("Welcome Kelvin");
		myAlert.accept();


		// If there is no alert window, 'Alert not found' exception will be displayed.
		
		
		
	}

}
