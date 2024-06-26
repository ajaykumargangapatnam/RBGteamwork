package opencartCasesTest;

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

import opencartCasesPage.OpenCart_LoginPage;
import opencartCasesPage.OpenCart_LogoutPage;

public class OpenCart_LogoutTest extends BaseTest
{
	OpenCart_LoginPage ol;
	OpenCart_LogoutPage lt;
	PropertySingleton _instance ;
	SoftAssert s_Assert = new SoftAssert();
	
	public OpenCart_LogoutTest()
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
		
		return ReadData.getData("OpenCart_TestCases", "OPENCART_ALLTESTCASES", xls);
	}
	
	@Test(priority = 0 , dataProvider="setData0")
	public void enterValidDetails(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("User enter Details And Logout");
		
		ol = new OpenCart_LoginPage(GenericKeywordsWithPage.driver);
		lt = new OpenCart_LogoutPage(GenericKeywordsWithPage.driver);
		
		ol.enter_Username(h1.get("UserName"));
		passLog("user enter the username");
		ol.enter_Password(h1.get("Password"));
		passLog("user enter the password");
		ol.clickon_Login();
		passLog("user click on login");
		Thread.sleep(5000);
		lt.clickon_LogOut();
		passLog("user click on logOut");
		Thread.sleep(5000);
	}

}
