package PracticeTest;

import java.util.Hashtable;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import practicepage.OrangeHRM_Login;

public class OrangeHRM_Test extends BaseTest
{
	OrangeHRM_Login o1;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@Test(dataProvider="setData1")
	public void loginWithValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_Assert = new SoftAssert();
		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
		
		o1.enter_Username(h1.get("userName"));
		passLog();
		o1.enter_Password(h1.get("password"));
		passLog();
		o1.click_Login();
		passLog();
		
		endReport();
		
	}
	
    @DataProvider
	public Object[][] setData1() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("OrangeHRM", "OrangeHRM_TESTCASES", xls);
	}
    
}
