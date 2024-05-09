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
import OrangeHRM_JobPage.OrangeHRM_JobTitlePage;
import OrangeHRM_JobPage.OrangeHRM_PayGradesPage;

public class OrangeHRM_PayGradeTest extends BaseTest
{
	OrangeHRM_PayGradesPage op;
	OrangeHRM_EmailConfigPage ep;
	OrangeHRM_JobTitlePage oj;
	
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	
	public OrangeHRM_PayGradeTest()
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@Test(priority = 1, dataProvider="setData")
	public void ClickandEnterinJobPayGrade(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP=parentExtentLogger.createNode("User click and enter data in pay grade");
		
		op = new OrangeHRM_PayGradesPage(GenericKeywordsWithPage.driver);
		
		ep = new OrangeHRM_EmailConfigPage(GenericKeywordsWithPage.driver);
		
		oj= new OrangeHRM_JobTitlePage(GenericKeywordsWithPage.driver);
		
		ep.enter_Username(h1.get("UserName"));
		passLog("username entered");
		ep.enter_Password(h1.get("Password"));
		passLog("password entered");
		ep.click_Login();
		passLog("clicked on login");
		ep.Clickon_Admin();
		passLog("clicked on Admin");
		oj.clickon_Job();
		passLog("clicked on Job");
		op.Clickon_PayGrade();
		passLog("clicked on playgrade");
		op.Clickon_AddBtn();
		passLog("clicked on add");
		op.Enterdata_NameBox(h1.get("PayName"));
		passLog("name is entered");
		op.Clickon_Save();
		passLog();
		Thread.sleep(10000);
		s_assert.assertAll();
		
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+ "/TestData/testdata.xlsx");
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_Job", xls);
	}

}
