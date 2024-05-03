package OrangeHRM_configfTest;

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

import OrangeHRM_ConfigPage.OrangeHRM_LDAPConfigPage;

public class OrangeHRM_LDAPConfigTest extends BaseTest
{
	OrangeHRM_LDAPConfigPage lc;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_LDAPConfigTest()
	{
		_instance = PropertySingleton.getInstance();
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
	
	@Test(dataProvider="setData0")
	public void EnterCredentialsinLDAPCongig(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
		
		lc = new OrangeHRM_LDAPConfigPage(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("userName"));
		lc.enter_Password(h1.get("password"));
		lc.click_Login();
		lc.Clickon_Admin();
		lc.Clickon_Configuration();
		Thread.sleep(3000);
		lc.Clickon_LDAPConfig();
		Thread.sleep(3000);
		lc.Enter_HostName(h1.get("HostName"));
		lc.Enter_PortBox(h1.get("Port"));
		lc.Clickon_Encryption();
		lc.Clickon_TLS();
		lc.Clickon_OpenLDAP();
		lc.Clickon_Implementation();
		lc.Clickon_DistinguishedName(h1.get("Distinguished"));
		lc.Clickon_PasswordName(h1.get("passwordname"));
		lc.Clickon_BaseDistinguishedName(h1.get("BaseDistinguished"));
		lc.Clickon_Subtree();
		lc.Clickon_OneLevelName();
		lc.Enter_UserAttributeName(h1.get("UserAttribute"));
		lc.Enter_UserSearchBox(h1.get("UserSearch"));
		lc.Enter_UserUniqueBox(h1.get("UserUnique"));
		lc.Enter_FirstName(h1.get("FirstName"));
		lc.Enter_MiddleName(h1.get("Middlename"));
		lc.Enter_LastName(h1.get("LastName"));
		lc.Enter_UserStatusBox(h1.get("StatusBox"));
		lc.Enter_WorkEmailBox(h1.get("WorkemailBox"));
		lc.Enter_EmployIdBox(h1.get("EmployIdBox"));
		lc.Enter_SyncIntervalBox(h1.get("SyncBox"));
		Thread.sleep(3000);
		lc.Clickon_Save();
		Thread.sleep(15000);
		
	}

}
