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

import OrangeHRM_ConfigPage.OrangeHRM_LoginCases;

public class OrangeHRM_LoginTest extends BaseTest
{
	OrangeHRM_LoginCases lc;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_LoginTest()
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
		
		lc = new OrangeHRM_LoginCases(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("userName"));
		lc.enter_Password(h1.get("password"));
		lc.click_Login();
		Thread.sleep(5000);
	}
	
	@Test(priority=1 , dataProvider="setData0")
	public void LoginwithInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login with Invalid credentials");
		
		lc = new OrangeHRM_LoginCases(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("InvalidUserName"));
		lc.enter_Password(h1.get("InvalidPassword"));
		lc.click_Login();
		Thread.sleep(5000);
	}
	
	@Test(priority=2 , dataProvider="setData0")
	public void LoginAgainwithAInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login again with Invalid credentials");
		
		lc = new OrangeHRM_LoginCases(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("InvalidUserName"));
		lc.enter_Password(h1.get("InvalidPassword"));
		lc.click_Login();
		lc.click_ForgotBtn();
		Thread.sleep(5000);
	}

}
