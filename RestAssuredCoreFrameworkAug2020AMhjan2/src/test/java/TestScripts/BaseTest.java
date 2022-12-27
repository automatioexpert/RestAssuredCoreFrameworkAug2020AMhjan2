package TestScripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.ExtentReportUtils;

public class BaseTest {
	
	static ExtentReportUtils extentReportUtils;
	
	@BeforeSuite
	public void setUp()
	{
		extentReportUtils = new ExtentReportUtils("RestFullBookerApiTestReport");
	}
	
	@AfterSuite
	public void tearDown()
	{
		extentReportUtils.generateExtentReport();
	}

}
