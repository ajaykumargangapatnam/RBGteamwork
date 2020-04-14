package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.LoginPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class LoginTest extends BaseTest{
	LoginPage login=new LoginPage();
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public LoginTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	
	@Test(priority = 0, dataProvider = "setData1")
	public void logintest(Hashtable<String, String> h2) throws Exception 
	{
		extentLoggerECP = parentExtentLogger.createNode("Login Test");
		System.out.println("userEmail "+h2.get("Email"));
		login.enterLoginEmail(h2.get("Email"));
		
		login.clickOnLogin();
		
		login.enterPassword(h2.get("Password"));
		
		login.clickOnLogin();
		
		
		
		
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("Logintest", "LoginTC", xls);
	}


}
