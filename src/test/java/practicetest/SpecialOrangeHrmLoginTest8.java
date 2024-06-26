package practicetest;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import Pagepackage.*;

public class SpecialOrangeHrmLoginTest8 extends BaseTest
{
	SpecialOrangeHrmLoginPage8 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	public void SpecialOrangeHrmLoginPage8() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new SpecialOrangeHrmLoginPage8(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}


	@Test(dataProvider = "setData1")
	public void OrangeHRMLogin(Hashtable<String , String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		SpecialOrangeHrmLoginPage8();
		s1.orusername(h1.get("username"));
		passLog();
		s1.orpassword(h1.get("password"));
		passLog();
		s1.loginbutton();
		passLog();
		s1.admin();
		passLog();
		s1.configuration();
		passLog();
		s1.socialmediaconfig();
		passLog();
		s1.clickadd();
		passLog();
		s1.entername(h1.get("Name"));
		passLog();
        s1.enterurl(h1.get("Url"));
        passLog();
        s1.enterclientid(h1.get("ClientId"));
        passLog();
        s1.enterclientserver(h1.get("Clientserver"));
        passLog();
        s1.clicksave();
        passLog();
	}

	@DataProvider
	public Object[][] setData1() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("SpecialOrangeHrm3", "OrangeHRM_TESTCASES2", xls);	
	}
}