package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onStart(ITestContext context) {
	    
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Kelvin");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser Name", "Chrome");
		
	  	}
	
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, "Test case Passed is:" + result.getName()); // log status in the report.
		}
	
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName()); // create new entry in the report
	    test.log(Status.FAIL, "Test case failed is:" + result.getName()); // log status in the report.
		test.log(Status.FAIL,"Test case failed. Cause is:"+ result.getThrowable());// log error message in the report. 
		}
	
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());// create new entry in the report
		test.log(Status.SKIP, "Test case is skipped: "+ result.getName()); // log status in the report.
		}
	
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  	}
	
	
	
	
	

}
