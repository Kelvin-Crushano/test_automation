package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
	List <WebElement> chek_box_ids	= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	   /*	
	* Select all check Boxes
    * Using for loop
    * Can't use to select specific check_box     
       */
	    /* for (int i=0; i<chek_box_ids.size(); i++) {
			 
			 chek_box_ids.get(i).click();
			 	 }   */
		
      /* * Select all check Boxes
	     * Using for-each loop / enhanced for loop
	     * Cannot use enhanced for loop to select specific element(checkboxes,etc)     
	   */
	/*	for (WebElement chk_box_id : chek_box_ids) 
		   {
			chk_box_id.click();
		    }   */
		
	    
	
	/* * Select last 3 out of 7 checkboxes
	   * Total number of checkboxes-total number of checkboxes to select= starting index
	     7-3 = 4  */
	    
	/*	for (int i=4;i<=chek_box_ids.size();i++) {
			chek_box_ids.get(i).click();
		}  
	*/
		
		
	
	/* * Select first three checkboxes
	   * for loop   
	     */
	  /*	for (int i=0;i<=2;i++) {
			
			chek_box_ids.get(i).click();
		  }   */
		
	
	
	/*Select first 3 out of 7 check boxes .
	 *   Unselect the selected check boxes.
	 */
	      //for loop
		for(int i=0;i<3;i++) {
		   chek_box_ids.get(i).click(); 
		}
		
	    Thread.sleep(5000);
	         // enhanced for loop
		for(WebElement Chk_box_id : chek_box_ids) {
			 if (Chk_box_id.isSelected()) {
				 Chk_box_id.click();
			 }
		}
		
		
		

	}

}
