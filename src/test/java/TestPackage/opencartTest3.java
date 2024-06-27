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



import Pagepackage.opencartpage;
import Pagepackage.opencartpage3;

public class opencartTest3 extends BaseTest
{
	
	opencartpage3 p1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void opencart1() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
		p1 = new opencartpage3(GenericKeywordsWithPage.driver);
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);

	}

	@Test(dataProvider="setData")
//	@Test
	public void opencart11(Hashtable<String , String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With creditials");
		s_assert = new SoftAssert();
		p1 = new opencartpage3 (GenericKeywordsWithPage.driver);
		
		
		 p1.enterUsername(h1.get("username"));
		 p1.enterPassword(h1.get("password"));
		 p1.loginButton();
		 p1.customersButton();
		 p1.customerlist();
		 p1.EditButton();
		 p1.StoreBox();
		 p1.customerGroup();
		 p1.Firstname(h1.get("FirstName"));
		 p1.Lastname(h1.get("LastName"));
		 p1.emailName(h1.get("Email"));
		 p1.customerpassword(h1.get("PassWord"));
		 p1.ConformCustmerPwd(h1.get("conformPassWord"));
		 p1.CustomerSave();
		 passLog();
		 
		 
		 
		
		
		

	}
	
	
	@DataProvider
	public Object[][] setData() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
	
		return ReadData.getData("OpenCart", "OpencartTestcases", xls);
	}
	
	

	
	

}
