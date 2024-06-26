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

import opencartCasesPage.OpenCart_Catalogs;
import opencartCasesPage.OpenCart_LoginPage;
import opencartCasesPage.OpenCart_ProfilePage;
import opencartCasesPage.Opencart_Customers;

public class OpenCart_ProfileEditTest extends BaseTest
{
	OpenCart_LoginPage ol;
	OpenCart_ProfilePage pp;
	Opencart_Customers cp;
	OpenCart_Catalogs oc;
	PropertySingleton _instance ;
	SoftAssert s_Assert = new SoftAssert();
	
	
	public OpenCart_ProfileEditTest()
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
	
	@Test(dataProvider="setData0")
	public void userClickon_Profile(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("User click on the ProfilePage");
		
		ol = new OpenCart_LoginPage(GenericKeywordsWithPage.driver);
		pp = new OpenCart_ProfilePage(GenericKeywordsWithPage.driver);
		cp = new Opencart_Customers(GenericKeywordsWithPage.driver);
		oc = new OpenCart_Catalogs(GenericKeywordsWithPage.driver);
		
		ol.enter_Username(h1.get("UserName"));
		passLog("user enter the username");
		ol.enter_Password(h1.get("Password"));
		passLog("user enter the password");
		ol.clickon_Login();
		passLog("user click on login");
		pp.clickon_Demo();
		Thread.sleep(3000);
		passLog();
		pp.clickon_Profile();
		Thread.sleep(3000);
		passLog();
		pp.enterdata_Username(h1.get("username"));
		Thread.sleep(3000);
		passLog();
		cp.enter_Firstname(h1.get("firstname"));
		Thread.sleep(3000);
		passLog();
		cp.enter_Lastname(h1.get("lastname"));
		Thread.sleep(3000);
		passLog();
		pp.enterdata_Email(h1.get("email"));
		Thread.sleep(3000);
		passLog();
		oc.clickandadd_Image();
		Thread.sleep(3000);
		passLog();
		cp.enter_CustPwd(h1.get("CustomersPassword"));
		Thread.sleep(3000);
		passLog();
		cp.enter_CofrmCustPwd(h1.get("ConfirmPassword"));
		Thread.sleep(3000);
		passLog();
		cp.clickon_CustSave();
		Thread.sleep(3000);
		passLog();
		
	}
}
