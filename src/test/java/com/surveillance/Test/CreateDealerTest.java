package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.DealerRepo;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class CreateDealerTest extends BaseTest {

	DealerRepo repo = new DealerRepo();

	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public CreateDealerTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport() {
		beforeClassForChild(this);
	}

//  1.  ---- CreateRETLDealer Script ----- 	
	@Test(priority = 0, dataProvider = "setData1")
	public void CreateRETLDealer(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create RETL Dealer");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaio = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		String channel = h2.get("channel");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.SelectChannel(channel).Wait();
		repo.ChannelButton();
		repo.submitButton().Wait();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		String getdlrname = repo.getdealerName();
		String getdlrcode = repo.getdealercode();
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "LoginTest1", xls);
	}

//2. ---- CreateRIADealer ----- 
	@Test(priority = 1, dataProvider = "setData2")

	public void CreateRIADealer(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create RIA Dealer");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaio = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.submitButton();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		// this will get the value of dealer name from the text box
		String getdlrname = repo.getdealerName();
		// this will get the value of dealer code from the text box
		String getdlrcode = repo.getdealercode();
		// This will get the Expected Message
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		// This will print the Actual ouput in the application
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}

	@DataProvider
	public Object[][] setData2() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "Validate RIA Type dealer to be create", xls);
	}

	// 3. ---- CreateDCIODealer ----- //
	@Test(priority = 2, dataProvider = "setData3")

	public void CreateDCIODealer(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create DCIO Dealer");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaio = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.submitButton();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		String getdlrname = repo.getdealerName();
		String getdlrcode = repo.getdealercode();
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}

	@DataProvider
	public Object[][] setData3() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "Validate DCIO Type dealer to be create", xls);
	}

// 4.---- CreateVAIODealer - type 1 ----- 
	@Test(priority = 3, dataProvider = "setData4")
	public void CreateVAIODealerType1(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create VAIO Dealer Type 1");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaiosegment = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.VAIOsegment(vaiosegment).Wait();
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.submitButton();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		String getdlrname = repo.getdealerName();
		String getdlrcode = repo.getdealercode();
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}

	@DataProvider
	public Object[][] setData4() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "Validate VAIO Type1 dealer to be create", xls);
	}

// 5. ---- CreateVAIODealer - type 2 ----- 
	@Test(priority = 4, dataProvider = "setData5")

	public void CreateVAIODealerType2(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create VAIO Dealer Type 2");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaiosegment = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.VAIOsegment(vaiosegment).Wait();
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.submitButton();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		String getdlrname = repo.getdealerName();
		String getdlrcode = repo.getdealercode();
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}

	@DataProvider
	public Object[][] setData5() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "Validate VAIO Type2 dealer to be create", xls);
	}

	// 6.---- CreateVAIODealer - type 3 ----- //
	@Test(priority = 5, dataProvider = "setData6")
	public void CreateVAIODealerType3(Hashtable<String, String> h2) throws Exception {
		extentLoggerECP = parentExtentLogger.createNode("To verify Create VAIO Dealer Type 3");
		String dealerName = h2.get("dealername");
		String dealerType = h2.get("dealertype");
		String crd = h2.get("crd");
		String vaiosegment = h2.get("vaio");
		String address1 = h2.get("address1");
		String address2 = h2.get("address2");
		String address3 = h2.get("address3");
		String city = h2.get("city");
		String state = h2.get("state");
		String zip = h2.get("zip");
		String zip_ = h2.get("zip+");
		String country = h2.get("country");
		String dealerPhoneNumber = h2.get("dealerphonenumber");
		String dpnX = h2.get("dpnx");
		String dFaxNumber = h2.get("dealerfaxnumber");
		String website = h2.get("websiteaddress");
		repo.mousehoverDealerMenu();
		repo.clickCreateDealerMenu().Wait();
		repo.Wait();
		repo.enterDealerName(dealerName);
		repo.SelectDealerType(dealerType).Wait();
		repo.enterCRD(crd);
		repo.VAIOsegment(vaiosegment).Wait();
		repo.nextButton().Wait();
		repo.Wait();
		repo.enterAdd(address1, address2, address3, city, zip, zip_).Wait();
		repo.SelectState(state).Wait();
		repo.SelectCountry(country);
		repo.DealerPhoneandFax(dealerPhoneNumber, dpnX, dFaxNumber);
		repo.DealerWebAddress(website).Wait();
		repo.submitButton();
		try {
			repo.ButtonCleansedAddress();
		} catch (Exception e) {

			repo.OriginalAddress();

			e.getMessage();
		}
		String maintainmessage = h2.get("message");
		// this will get the value of dealer name from the text box
		String getdlrname = repo.getdealerName();
		// this will get the value of dealer code from the text box
		String getdlrcode = repo.getdealercode();
		// This will get the Expected Message
		String Expected = maintainmessage + " " + getdlrname + " " + "|" + " " + getdlrcode;
		System.out.println("Expected Message found as " + Expected);
		// This will print the Actual ouput in the application
		String Actual = repo.actualHeading();
		System.out.println("Actual Message found as " + Actual);
		s_assert.assertEquals(Actual, Expected);
		s_assert.assertAll();
	}

	@DataProvider
	public Object[][] setData6() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("CreateDealerTests", "Validate VAIO Type3 dealer to be create", xls);
	}

}