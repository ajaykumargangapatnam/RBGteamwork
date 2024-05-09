package OrangeHRM_JobTest;

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

import OrangeHRM_ConfigPage.OrangeHRM_EmailConfigPage;
import OrangeHRM_ConfigPage.OrangeHRM_LoginCases;
import OrangeHRM_JobPage.OrangeHRM_JobTitlePage;

public class OrangeHRM_JobTiltleTest extends BaseTest
{
	OrangeHRM_JobTitlePage oj;
	OrangeHRM_LoginCases lc;
	OrangeHRM_EmailConfigPage ec;
	
	PropertySingleton _instance =null;
	SoftAssert s_assert = new SoftAssert();
	
	public OrangeHRM_JobTiltleTest()
	{
		_instance= PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+ "/TestData/testdata.xlsx");
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_Job", xls);
	}
	
	@Test(priority= 0 , dataProvider="setData")
	public void ClickAndEnterDatainJobBtn(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user able to click and enter data in jobtitle");
		 
		oj=new OrangeHRM_JobTitlePage(GenericKeywordsWithPage.driver); 
		
		lc= new OrangeHRM_LoginCases(GenericKeywordsWithPage.driver);
		
		ec = new OrangeHRM_EmailConfigPage(GenericKeywordsWithPage.driver);
		
		lc.enter_Username(h1.get("UserName"));
		passLog("username entered");
		lc.enter_Password(h1.get("Password"));
		passLog("password entered");
		lc.click_Login();
		passLog("clicked on login");
		Thread.sleep(5000);
		ec.Clickon_Admin();
		passLog("clicked on Admin");
		oj.clickon_Job();
		passLog("clicked on Job");
		oj.clickon_JobTitles();
		passLog("clicked on Jobtitle");
		oj.clickon_Add();
		passLog("clicked on add");
		oj.Enter_JobTilte(h1.get("JobTitle"));
		passLog("jobtitle entered");
		oj.Enter_description(h1.get("JobDescription"));
		passLog("decdiption entered");
		Thread.sleep(5000);
//		oj.clickon_Browse();
//		passLog("file entered");
//		Thread.sleep(3000);
		oj.Enter_Note(h1.get("JobNote"));
		passLog("note Entered");
		oj.Clcikon_Save();
		passLog("clicked on save");
		Thread.sleep(10000);
	}

}
