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

public class SpecialOrangeHrmLoginTest10 extends BaseTest
{
	SpecialOrangeHrmLoginPage10 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	public void SpecialOrangeHrmLoginPage10() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new SpecialOrangeHrmLoginPage10(GenericKeywordsWithPage.driver);
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
		
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_ConfigTestCases", xls);
	}
		
		@Test(priority=12, dataProvider="setData0")
		public void EnterCredentialsinLDAPConfig(Hashtable<String, String>h1) throws Throwable
		{
			extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
			
			SpecialOrangeHrmLoginPage10();
			
			s1.enter_Username(h1.get("userName"));
			passLog();
			s1.enter_Password(h1.get("password"));
			passLog();
			s1.click_Login();
			passLog();
			s1.Clickon_Admin();
			passLog();
			s1.Clickon_Configuration();
			passLog();
			Thread.sleep(3000);
			passLog();
			s1.Clickon_LDAPConfig();
			passLog();
			Thread.sleep(3000);
			s1.Enter_HostName(h1.get("HostName"));
			passLog();
			s1.Enter_PortBox(h1.get("Port"));
			passLog();
			s1.Clickon_Encryption();
			passLog();
			s1.Clickon_TLS();
			passLog();
			s1.Clickon_OpenLDAP();
			passLog();
			s1.Clickon_Implementation();
			passLog();
			s1.Clickon_DistinguishedName(h1.get("Distinguished"));
			passLog();
			s1.Clickon_PasswordName(h1.get("passwordname"));
			passLog();
			s1.Clickon_BaseDistinguishedName(h1.get("BaseDistinguished"));
			passLog();
			s1.Clickon_Subtree();
			passLog();
			s1.Clickon_OneLevelName();
			passLog();
			s1.Enter_UserAttributeName(h1.get("UserAttribute"));
			passLog();
			s1.Enter_UserSearchBox(h1.get("UserSearch"));
			passLog();
			s1.Enter_UserUniqueBox(h1.get("UserUnique"));
			passLog();
			s1.Enter_FirstName(h1.get("FirstName"));
			passLog();
			s1.Enter_MiddleName(h1.get("Middlename"));
			passLog();
			s1.Enter_LastName(h1.get("LastName"));
			passLog();
			s1.Enter_UserStatusBox(h1.get("StatusBox"));
			passLog();
			s1.Enter_WorkEmailBox(h1.get("WorkemailBox"));
			passLog();
			s1.Enter_EmployIdBox(h1.get("EmployIdBox"));
			passLog();
			s1.Enter_SyncIntervalBox(h1.get("SyncBox"));
			passLog();
			s1.Clickon_Save();
			Thread.sleep(15000);
			passLog();

}
		
	}