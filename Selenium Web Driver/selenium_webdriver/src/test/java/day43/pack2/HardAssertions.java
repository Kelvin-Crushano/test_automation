package day43.pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	
	@Test
	void assertion () 
	{
		
//		Assert.assertEquals("abc" , "xyz");
//		Assert.assertEquals(123,678);
		
		
//		Assert.assertNotEquals(123, 978);    // pass
//		Assert.assertNotEquals(123, 123);    // fail
		
		
//		Assert.assertTrue(false);   // fail
//		Assert.assertTrue(true);     // pass
//		Assert.assertTrue(1==2);  // fail
		
//		Assert.assertFalse(1==2);  // pass
//		Assert.assertFalse(1==1);  // fail
		
		Assert.fail();
				
	}
	
	

}
