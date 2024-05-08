package OrangeHRM_configfTest;

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

public class OrangeHRM_EmailConfigTest extends BaseTest
{
	
	OrangeHRM_EmailConfigPage ec;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_EmailConfigTest()
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@DataProvider
	public Object[][] setData0() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_ConfigTestCases", xls);
	}
	
	@Test(priority=3, dataProvider="setData0")
	public void ClickonEmialConfiguration(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
		
		ec = new OrangeHRM_EmailConfigPage(GenericKeywordsWithPage.driver);
		
		ec.enter_Username(h1.get("userName"));
		passLog("username entered");
		ec.enter_Password(h1.get("password"));
		passLog("password entered");
		ec.click_Login();
		passLog("user logged in");
		Thread.sleep(5000);
		ec.Clickon_Admin();
		passLog("clicked on admin");
		ec.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		ec.Clickon_EmailConfig();
		passLog("cliked on email configuration");
		Thread.sleep(3000);
		ec.ClearandEnter_Email(h1.get("EmialId"));
		passLog("data clear and data entered");
		Thread.sleep(3000);
		ec.Clickon_Save();
		passLog("clicked on save");
		Thread.sleep(3000);
		ec.Clickon_Configuration();
		passLog("again clicked on email configuratioon");
		Thread.sleep(3000);
		ec.Clickon_EmailConfig();
		passLog("again cliked on email configuration");
		Thread.sleep(3000);
		ec.Clickon_Reset();
		passLog("clicked on reset");
		Thread.sleep(5000);
	}

}
