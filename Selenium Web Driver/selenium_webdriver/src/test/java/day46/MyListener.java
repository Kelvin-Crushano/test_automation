package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
	    System.out.println("Test execution has started"); 
	    
	  }
	
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test start");
	  }

	
	public void onTestSuccess(ITestResult result) {
	      System.out.println("Test pass");
	  }
	
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test failed");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test Skipped");
	  }
	
	 public void onFinish(ITestContext context) {
	    System.out.println("Test execution has ended");
	  }
	
	
}
