package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_AccontRegistrationTest extends BaseClass {
	
	@Test
	public void verify_account_registration() throws InterruptedException  {
		
		 logger.info("*** Starting TC001_AccontRegistrationTest ***");
		try {
		 HomePage hp = new HomePage(driver);
		
		 hp.clk_account();
		 logger.info("*** Starting clicked on account ***"); 
		 
		 hp.clk_register();
		 logger.info("*** clicked on register ***");
		 
		 RegisterPage rp = new RegisterPage(driver);
		 
		 logger.info("*** Enter customer details ***");
		 rp.SetFname(randomString().toUpperCase());
		 rp.SetLname(randomString().toUpperCase());
		 rp.SetEmail(randomString()+"@gmail.com");
		 rp.SetPassword(randomNumber());
		
		 rp.ChkToggle();
		 rp.ButtonCont();

		 Thread.sleep(3000);
		 
		 logger.info("*** Validating message ****");
		 	 
		 String cnfrm_msg = rp.confirm_message();
		 Assert.assertEquals(cnfrm_msg, "Your Account Has Been Createddddd!");
		} 
		catch(Exception e) {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.fail();
		}
		 
	}
	
	/*
	public String randomString() {
	String kevin = RandomStringUtils.randomAlphabetic(5);
	return kevin;
	}    */
	
	
	
}
