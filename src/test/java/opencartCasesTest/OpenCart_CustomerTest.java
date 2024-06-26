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
import opencartCasesPage.Opencart_Customers;

public class OpenCart_CustomerTest extends BaseTest
{
	OpenCart_LoginPage lp;
	Opencart_Customers op;
	PropertySingleton _instance ;
	SoftAssert s_Assert = new SoftAssert();
	
	public OpenCart_CustomerTest()
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
	public void UserClickonCustomers(Hashtable<String, String>h1) throws Throwable
	{
        extentLoggerECP = parentExtentLogger.createNode("User Click And Enter Details");
        
        lp = new OpenCart_LoginPage(GenericKeywordsWithPage.driver);
		op = new Opencart_Customers(GenericKeywordsWithPage.driver);
		lp.enter_Username(h1.get("UserName"));
		passLog("user enter the username");
		lp.enter_Password(h1.get("Password"));
		passLog("user enter the password");
		lp.clickon_Login();
		passLog("user clicked on login");
		Thread.sleep(5000);
		op.clickon_Customers();
		passLog("user clicked on customer");
		Thread.sleep(3000);
		op.clickon_DownCustomers();
		passLog("user clicked on Downcustomer");
		Thread.sleep(3000);
		op.clickon_EditBtn();
		passLog("user clicked on Edit");
		Thread.sleep(3000);
		op.enter_Firstname(h1.get("FirstName"));
		passLog("user Entered Firstname");
		Thread.sleep(3000);
		op.enter_Lastname(h1.get("LastName"));
		passLog("user Entered lastname");
		Thread.sleep(3000);
		op.enter_CustPwd(h1.get("CustomersPassword"));
		passLog("user Entered Password");
		Thread.sleep(3000);
		op.enter_CofrmCustPwd(h1.get("ConfirmPassword"));
		passLog("user Entered Conform Password");
		Thread.sleep(3000);
		op.clickon_CustSave();
		passLog("user clicked on save");
		Thread.sleep(3000);
	}
	

}
