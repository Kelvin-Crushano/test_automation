package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// count rows
		List <WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
	
		    		  // or
		
		int table_row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		  System.out.println("Total numbe of rows: " + table_row);
		
	   // count columns
		  List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		  System.out.println("Total number of columns: " + columns.size());
		
		         	// or
		  
		  int table_col = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		  System.out.println("Total number of columns: " + table_col);

		  // read data from 5th row and first column
		  
		  String row_data_1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		  System.out.println(row_data_1);  // Master In Selenium 
		  
		  String row_data_2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();  
		  System.out.println(row_data_2);  // Javascript
		  
		  // Retrieve all data from table. (leveraged nested for loop)
		  
		  System.out.println("Bookname" + "\t" + "Author" +"\t" + "Subject" + "\t" + "Price");
		  for (int r=2; r<=rows.size();r++) {
			  
			  for (int c=1; c<=columns.size();c++) {
				  
				  String Value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  // passed parameter on xpath
				  System.out.print(Value + "\t");
				}
			  	  System.out.println();
		  }
		  
		  // display total and list of author's names  (capturing all authors at once and printing)
		  List <WebElement> authors = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[2]"));
		  System.out.println(authors.size());
		 
		  for (WebElement auth : authors) {
			  System.out.println(auth.getText());
		  }
		  
		  
		  /* checks each and every author's name individually
		   * if the specific author is found eg: Mukesh
		   * print their name coupled with their book name 
		   										*/
		  for (int r=2; r<=rows.size(); r++) {
			  
			  String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
                     
			  if(author.equals("Mukesh")) {
				String book_name =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(book_name +" - "+  author);
			  }
		}
		  
		  
		  // find total of all prices  (for loop)
		  int sum =0;
		  for (int r=2; r<=rows.size(); r++) {
		  
		  String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		  sum += Integer.parseInt(price);
		     }
		  System.out.println(sum);

		  
		  // find total of all prices (enhanced for loop)
		List <WebElement> prices = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
		  
			int book_price_total = 0;
		  for (WebElement price_1 : prices) {
			  
			 String amount = price_1.getText();
			 book_price_total += Integer.parseInt(amount);
		  }
		  
		  System.out.println("total of book prices: "+ book_price_total);
		  
		  
		  
		  
		  
	}
	
}
