package practicetest;

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

import Pagepackage.AjioLoginpage1;



public class AjioLoginTest1 extends BaseTest

{
	AjioLoginpage1 s2;
	PropertySingleton _instance=null;
	SoftAssert s_Assert = new SoftAssert();
	public AjioLoginTest1()
	{
		_instance = PropertySingleton.getInstance();
		s2 = new AjioLoginpage1(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	@Test(dataProvider="setData1")
	public void loginWithValidCredentials(Hashtable<String, String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_Assert.assertAll();
		s2 = new AjioLoginpage1(GenericKeywordsWithPage.driver);
		s2.ajiologin();
		passLog("Ajio login");
		s2.entermobilenum(h1.get("Number"));
		passLog("entermobilenum");
		s2.clicklogin();
		Thread.sleep(15000);
		passLog("clicklogin");
		s2.clickotp();
		Thread.sleep(10000);
		passLog("clickotp");
		
		
		
	}	
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		return ReadData.getData("Ajio","Ajio_TestCases" , xls);
	}
	
}
