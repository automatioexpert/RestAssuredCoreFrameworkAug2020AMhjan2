package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtils {

	private ExtentReports extentReports;
	
	
	public ExtentReports getExtentReports() {
		return extentReports;
	}

	public ExtentReportUtils(String reportName)
	{
		String filePath = System.getProperty("user.dir")+"/reports/extentReort/"+reportName+".html";
		extentReports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(filePath);
		extentReports.attachReporter(spark);
	}
	
	
	
	public void generateExtentReport()
	{
		extentReports.flush();
	}
}
