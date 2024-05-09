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
import OrangeHRM_JobPage.OrangeHRM_employPage;

public class OrangeHRM_employTest extends BaseTest
{
	OrangeHRM_employPage ep;
	OrangeHRM_EmailConfigPage ec;
	OrangeHRM_JobTitlePage oj;
	
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_employTest()
	{
		_instance=PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Xls_Reader xls= new Xls_Reader(System.getProperty("user.dir")+"/TestData/testdata.xlsx");
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_Job", xls);
	}
	
	@Test(priority= 2, dataProvider="setData")
	public void EnterEmploymentStatusDetails(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can enter deatails in employment status");
		ep = new OrangeHRM_employPage(GenericKeywordsWithPage.driver);
		ec= new OrangeHRM_EmailConfigPage(GenericKeywordsWithPage.driver);
		oj= new OrangeHRM_JobTitlePage(GenericKeywordsWithPage.driver);
		
		ec.enter_Username(h1.get("UserName"));
		passLog("username entered");
		ec.enter_Password(h1.get("Password"));
		passLog("password entered");
		ec.click_Login();
		passLog("clicked on login");
		ec.Clickon_Admin();
		passLog("clicked on Admin");
		oj.clickon_Job();
		passLog("click on Job");
		ep.Clickon_EmploymentStatus();
		passLog("clickon employstatus");
		ep.Clickon_AddBtn();
		passLog("clicked on add");
		ep.Enter_EmployName(h1.get("Employname"));
		passLog("employname entered");
		ep.Clickon_SaveBtn();
		passLog("clicked on save");
		Thread.sleep(5000);
		
	}

}
