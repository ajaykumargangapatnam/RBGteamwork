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

public class OpenCartTest1 extends BaseTest
{
	OpenCartPage1 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OpenCartPage1() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new OpenCartPage1(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	@Test(dataProvider = "setData1")
	public void OpenCartPage1(Hashtable<String , String> h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		OpenCartPage1();
		s1.enterUsername(h1.get("UserName"));
		passLog("enterUsername");
		s1.enterPassword(h1.get("Password"));
		passLog("enterPassword");
		s1.clickbutton();
		passLog("login");
}
	
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OpenCart", "OpenCartTestCases", xls);	
	}
}
