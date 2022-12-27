package UnitTest;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentReportUtils;

public class TestExtentReportUtils {
	
	public static void main(String[] args) {
		
		ExtentReportUtils extentReportUtils = new ExtentReportUtils("demoReport");
		ExtentTest test= extentReportUtils.getExtentReports().createTest("Test 1");
		test.pass("Step 1 passed");
		test.pass("Step 2 passed");
		test.info("Some info");
		test.fail("Step 3 failed");
		
		ExtentTest test1= extentReportUtils.getExtentReports().createTest("Test 2");
		test1.pass("Step 1 passed");
		test1.pass("Step 2 passed");
		test1.info("Some info");
		test1.fail("Step 3 failed");
		
		extentReportUtils.generateExtentReport();
		
		
		
		
		
	}

}
