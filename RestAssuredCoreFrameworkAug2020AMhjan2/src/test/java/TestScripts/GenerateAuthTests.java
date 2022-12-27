package TestScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Actions.GenerateAuthActions;
import Payloads.GenerateAuthRequests;

public class GenerateAuthTests extends BaseTest{
	
	@Test
	public void testGenerateTOken() {
		
		
		ExtentTest test= extentReportUtils.getExtentReports().createTest("Test for generate auth");
		
		
		GenerateAuthRequests generateAuthRequests = new GenerateAuthRequests();
		generateAuthRequests.setUsername("admin");
		generateAuthRequests.setPassword("password123");
		
		GenerateAuthActions generateAuthActions = new GenerateAuthActions(test);
		
		generateAuthActions.generateAuthToken(generateAuthRequests);
		generateAuthActions.verifyStatusCodeAs(200);
		
		
	}

}
