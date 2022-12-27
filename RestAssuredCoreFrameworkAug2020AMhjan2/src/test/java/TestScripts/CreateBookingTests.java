package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Actions.CreateBookingActions;
import Models.BookingDates;
import Payloads.CreateBookingRequest;
import Payloads.CreateBookingResponse;
import Utilities.ExcelUtils;
import Utilities.ExtentReportUtils;

public class CreateBookingTests extends BaseTest{
	
	@DataProvider
	public Object[][] getDataForCreateBooking() throws EncryptedDocumentException, IOException
	{
		ExcelUtils excelUtils = new ExcelUtils("CreateBooking.xlsx");
		return excelUtils.getDataForDataProvider("Sheet1");
	}
	
	@Test(dataProvider = "getDataForCreateBooking") 
	public void createBooking(String firstName, String lastName, String totalPrice, String depositPaid, String checkIn, String checkOut, String addNeeds, String scenarioName)
	{
		
		ExtentTest test= extentReportUtils.getExtentReports().createTest("Create booking for "+scenarioName);
		// Create payload
		CreateBookingRequest createBookingRequest = new CreateBookingRequest();
		createBookingRequest.setFirstname(firstName);
		createBookingRequest.setLastname(lastName);
		createBookingRequest.setAdditionalneeds(addNeeds);
		createBookingRequest.setDepositpaid(Boolean.parseBoolean(depositPaid));
		createBookingRequest.setTotalprice(Integer.parseInt(totalPrice));
		
		BookingDates bookingdates = new BookingDates();
		bookingdates.setCheckin(checkIn);
		bookingdates.setCheckout(checkOut);
		createBookingRequest.setBookingdates(bookingdates);
		
		CreateBookingActions createBookingActions = new CreateBookingActions(test);
		createBookingActions.createBooking(createBookingRequest);
		
		Assert.assertTrue(createBookingActions.verifyStatusCodeAs(200));
		Assert.assertTrue(createBookingActions.verifyBookingIdGenerated());	
		
	}
	
	

}
