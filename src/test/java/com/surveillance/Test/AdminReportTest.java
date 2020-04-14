package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AdminReportsPage;
import com.surveillance.pages.HomePage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AdminReportTest extends BaseTest
{
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	LoginTest logintest=new LoginTest();
	AdminReportsPage adminReportsPage=new AdminReportsPage();
	HomePage homePage=new HomePage();
	
	
	
	public AdminReportTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{ 
		beforeClassForChild(this);
	}

	
//	@Test(priority = 0, dataProvider = "setDataForSimpleEventReports")
	public void SimpleEventReports(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify HamburgerReports");
		
		logintest.logintest(h2);
		passLog();
		homePage.clickOnCommandCenter();
		passLog();
		homePage.clickOnHamburgerIcon();
		passLog();
		homePage.clickOnHamburgerIconAdmin();
		passLog();
		adminReportsPage.clickonSimpleReport();
		passLog();
		Thread.sleep(5000);
		adminReportsPage.selectStartDate(h2.get("StartDate"));
		passLog();
//		adminReportsPage.clickonstatlable();
		adminReportsPage.selectEndDate(h2.get("EndDate"));
		passLog();
		adminReportsPage.SelectQueues(h2.get("Queues"));
		passLog();
		adminReportsPage.SelectLocations(h2.get("Policies"));
		passLog();
		adminReportsPage.SelectUsers(h2.get("Users"));
		passLog();
		adminReportsPage.clickOnFetchReport();
		passLog();
		boolean actualEvents=adminReportsPage.verifyOverallTotalEvents();
		s_assert.assertEquals(actualEvents, true);
		passLog();
		boolean actualTimeAverage=adminReportsPage.verifyResolveTimeAverage();
		s_assert.assertEquals(actualTimeAverage, true);
		passLog();
		s_assert.assertAll();

			
		
	}
	
	@DataProvider
	public Object[][] setDataForSimpleEventReports() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("D3CommandCenterTest", "HamburgerReports", xls);
		
	
	}
	
	@Test(priority = 1, dataProvider = "setDataForFrequencybyLocationReport")
	public void FrequencybyLocationReport(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify HamburgerReports");
		
		logintest.logintest(h2);
		passLog();
		homePage.clickOnCommandCenter();
		passLog();
		homePage.clickOnHamburgerIcon();
		passLog();
		homePage.clickOnHamburgerIconAdmin();
		passLog();
		adminReportsPage.clickonFrequencybyLocationReport();
		passLog();
		Thread.sleep(5000);
		adminReportsPage.selectStartDate(h2.get("StartDate"));
		passLog();
//		adminReportsPage.clickonstatlable();
		adminReportsPage.selectEndDate(h2.get("EndDate"));
		passLog();
		adminReportsPage.SelectQueues(h2.get("Queues"));
		passLog();
		adminReportsPage.SelectLocations(h2.get("Policies"));
		passLog();
		adminReportsPage.SelectUsers(h2.get("Users"));
		passLog();
		adminReportsPage.clickOnFetchReport();
		passLog();
		boolean actualEvents=adminReportsPage.verifyLocationName();
		s_assert.assertEquals(actualEvents, true);
		passLog();
		boolean actualTimeAverage=adminReportsPage.verifyNumberEvents();
		s_assert.assertEquals(actualTimeAverage, true);
		boolean actualEventswithAudio=adminReportsPage.verifyEventswithAudio();
		s_assert.assertEquals(actualEventswithAudio, true);
		passLog();
		s_assert.assertAll();

			
		
	}
	
	@DataProvider
	public Object[][] setDataForFrequencybyLocationReport() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("D3CommandCenterTest", "HamburgerReports", xls);
		
	
	}
}
