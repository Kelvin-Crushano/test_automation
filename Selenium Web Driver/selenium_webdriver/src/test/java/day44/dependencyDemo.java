package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyDemo {

	@Test (priority=1)
	void open_app () {
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"open_app"})
	void login () {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search () {
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advanced_search () {
		Assert.assertTrue(true);	
		}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
	
	
	
}
