package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	
	@Test
	void xyz () {
		System.out.println("this is xyz");
	}
	
	
	@AfterTest
	void at () {
		System.out.println("This is after test....");
	}
	
}
