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

public class OpenCartTest4 extends BaseTest
{
	OpenCartPage4 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OpenCartPage4() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new OpenCartPage4(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	@Test(dataProvider = "setData1")
	public void OpenCartPage4(Hashtable<String , String> h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		OpenCartPage4();
		s1.enterUsername(h1.get("UserName"));
		passLog("enterUsername");
		s1.enterPassword(h1.get("Password"));
		passLog("enterPassword");
		s1.clickbutton();
		passLog("login");
		passLog("user clicked on login");
		Thread.sleep(5000);
		s1.clickdemo();
		passLog("clicked on demo");
		s1.clickon_Profile();
		passLog("clickonprofile");
		s1.enterdata_Username(h1.get("UserName1"));
		passLog("Enter UserName");
		s1.enterdata_firstname(h1.get("FirstName"));
		passLog("Enter firstName");
		s1.enterdata_lastname(h1.get("LastName"));
		passLog("Enter LastName");
		s1.enterdata_Email(h1.get("Email"));
		passLog("Enter email id");
		s1.clickandadd_Image();
		passLog("click and add Image");
		s1.enter_CustPwd(h1.get("Password1"));
		passLog("user Entered Password");
		Thread.sleep(3000);
		s1.enter_CofrmCustPwd(h1.get("ConfirmPassword"));
		passLog("user Entered Conform Password");
		Thread.sleep(3000);
		
		
}
	
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OpenCart", "OpenCartTestCases2", xls);	
	}
}
