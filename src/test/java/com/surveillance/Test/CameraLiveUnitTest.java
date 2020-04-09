package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.CameraPage;
import com.surveillance.pages.HomePage;
import com.surveillance.pages.UserInformationPage;
import com.surveillance.pages.ViewAllUsersPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class CameraLiveUnitTest extends BaseTest
{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	CameraPage cameraPage =new CameraPage();
	
	public CameraLiveUnitTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	public void tillGotoLiveUnit() throws Throwable
	{
		homePage.clickOnCameras();
		passLog();
		cameraPage.clickOnLiveUnit();
		passLog();
		Thread.sleep(5000);
		cameraPage.clickOnSubLiveUnit();
//		cameraPage.clickOnSubLiveUnit();
		passLog();
		Thread.sleep(5000);
		cameraPage.clickOnCameraLink();
//		cameraPage.clickOnCameraLink();
		passLog();
		cameraPage.clickOnAdditionalButtons();
		passLog();
		cameraPage.clickOnGoToLiveUnit();
		passLog();
	
	}
	
	@Test(priority =0, dataProvider = "setData1")
	public void verifyPopUpCancelButton(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  Popup window cancel option");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		cameraPage.clickOnDeactive();
		Thread.sleep(5000);
		cameraPage.DismisOrActivePopUp("dismiss");
		Thread.sleep(10000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyDeActiveButton()==true);
		s_assert.assertAll();
				
	}
	@Test(priority = 1, dataProvider = "setData1")
	public void verifyCameraLiveUnitDeactive(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit to Deactive");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		String serialNumber=cameraPage.getSerialNumber();
		cameraPage.clickOnDeactive();
		Thread.sleep(5000);

		cameraPage.enterSerialNumber(serialNumber);
		Thread.sleep(10000);
//		cameraPage.DismisOrActivePopUp(h2.get("ActivePopUps"));
		Thread.sleep(10000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyActiveButton()==true);
		s_assert.assertAll();
		
		}
	
	
	
	@Test(priority = 2, dataProvider = "setData1",dependsOnMethods="verifyCameraLiveUnitDeactive")
	public void verifyCameraLiveUnitToActive(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit to Active");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		String serialNumber=cameraPage.getSerialNumber();
		cameraPage.clickOnActive();
		Thread.sleep(5000);

		cameraPage.enterSerialNumber(serialNumber);
		Thread.sleep(10000);
//		cameraPage.DismisOrActivePopUp(h2.get("ActivePopUps"));
		Thread.sleep(10000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyDeActiveButton()==true);
		s_assert.assertAll();
			
	}
	
	@Test(priority = 3, dataProvider = "setData1",dependsOnMethods="verifyCameraLiveUnitDeactive")
	public void verifyCameraLiveUnitInvoiceDataReport(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit Invoice Data Report");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		cameraPage.clickOnInvoiceDataReport();
		cameraPage.verifyInvoicePage();
		cameraPage.clickOnReturntoLiveUnit();
		
		s_assert.assertTrue(cameraPage.verifyInvoiceDataReport()==true);
		s_assert.assertAll();
			
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("LiveUnits", "CameraLiveUnits", xls);
	}
	}
