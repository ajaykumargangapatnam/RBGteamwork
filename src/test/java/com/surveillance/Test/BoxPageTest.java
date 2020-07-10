package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.BoxPage;
import com.surveillance.pages.HomePage;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class BoxPageTest   extends BaseTest{

	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage =new HomePage();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	BoxPage boxpage=new BoxPage();
	
	public BoxPageTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
		
	}
	
//	@Test(priority = 0, dataProvider = "setData1")
	public void BoxPageTest1(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Box Page Test");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	boxpage.clickonHardware();
	passLog();
	boxpage.clickonBoxes();
	passLog();
	Thread.sleep(5000);
	boxpage.clickonNewBox();
	passLog();
	Thread.sleep(5000);
	boxpage.enterBoxVersion(h2.get("BoxVersion"));
	passLog();
	boxpage.enterRevisionNumber(h2.get("RevisionNumber"));
	passLog();
	boxpage.enterDescription(h2.get("Description"));
	passLog();
	boxpage.enterDocumentationURL(h2.get("DocumentationURL"));
	passLog();
	boxpage.clickonSave();
	passLog();
	}

	@Test(priority = 0, dataProvider = "setData1")
	public void BoxPageTest2(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Box Page Test for Search");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	boxpage.clickonHardware();
	passLog();
	boxpage.clickonBoxes();
	passLog();
	Thread.sleep(15000);
	boxpage.enterBoxes(h2.get("Boxes"));
	passLog();
	boxpage.clickonSearch();
	passLog();
	}
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("BoxPagetest", "Boxpage", xls);
	}
}
