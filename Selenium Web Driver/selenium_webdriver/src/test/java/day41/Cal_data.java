package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cal_data {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		String filepath = System.getProperty("user.dir")+"\\Test Data\\Cal_Data.xlsx";   // capture utility file or test data path
		
		int rows = ExcelUtils.get_row_count(filepath,"Sheet1");
		
		
		for(int i=1; i<=rows; i++) {
			
			// 1. read data from Excel
			String principle = ExcelUtils.getCelldata(filepath, "Sheet1", i, 0);
			String int_rate = ExcelUtils.getCelldata(filepath, "Sheet1", i, 1);
			String term = ExcelUtils.getCelldata(filepath, "Sheet1", i, 2);
			String term_type = ExcelUtils.getCelldata(filepath, "Sheet1", i, 3);
			String int_type =ExcelUtils.getCelldata(filepath, "Sheet1", i, 4);
			
			String exp_mat_valu = ExcelUtils.getCelldata(filepath, "Sheet1", i, 5);
			
			// 2. pass data into application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(int_rate);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(term);
			
			WebElement term_ele = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select sel_term = new Select(term_ele);
			sel_term.selectByVisibleText(term_type);
			
			Select int_type_ele = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			int_type_ele.selectByVisibleText(int_type);

			driver.findElement(By.xpath("//div[@class='CTR PT15']/child::a[1]")).click();
			
			// 3. validation
			
			String value = driver.findElement(By.xpath("//span[@id='resp_matval']/child::strong")).getText();
			
			if (Double.parseDouble(exp_mat_valu)==Double.parseDouble(value)) {  // Converting string to double and comparing
					System.out.println("Test Passed");
					ExcelUtils.writedata(filepath, "Sheet1", i, 7, "Passed");
					ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
				} else {
					System.out.println("Test Failed");
					ExcelUtils.writedata(filepath, "Sheet1", i, 7, "Failed");
					ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
					
				}
				 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='CTR PT15']/child::a[2]")).click();
			
				}
				driver.quit();		
		
		
		
		
		
		
		
		
	}

}
