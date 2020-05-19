package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.HomePage;
import com.surveillance.pages.LoginPage;
import com.surveillance.pages.UserInformationPage;
import com.surveillance.pages.ViewAllUsersPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class D3CommandCenterTest extends BaseTest
{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	ViewAllUsersPage viewAllUsersPage=new ViewAllUsersPage();
	UserInformationPage userInformationPage=new UserInformationPage();
	
	public D3CommandCenterTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void userAdministrator(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest "+h2.get("RoleType"));
	if(h2.get("RunMode").equalsIgnoreCase("YES"))
	{
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		viewAllUsersPage.clickOnEmailAddress(h2.get("RoleType"));
		passLog();
		userInformationPage.clickOnEdit();
		passLog();
		userInformationPage.clickOnD3CommandCenter();
		passLog();
		userInformationPage.SelectPolicie(h2.get("Policies"));
		passLog();
		userInformationPage.clickOnPolicieAdd();
		passLog();
		userInformationPage.SelectQueues(h2.get("Queues"));
		passLog();
		userInformationPage.clickOnQueuesAdd();
		passLog();
	}
	else if(h2.get("RunMode").equalsIgnoreCase("SKIP"))
	{
		throw new SkipException("Test cases are skiped");
	}
	}

	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("D3CommandCenterTest", "D3CommandCenterTest", xls);
	}
	
	
	
//	
}
