package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	     driver.get("http://www.samuelgnanam.com/trise");
	     // locating element using link text
	       //driver.findElement(By.linkText("ABOUT US")).click();
	   
	     // locating using class name, Storing in 'List' collection  
	 List<WebElement> headerLinks = driver.findElements(By.className("dropdown-toggle"));
        System.out.println("Total number of web elements: "+ headerLinks.size());
      
        //locating using tag name, Storing in 'List' Collection
             List<WebElement> AnchorTags = driver.findElements(By.tagName("a"));
               System.out.println("Total number of anchor tags: " + AnchorTags.size());
               
	}

}
