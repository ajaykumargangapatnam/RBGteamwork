package opencartTest;

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

import opencartPage.*;
public class OpenCartTest3 extends BaseTest
{
	OpenCartPage3 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OpenCartPage3() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new OpenCartPage3(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	@Test(dataProvider = "setData1")
	public void OpenCartPage3(Hashtable<String , String> h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		OpenCartPage3();
		s1.enterUsername(h1.get("UserName"));
		passLog("enterUsername");
		s1.enterPassword(h1.get("Password"));
		passLog("enterPassword");
		s1.clickbutton();
		passLog("login");
		passLog("user clicked on login");
		Thread.sleep(5000);
		s1.clickon_Customers();
		passLog("user clicked on customer");
		Thread.sleep(3000);
		s1.clickon_DownCustomers();
		passLog("user clicked on Downcustomer");
		Thread.sleep(3000);
		s1.clickon_EditBtn();
		passLog("user clicked on Edit");
		Thread.sleep(3000);
		s1.clickStore();
		Thread.sleep(3000);
		s1.clickcustomerGroup();
		Thread.sleep(3000);
		s1.enter_Firstname(h1.get("FirstName"));
		passLog("user Entered Firstname");
		Thread.sleep(3000);
		s1.enter_Lastname(h1.get("LastName"));
		passLog("user Entered lastname");
		Thread.sleep(3000);
		s1.enter_emailName(h1.get("Email"));
		passLog("Enter Email Id");
		Thread.sleep(4000);
		s1.enter_CustPwd(h1.get("CustomersPassword"));
		passLog("user Entered Password");
		Thread.sleep(3000);
		s1.enter_CofrmCustPwd(h1.get("ConfirmPassword"));
		passLog("user Entered Conform Password");
		Thread.sleep(3000);
		s1.clickon_CustSave();
		passLog("user clicked on save");
		Thread.sleep(3000);
		
}
	
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OpenCart", "OpenCartTestCases", xls);	
	}
}
