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
	
	@Test(priority=12, dataProvider="setData0")
	public void EnterCredentialsinLDAPConfig(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
		
		lc = new OrangeHRM_LDAPConfigPage(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("userName"));
		passLog("username entered");
		lc.enter_Password(h1.get("password"));
		passLog("password entered");
		lc.click_Login();
		passLog("clicked on login");
		lc.Clickon_Admin();
		passLog("clicked on admin");
		lc.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		lc.Clickon_LDAPConfig();
		passLog("clicked on Ldap");
		Thread.sleep(3000);
		lc.Enter_HostName(h1.get("HostName"));
		passLog("hostname entered");
		lc.Enter_PortBox(h1.get("Port"));
		passLog("entered post");
		lc.Clickon_Encryption();
		passLog("clicked on encryption");
		lc.Clickon_TLS();
		passLog("clicked on TLS");
		lc.Clickon_OpenLDAP();
		passLog("clicked on openLDAP");
		lc.Clickon_Implementation();
		passLog("clicked on implementation");
		lc.Clickon_DistinguishedName(h1.get("Distinguished"));
		passLog("entered distinguishedname");
		lc.Clickon_PasswordName(h1.get("passwordname"));
		passLog("passwordname entered");
		lc.Clickon_BaseDistinguishedName(h1.get("BaseDistinguished"));
		passLog("basename entered");
		lc.Clickon_Subtree();
		passLog("clicked on subtree");
		lc.Clickon_OneLevelName();
		passLog("clicked on one level");
		lc.Enter_UserAttributeName(h1.get("UserAttribute"));
		passLog("username entered");
		lc.Enter_UserSearchBox(h1.get("UserSearch"));
		passLog("usersearch entered");
		lc.Enter_UserUniqueBox(h1.get("UserUnique"));
		passLog("userunique entered");
		lc.Enter_FirstName(h1.get("FirstName"));
		passLog("firstname entered");
		lc.Enter_MiddleName(h1.get("Middlename"));
		passLog("middlename entered");
		lc.Enter_LastName(h1.get("LastName"));
		passLog("lastname entered");
		lc.Enter_UserStatusBox(h1.get("StatusBox"));
		passLog("statusbox entered");
		lc.Enter_WorkEmailBox(h1.get("WorkemailBox"));
		passLog("workemain entered");
		lc.Enter_EmployIdBox(h1.get("EmployIdBox"));
		passLog("employid entered");
		lc.Enter_SyncIntervalBox(h1.get("SyncBox"));
		passLog("sync interval entered");
		Thread.sleep(3000);
		lc.Clickon_Save();
		passLog("clicked on save");
		Thread.sleep(15000);
		
	}

}
