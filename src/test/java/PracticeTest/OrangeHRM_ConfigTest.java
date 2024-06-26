package PracticeTest;

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

import practicepage.OrangeHRM_LoginPage;

public class OrangeHRM_ConfigTest extends BaseTest
{
	OrangeHRM_LoginPage oc;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public OrangeHRM_ConfigTest()
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
	
//	@Test(priority=0 , dataProvider="setData0")
//	public void LoginwithValidCredentials(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can login with valid credentials");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=1 , dataProvider="setData0")
//	public void LoginwithInValidCredentials(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can login with Invalid credentials");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("InvalidUserName"));
//		oc.enter_Password(h1.get("InvalidPassword"));
//		oc.click_Login();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=2 , dataProvider="setData0")
//	public void LoginAgainwithAInValidCredentials(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can login again with Invalid credentials");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("InvalidUserName"));
//		oc.enter_Password(h1.get("InvalidPassword"));
//		oc.click_Login();
//		oc.click_ForgotBtn();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=3 , dataProvider="setData0")
//	public void ClickonEmialConfiguration(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.Clickon_EmailConfig();
//		Thread.sleep(3000);
//		oc.ClearandEnter_Email(h1.get("EmialId"));
//		Thread.sleep(3000);
//		oc.Clickon_Emailsave();
//		Thread.sleep(3000);
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.Clickon_EmailConfig();
//		Thread.sleep(3000);
//		oc.Clickon_Reset();
//		Thread.sleep(5000);
//	}
//	
//	@Test(priority=4 , dataProvider="setData0")
//	public void ClickonEmialSubscription(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.Clickon_EmailSubscription();
//		Thread.sleep(3000);
//		oc.clickon_Addbtn();
//		Thread.sleep(3000);
//		oc.clickon_Addbtn();
//		Thread.sleep(3000);
//		oc.Enter_InputName(h1.get("Name"));
//		Thread.sleep(3000);
//		oc.Enter_EmailName(h1.get("Emailname"));
//		Thread.sleep(3000);
//		oc.Clickon_Emailsave();
//		Thread.sleep(5000);
//		
//	}
//	
//	@Test(priority=5 , dataProvider="setData0")
//	public void ClickonLocalization(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click on Localization");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.Clickon_Localization();
//		Thread.sleep(3000);
//		oc.Enter_CountryLanguage();
//		Thread.sleep(3000);
//		oc.Enter_DOY();
//		Thread.sleep(3000);
//		oc.Clickon_LocalSave();
//		Thread.sleep(5000);
//	}
	
	@Test(priority=6 , dataProvider="setData0")
	public void ClickonLanguagePackages(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on LanguagePackages ");
		
		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
		
		oc.enter_Username(h1.get("userName"));
		oc.enter_Password(h1.get("password"));
		oc.click_Login();
		oc.Clickon_Admin();
		oc.Clickon_Configuration();
		Thread.sleep(3000);
		oc.Clickon_LanguagePackages();
		Thread.sleep(3000);
		oc.Clickon_LPAddBtn();
		Thread.sleep(3000);
		oc.Enter_language();
		Thread.sleep(3000);
		oc.Clickon_LangSaveBox();
		Thread.sleep(10000);
	}
	
//	@Test(priority=7 , dataProvider="setData0")
//	public void ClickonModules(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click on Modules ");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.Clickon_Modules();
//		Thread.sleep(3000);
//		oc.Clickon_LeaveModule();
//		Thread.sleep(3000);
//		oc.Clickon_TimeModule();
//		Thread.sleep(3000);
//		oc.Clickon_RecruitmentModule();
//		Thread.sleep(3000);
//		oc.Clickon_PerformanceModule();
//		Thread.sleep(3000);
//		oc.Clickon_DirectoryModule();
//		Thread.sleep(3000);
//		oc.Clickon_maintananceModule();
//		Thread.sleep(3000);
//		oc.Clickon_MobileModule();
//		Thread.sleep(3000);
//		oc.Clickon_ClaimModule();
//		Thread.sleep(3000);
//		oc.Clickon_ModuleSave();
//		Thread.sleep(5000);
//	}
//	
//	
//	@Test(priority=8 , dataProvider="setData0")
//	public void ClickonSocialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click on SocialMediaAuthentication ");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.SocialMediaAuthentication();
//		oc.SocialAddBtn();
//		oc.NameInputBox(h1.get("SocialName"));
//		oc.ProviderInputBox(h1.get("ProvideURL"));
//		oc.ClientInputBox(h1.get("ClientID"));
//		oc.ClientsecretInputBox(h1.get("ClientSecret"));
//		oc.Clickon_SocialSave();
//		Thread.sleep(15000);
//	}
//	
//	@Test(priority=9 , dataProvider="setData0")
//	public void ClickAgainOnSocialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click Again on SocialMediaAuthentication ");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.SocialMediaAuthentication();
//		oc.Clickon_EditBtn();
//		Thread.sleep(3000);
//		oc.EditNameInputBox(h1.get("UpdateSocialName"));
//		oc.EditProviderInputBox(h1.get("UpdateProvideURL"));
//		oc.EditClientInputBox(h1.get("UpdateClientID"));
//		oc.EditClientsecretInputBox(h1.get("UpdateClientSecret"));
//		oc.Clickon_SocialSave();
//		Thread.sleep(15000);
//	}
//	
//	@Test(priority=10 , dataProvider="setData0")
//	public void ClickonRegisterOAuthClient(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP = parentExtentLogger.createNode("user can click Again on RegisterOAuthClient ");
//		
//		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
//		
//		oc.enter_Username(h1.get("userName"));
//		oc.enter_Password(h1.get("password"));
//		oc.click_Login();
//		oc.Clickon_Admin();
//		oc.Clickon_Configuration();
//		Thread.sleep(3000);
//		oc.RegisterOAuthClient();
//		oc.OAuthAddbtn();
//		oc.Enter_OAuthInputName(h1.get("OAuthName"));
//		oc.Enter_RedirectURIName(h1.get("RequiredURI"));
//		oc.OAuthSavebtn();
//		Thread.sleep(15000);
//	}
}
