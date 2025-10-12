package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * login   (before method)
 * search    (@Test)
 * logout  (after method)
 * 
 * login
 * advanced search    (@Test)
 * logout
  
 */

public class Annotation1 {
	
	@BeforeMethod
	void login () {
		System.out.println("this is login....");
	}
	
	@Test (priority=1)
	void search() {
		System.out.println("This is search...");
	}
	
	@Test (priority=2)
	void advancedSearch() {
		System.out.println("This is advanced search...");
	}
	
	
	@AfterMethod
	void logout() {
		System.out.println("this is logout...");
	}
	
	
	
	}
