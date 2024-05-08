package OrangeHRM_NationalTest;

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

import OrangeHRM_NationalPage.OrangeHRM_Nationalities;

public class OrangeHRM_NationalitiesTest extends BaseTest
{
	OrangeHRM_Nationalities on;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_NationalitiesTest()
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
		
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_Nationalities", xls);
	}
	
	@Test(priority=0, dataProvider="setData0")
	public void LoginWithValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can login with Valid Credentials");
		
		on = new OrangeHRM_Nationalities(GenericKeywordsWithPage.driver);
		
		on.Enter_Username(h1.get("UserName"));
		passLog();
		on.Enter_Password(h1.get("Password"));
		passLog();
		on.Clickon_Login();
		passLog();
		Thread.sleep(5000);
	}
	
	@Test(priority=1, dataProvider="setData0")
	public void LoginWithInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user cannot login with InValid Credentials");
		
		on = new OrangeHRM_Nationalities(GenericKeywordsWithPage.driver);
		
		on.Enter_Username(h1.get("InvalidUserName"));
		passLog();
		on.Enter_Password(h1.get("Invalidpassword"));
		passLog();
		on.Clickon_Login();
		passLog();
		Thread.sleep(5000);
	}
	
	@Test(priority=2, dataProvider="setData0")
	public void LoginWithAgainInValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user cannot login with InValid Credentials and click forgotBtn");
		
		on = new OrangeHRM_Nationalities(GenericKeywordsWithPage.driver);
		
		on.Enter_Username(h1.get("InvalidUserName"));
		passLog();
		on.Enter_Password(h1.get("Invalidpassword"));
		passLog();
		on.Clickon_Login();
		passLog();
		on.Clickon_ForgotPassword();
		passLog();
		Thread.sleep(5000);
	}
	
	@Test(priority=3, dataProvider="setData0")
	public void ClickonNationalities(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user click on Nationalities");
		
		on = new OrangeHRM_Nationalities(GenericKeywordsWithPage.driver);
		
		on.Enter_Username(h1.get("UserName"));
		passLog();
		on.Enter_Password(h1.get("Password"));
		passLog();
		on.Clickon_Login();
		passLog();
		on.Clickon_AdminBtn();
		passLog();
		on.Clickon_NAtionalities();
		passLog();
		on.Clickon_AddBtn();
		passLog();
		on.Enter_Name(h1.get("CountryName1"));
		passLog();
		on.Clickon_SaveBtn();
		passLog();
		on.Clickon_NAtionalities();
		passLog();
		on.Clickon_AddBtn();
		passLog();
		on.Enter_Name(h1.get("CountryName2"));
		passLog();
		on.Clickon_SaveBtn();
		passLog();
		Thread.sleep(5000);
	}

}
