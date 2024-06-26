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

public class SpecialOrangeHrmLoginTest6 extends BaseTest
{
	SpecialOrangeHrmLoginPage6 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	public void SpecialOrangeHrmLoginPage6() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new SpecialOrangeHrmLoginPage6(GenericKeywordsWithPage.driver);
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
		SpecialOrangeHrmLoginPage6();
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
		s1.clicklocalization();
		passLog();
		s1.clicklanguage();
		passLog();
		s1.clickselectlanguage();
		passLog();
		s1.enterdate();
		passLog();
		s1.savebutton();
		passLog();


	}

	@DataProvider
	public Object[][] setData1() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("SpecialOrangeHrm3", "OrangeHRM_TESTCASES", xls);	
	}
}