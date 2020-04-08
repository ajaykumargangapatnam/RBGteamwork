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
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void verifyCameraLiveUnit(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest verifyCameraLiveUnit");
		loginTest.logintest(h2);
		passLog();
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
		cameraPage.clickOnDeactive();
		Thread.sleep(5000);

		cameraPage.enterSerialNumber(h2.get("SerialNumber"));
		Thread.sleep(10000);
//		cameraPage.DismisOrActivePopUp(h2.get("ActivePopUps"));
		Thread.sleep(10000);
		passLog();
		
		
		
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("LiveUnits", "CameraLiveUnits", xls);
	}
	
}
