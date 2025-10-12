package day42;

import org.testng.annotations.Test;

/*
 1. open application
 2. login to application
 3. logout from application
  
 */


public class FirstTestCase {
	
	@Test(priority=1)
	void openApp () {
		System.out.println("open application....");
	}
	
	
	@Test(priority=2)
	void login () {
		System.out.println("login application....");
	}

	
	@Test(priority=3)
	void logout (){
		
		System.out.println("Logout application....");
	}
	

	
	
	
	
}
