package day37;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		/*
		// single file upload 		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("F:\\G\\Testing\\Selenium with Java\\Selenium WIth Java\\37\\winter slice.webp");
		
		// validating the file
		if (driver.findElement(By.xpath("//ul[@id='fileList']/child::li")).getText().equals("winter slice.webp")) 
		{
			 System.out.println("file uploaded successfully");
		} else {
			 System.out.println("uploading unsuccessful.");
		}   
		*/
		
		
		//Multiple file upload
		String file1 ="F:\\G\\Testing\\Selenium with Java\\Selenium WIth Java\\37\\Multiple upload 1.txt";
		String file2 ="F:\\G\\Testing\\Selenium with Java\\Selenium WIth Java\\37\\Multiple upload 2.txt";
		  // File uploading
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		
		// Find total number of files
		List<WebElement> files = driver.findElements(By.xpath("//ul[@id='fileList']/child::li"));
		System.out.println("total number of files uploaded: " + files.size());
		
		//Validating the files
		if(driver.findElement(By.xpath("//ul[@id='fileList']/child::li[1]")).getText().equals("Multiple upload 1.txt") && driver.findElement(By.xpath("//ul[@id='fileList']/child::li[2]")).getText().equals("Multiple upload 2.txt")) 
		{
			System.out.println("uploaded files are correct");
		} else {
			System.out.println("uploaded files are incorrect");
		}
		
		
		
		
		
		
 		
		
		
		
		
		
		
		
		
		
		
	}

}
