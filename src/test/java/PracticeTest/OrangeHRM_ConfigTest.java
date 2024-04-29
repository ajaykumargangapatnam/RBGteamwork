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
	
	@Test(priority=0 , dataProvider="setData0")
	public void LoginwithValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login with valid credentials");
		
		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
		
		oc.enter_Username(h1.get("userName"));
		oc.enter_Password(h1.get("password"));
		oc.click_Login();
		Thread.sleep(5000);
	}
	
	@Test(priority=1 , dataProvider="setData0")
	public void LoginwithInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login with Invalid credentials");
		
		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
		
		oc.enter_Username(h1.get("InvalidUserName"));
		oc.enter_Password(h1.get("InvalidPassword"));
		oc.click_Login();
		Thread.sleep(5000);
	}
	
	@Test(priority=2 , dataProvider="setData0")
	public void LoginAgainwithAInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login again with Invalid credentials");
		
		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
		
		oc.enter_Username(h1.get("InvalidUserName"));
		oc.enter_Password(h1.get("InvalidPassword"));
		oc.click_Login();
		oc.click_ForgotBtn();
		Thread.sleep(5000);
	}
	
	@Test(priority=3 , dataProvider="setData0")
	public void ClickonEmialConfiguration(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
		
		oc = new OrangeHRM_LoginPage(GenericKeywordsWithPage.driver);
		
		oc.enter_Username(h1.get("userName"));
		oc.enter_Password(h1.get("password"));
		oc.click_Login();
		oc.Clickon_Admin();
		oc.Clickon_Configuration();
		oc.Clickon_EmailConfig();
		oc.Clear_Email(h1.get("EmialId"));
		Thread.sleep(5000);
	}
	
}
