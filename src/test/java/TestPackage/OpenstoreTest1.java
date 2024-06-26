package TestPackage;



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

import Pagepackage.OpenStore1;
import Pagepackage.OpenStorepage2;
import Pagepackage.opencartpage;
import Pagepackage.opencartpage2;


public class OpenstoreTest1 extends BaseTest
{
	
	OpenStore1 p1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void opencart1() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
		p1 = new OpenStore1(GenericKeywordsWithPage.driver);
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);

	}

	@Test(dataProvider="setData")
	//@Test
	public void opencart11(Hashtable<String, String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With creditials");
		s_assert = new SoftAssert();
		p1 = new OpenStore1 (GenericKeywordsWithPage.driver);
		
	p1.accountButton();
	p1.loginButton1();
	p1.emailBox(h1.get("Email"));
	p1.passwordBox(h1.get("Password"));
	p1.loginButton();
		 
		
		
		

	}
	
	
	@DataProvider
	public Object[][] setData() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OpenStore", "OPENSTORETESTCASES", xls );
	}
	
	
	
	
	

}
