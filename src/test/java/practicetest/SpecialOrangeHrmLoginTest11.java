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

public class SpecialOrangeHrmLoginTest11 extends BaseTest
{
	SpecialOrangeHrmLoginPage11 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	public void SpecialOrangeHrmLoginPage11() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new SpecialOrangeHrmLoginPage11(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	@DataProvider
	public Object[][] setData0() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("SpecialOrangeHrm", "OrangeHRM_TESTCASES2", xls);
	}
		
		@Test(dataProvider="setData0")
		public void EnterCredentialsinLDAPConfig(Hashtable<String, String>h1) throws Throwable
		{
			extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
			
			SpecialOrangeHrmLoginPage11();
			
			s1.enter_Username(h1.get("username"));
			passLog();
			s1.enter_Password(h1.get("password"));
			passLog();
			s1.click_Login();
			passLog();
			s1.clickadmin();
			passLog(); 
			s1.clickqualifications();
			passLog();
			s1.clickskill();
			passLog();
			s1.addbutton();
			passLog();
			s1.skillname(h1.get("Name"));
			passLog();
			s1.enterdescription(h1.get("Description"));
			passLog();
			s1.clicksave();
			passLog();

}
		
	}