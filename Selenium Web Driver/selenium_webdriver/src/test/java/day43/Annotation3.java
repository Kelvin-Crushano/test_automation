package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// All annotations

// if you want to see the 'Suite' method you have to run using XML.


public class Annotation3 {
	
	@BeforeSuite
	void BS () {
		System.out.println("This is before suite...");
	}
	
	@AfterSuite
	void AS () {
		System.out.println("This is after suite...");
	}
	
	@BeforeTest
	void bt () {
		System.out.println("This is before test....");
	}
	
	@AfterTest
	void at () {
		System.out.println("This is after test....");
	}
	
	@BeforeClass
	void BC () {
		System.out.println("This is before class");
	}
	
	@AfterClass
	void AC ()  {
		System.out.println("This is after class");
	}
	
	
	@BeforeMethod
	void BM () {
		System.out.println("this is before method....");
	}
	
	@AfterMethod
	void AfterMethod() {
		System.out.println("This is after method....");
	}
	
	
	@Test (priority=1)
	void search () {
		System.out.println("This is search....");
	}
	
	@Test (priority=2)
	void advancedSearch () {
		System.out.println("This is advanced search....");
	}
	
	
	
}
